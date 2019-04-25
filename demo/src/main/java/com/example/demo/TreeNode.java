package com.example.demo;


import java.util.Arrays;
import java.util.List;

public class TreeNode {
      public int val;
      public TreeNode left, right;
      public TreeNode(int val) {
          this.val = val;
          this.left = this.right = null;
      }


      public TreeNode insertNode(TreeNode root, TreeNode node) {
          // write your code here
          if(root==null){
              return node;
          }
          if(root.val>node.val){                       //这个树里面没有重复的数，所以无需考虑root.val == node.val的情况
              root.left = insertNode(root.left, node);  //待插入值肯定在左右子树的叶子几点上面
          }else{
              root.right = insertNode(root.right,node);
          }
          return root;//最后返回的root值为根节点，每次递归后就要返回当前的root值，以备上一层使用，最后返回整个树的根节点
      }

    public void preOrder(TreeNode treeNode){
        if(treeNode !=null){
            System.out.println(treeNode.val+" ");
            preOrder(treeNode.left);
            preOrder(treeNode.right);
        }
    }

      public static void main(String[] args) {
          List<Integer> list = Arrays.asList(8,3,4,7,6,10,2,9,11);
          TreeNode treeNode = new TreeNode(5);
          list.forEach(v->{
              treeNode.insertNode(treeNode,new TreeNode(v));
          });
          treeNode.preOrder(treeNode);

      }
  }

