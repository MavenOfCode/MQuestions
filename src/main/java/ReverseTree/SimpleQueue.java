package ReverseTree;

import java.util.LinkedList;

public class SimpleQueue {
    private LinkedList<Node> data = new LinkedList<Node>();
    public void enqueue(Node node) {data.addLast(node);}
    public Node dequeue(Node node) {return data.removeFirst();}
    public Node peek() {return data.getFirst();}
    public int size() {return data.size();}
    public boolean isEmpty() {return data.isEmpty();}
}

