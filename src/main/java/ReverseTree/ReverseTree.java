package ReverseTree;/*From other class file ReverseTree.Node.java in same package
public class ReverseTree.Node {

    public int data;
    public ReverseTree.Node left;
    public ReverseTree.Node right;

   //modified from original discussion for building test trees
   public ReverseTree.Node(int data, ReverseTree.Node left, ReverseTree.Node right){
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
 */
/*From other class file ReverseTree.SimpleQueue.java in same package
public class ReverseTree.SimpleQueue {
    private LinkedList<ReverseTree.Node> data = new LinkedList<ReverseTree.Node>();
    public void enqueue(ReverseTree.Node node) {data.addLast(node);}
    public ReverseTree.Node dequeue() {return data.removeFirst();}
    public ReverseTree.Node peek() {return data.getFirst();}
    public int size() {return data.size();}
    public boolean isEmpty() {return data.isEmpty();}
}
 */

import java.util.*;

public class ReverseTree {

    public static String  printTree(Node node){
        Stack<Node> nodePrinter = new Stack<>();
        SimpleQueue levelTracker = new SimpleQueue();

        //using StringBuffer vs. StringBuilder because it is thread-safe
        StringBuffer result = new StringBuffer();

        //only need to add the node to the queue at first and can refer to it from there
        levelTracker.enqueue(node);

        while(levelTracker.size() != 0){
            //during discussion had this at the end of the while loop instead of the start and the
            //initial nodePrinter.push(node) outside the while loop
            //through jUnit testing found this ineffective
            //testing led to changing oder of peek, push and dequeue towards the top of the while loop

            //assign node to be added to printer stack and then taken out of queue
            //this node is now evaluated and it's right/left nodes are enqueued
            //to queue if needed
            //each loop this is done to each node
            node = levelTracker.peek();
            nodePrinter.push(node);
            levelTracker.dequeue(node);

            if(node.right != null){
                levelTracker.enqueue(node.right);
            }
            if(node.left != null){
                levelTracker.enqueue(node.left);
            }
        }

        //adds all node data values to a string to return as result
        while (nodePrinter.size() !=0){
           Node value = nodePrinter.pop();
           result.append(value.data + " ");
        }
        return result.toString();
    }
}
