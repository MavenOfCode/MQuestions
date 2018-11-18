package ReverseTree;

public class Main {

    public static void main(String[] args) {
        MyBinaryTree mTree = new MyBinaryTree();

        Node testNode = new Node(7);
        Node levelTwoR = new Node(10);
        Node levelTwoL = new Node(8);
        Node levelThreeFL = new Node(12);
        Node levelThreeFR = new Node(13);
        Node levelThreeL = new Node(16);
        Node levelThreeR = new Node(17);

        mTree.root = testNode;
        testNode.right = levelTwoR;
        testNode.left = levelTwoL;
        levelTwoL.left = levelThreeFL;
        levelTwoL.right = levelThreeFR;
        levelTwoR.left = levelThreeL;
        levelTwoR.right = levelThreeR;

        System.out.println(ReverseTree.printTree(testNode));
    }
}
