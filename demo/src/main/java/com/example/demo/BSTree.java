package com.example.demo;


import java.util.Arrays;
import java.util.List;

public class BSTree<T extends Comparable<T>> {

    private BSTNode<T> mRoot;

    public class BSTNode<T extends Comparable<T>>{
        private T key;
        private BSTNode left;
        private BSTNode right;
        private BSTNode parent;

        public BSTNode(T key, BSTNode left, BSTNode right, BSTNode parent) {
            this.key = key;
            this.left = left;
            this.right = right;
            this.parent = parent;
        }
    }

    public void preOrder(BSTNode bstNode){
        if(bstNode !=null){
            System.out.println(bstNode.key+" ");
            preOrder(bstNode.left);
            preOrder(bstNode.right);
        }
    }

    private void inOrder(BSTNode<T> tree) {
        if(tree != null) {
            inOrder(tree.left);
            System.out.print(tree.key+" ");
            inOrder(tree.right);
        }
    }

    private void postOrder(BSTNode<T> tree) {
        if (tree != null) {
            postOrder(tree.left);
            postOrder(tree.right);
            System.out.println(tree.key + " ");
        }
    }

    /*
     * 将结点插入到二叉树中
     *
     * 参数说明：
     *     tree 二叉树的
     *     z 插入的结点
     */
    private void insert(BSTree<T> bst, BSTNode<T> z) {
        int cmp;
        BSTNode<T> y = null;
        BSTNode<T> x = bst.mRoot;

        // 查找z的插入位置
        while (x != null) {
            y = x;
            cmp = z.key.compareTo(x.key);
            if (cmp < 0)
                x = x.left;
            else
                x = x.right;
        }

        z.parent = y;
        if (y==null)
            bst.mRoot = z;
        else {
            cmp = z.key.compareTo(y.key);
            if (cmp < 0)
                y.left = z;
            else
                y.right = z;
        }
    }

    /*
     * 新建结点(key)，并将其插入到二叉树中
     *
     * 参数说明：
     *     tree 二叉树的根结点
     *     key 插入结点的键值
     */
    public void insert(T key) {
        BSTNode<T> z=new BSTNode<T>(key,null,null,null);

        // 如果新建结点失败，则返回。
        if (z != null)
            insert(this, z);
    }

    public BSTNode insertNode(BSTNode root, BSTNode node) {
        // write your code here
        if(root==null){
            return node;
        }
        if(root.key.compareTo(node.key)<0){                       //这个树里面没有重复的数，所以无需考虑root.val == node.val的情况
            root.left = insertNode(root.left, node);  //待插入值肯定在左右子树的叶子几点上面
        }else{
            root.right = insertNode(root.right,node);
        }
        return root;//最后返回的root值为根节点，每次递归后就要返回当前的root值，以备上一层使用，最后返回整个树的根节点
    }


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,8,3,4,7,6,10,2,9,11);
        BSTree bsTree = new BSTree();
        list.forEach(v->{
            bsTree.insert(v);
        });
        System.out.println(bsTree.mRoot);
        bsTree.preOrder(bsTree.mRoot);

    }

//    public void insert(BSTree b,T key) {
//        BSTNode<T> z=new BSTNode<T>(key,null,null,null);
//
//        // 如果新建结点失败，则返回。
//        if (z != null)
//            insertNode(b.mRoot, z);
//    }
}
