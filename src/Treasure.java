/*
 * Original Author: Ian Renfro
 * Date: Feb. 6, 2018
 *
 * New Author: Mark Gindling
 * Date: 2.24.2018
 * CS182 HW 5
 *
 */

import java.util.ArrayList;

public class Treasure {
    public static int findMaxGold(TreeNode root) {

        // This variable holds the max gold found throughout a certain node's children.
        int max = 0;
        // This variable holds the gold from a certain child.
        int goldGet = 0;
        // Used to loop recursively and also to set the max gold correctly.
        int c;

        // Copies the children of a certain node so I can do stuff with it.
        ArrayList<TreeNode> childList = root.getChildren();

        // Gets the number of children the root we've received has.
        int childs = childList.size();

        // Goes down each child path and finds the max gold throughout them all.
        for (c = 0; c < childs; c++) {
            goldGet = findMaxGold(childList.get(c));
            if (goldGet > max) {
                max = goldGet;
                root.setMaxGold(max);
            }
        }

        // Returns the right amount of maximum gold found in a certain node. The c == 0 case is the base case.
        if (c > 0) {
            return root.getMaxGold() + root.getGold();
        }
        else {
            root.setMaxGold(root.getGold());
            return root.getMaxGold();
        }
    }

    public static ArrayList<TreeNode> findMaxGoldPath(TreeNode root) {

        // Holds the path to the maximum gold.
        ArrayList<TreeNode> returnNodes = new ArrayList<>();

        // Starts with the root.
        returnNodes.add(root);

        //Gets the children and the size of the child array
        ArrayList<TreeNode> childList = root.getChildren();
        //Gets the size of the children array
        int childs = childList.size();

        while (childs > 0) {

            // Holds the maximum gold of the children.
            int max = 0;
            // Holds where the maximum gold of the children has been found.
            int where = 0;

            // Iterates through the child array to find the max max gold.
            for (int c = 0; c < childs; c++) {
                if (childList.get(c).getMaxGold() > max) {
                    max = childList.get(c).getMaxGold();
                    where = c;
                }
            }

            // Puts the correct node in the array list.
            returnNodes.add(childList.get(where));

            // Goes into the added child and looks at its children.
            childList = childList.get(where).getChildren();
            childs = childList.size();

        }

        // Returns the correct Array List
        return returnNodes;

    }
}
