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

        //This variable holds the max gold totally found.
        int max = 0;
        //This variable holds the gold from a certain child.
        int goldGet = 0;

        //Copies the children of a certain node so I can do stuff with it.
        ArrayList<TreeNode> childList = root.getChildren();

        //Gets the number of children the root we've received has.
        int childs = childList.size();

        //Used to loop recursively and also to set the max gold correctly.
        int c;

        //Goes down each child path and finds the max gold..
        for (c = 0; c < childs; c++) {
            goldGet = findMaxGold(childList.get(c));
            if (goldGet > max) {
                max = goldGet;
                root.setMaxGold(max);
            }
        }

        if (c > 0) {
            return root.getMaxGold() + root.getGold();
        }
        else {
            root.setMaxGold(root.getGold());
            return root.getMaxGold();
        }
    }

    public static ArrayList<TreeNode> findMaxGoldPath(TreeNode root) {

        /*
        // Starts with the root--prints out the data.
        System.out.println(root.toString());

        // Make sure to have a loop and not make it recursive
        TreeNode lookNode = root;
        while (lookNode.getChildren().size() > 0) {

            int whereGold;


            // Look at the current children and find the one with the most gold in it's subtree
            ArrayList<TreeNode> childs = lookNode.getChildren();
            for (int i =0; i < childs.size(); i++) {

            }

        }



        // Print that child


        // Update the node to be that child and look at it's children
        */

        return null;
    }
}
