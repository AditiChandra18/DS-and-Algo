/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
    static class Node{
        int data;
        Node left;
        Node right;
        
        Node(int data){
            
            this.data=data;
            this.left=null;
            this.right=null;
            
        }
    }
    
    static class Binarytree{
        static int idx=-1;
         public static Node buildtree(int nodes[]){
             idx++;
             
             if(nodes[idx]==-1) return null;
             
             Node newNode= new Node(nodes[idx]);
             newNode.left= buildtree(nodes);
             newNode.right= buildtree(nodes);
             
             return newNode;
    }
    }
    
    public static int countofNodes(Node root){
        
        if(root==null) return 0; //mention return 0 
        
        int leftNodes=countofNodes(root.left);
        int rightNodes=countofNodes(root.right);
        
        return leftNodes+rightNodes+1;
        
    }
    
   
	public static void main(String[] args) {
	    int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
	    
	    Binarytree tree= new Binarytree();
	    
	    Node root=tree.buildtree(nodes);
	    
	    System.out.print(countofNodes(root));

	
	}
}
