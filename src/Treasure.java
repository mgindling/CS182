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

        //Goes down each child path (that doesn't make sense).
        for (int c = 0; c < childs; c++) {
            goldGet = findMaxGold(childList.get(c));
        }

        //Adds gold to max and then returns it.
        max += goldGet;
        root.setMaxGold(max);
        return max;
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
