package otus.basic.homeworks.hw11.with_star;


import java.util.ArrayList;

public class BinaryTreeSearch {

    private final ArrayList<Integer> arr;

    public BinaryTreeSearch(ArrayList<Integer> arr) {
        this.arr = arr;
    }

    public TreeNode sortedListToBinaryTreeSearch() {
        return buildTree(arr, 0, arr.size() - 1);
    }

    private TreeNode buildTree(ArrayList<Integer> list, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = left + (right - left) / 2;
        TreeNode node = new TreeNode(list.get(mid));
        node.left = buildTree(list, left, mid - 1);
        node.right = buildTree(list, mid + 1, right);
        return node;
    }
    public int find(int element, TreeNode tree) {
        if (tree == null){
            return 0;
        } else if (element > tree.value) {
            return find(element, tree.right);
        } else if (element < tree.value) {
            return find(element, tree.left);
        }
        return tree.value;
    }

}

