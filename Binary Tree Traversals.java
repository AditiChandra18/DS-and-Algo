/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.io.*;
import java.util.*;

public class Main {
   static class Node {
       int data;
       Node left;
       Node right;
 
       Node(int data) {
           this.data = data;
           this.left = null;
           this.right = null;
       }
   }
 
   static class BinaryTree {
       static int idx = -1;
       public static Node buildTree(int nodes[]) {
           idx++;
           if(nodes[idx] == -1) {
               return null;
           }
           Node newNode = new Node(nodes[idx]); 
           newNode.left = buildTree(nodes);
           newNode.right = buildTree(nodes);
           return newNode;
       }
   }
   
   public static void preorder(Node root) {
       if(root == null) {
           System.out.print(-1+" ");
           return;
       }
       System.out.print(root.data+" ");
       preorder(root.left);
       preorder(root.right);
   }
   public static void postorder(Node root) {
       if(root == null) {
           System.out.print(-1+" ");
           return;
       }
       
       postorder(root.left);
       postorder(root.right);
       System.out.print(root.data+" ");
   }
   
   public static void inorder(Node root) {
       if(root == null) {
           System.out.print(-1+" ");
           return;
       }
       
       inorder(root.left);
        System.out.print(root.data+" ");
       inorder(root.right);
      
   }
   
   public static void levelOrder(Node root){
       
       if(root == null) {
           return;
       }

       
       Queue<Node> q= new LinkedList<>();
       
       q.add(root);
       q.add(null);
       
       while(!q.isEmpty()){
           
           Node curr= q.remove();
           if(curr==null) {
               
               System.out.println();
               
               if(q.isEmpty()) break;
               else
               q.add(null);
               
           }
           else {
               System.out.print(curr.data+" ");
               if(curr.left != null) {
                   q.add(curr.left);
               }
               if(curr.right != null) {
                   q.add(curr.right);
               }
           }    
       }
   }
   

 
   public static void main(String args[]) {
       int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
       BinaryTree tree = new BinaryTree();
      
       Node root = tree.buildTree(nodes);
       System.out.println(root.data);
       preorder(root);// preorder traversal
       System.out.println();
       postorder(root); //postorder traversal
       System.out.println();
       inorder(root);// inorder traversal
        System.out.println();
       levelOrder(root);//level order traversal
       
   }
}
