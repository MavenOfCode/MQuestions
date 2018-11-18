import ReverseTree.*;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseTreeTest {

    @Test
    public void printTreeOriginalTest() {
        MyBinaryTree mTree = new MyBinaryTree();

        Node testNode = new Node(7);
        Node levelTwoR = new Node(10);
        Node levelTwoL = new Node(8);
        Node levelThreeFL = new Node(12);
        Node levelThreeFR = new Node(13);
        Node levelThreeL = new Node(16);

        mTree.root = testNode;
        testNode.right = levelTwoR;
        testNode.left = levelTwoL;
        levelTwoL.left = levelThreeFL;
        levelTwoL.right = levelThreeFR;
        levelTwoR.left = levelThreeL;

        String expected = "12 13 16 8 10 7 ";
        String actual = ReverseTree.printTree(testNode);

        assertEquals(expected,actual);
    }

    @Test
    public void printTreeTinyTest() {
        MyBinaryTree mTree2 = new MyBinaryTree();

        Node testNode = new Node(7);
        Node levelTwoR = new Node(10);
        Node levelTwoL = new Node(8);

        mTree2.root = testNode;
        testNode.right = levelTwoR;
        testNode.left = levelTwoL;

        String expected = "8 10 7 ";
        String actual = ReverseTree.printTree(testNode);

        assertEquals(expected,actual);
    }

    @Test
    public void printTreeBalancedTest() {
        MyBinaryTree mTree3 = new MyBinaryTree();

        Node testNode = new Node(7);
        Node levelTwoR = new Node(10);
        Node levelTwoL = new Node(8);
        Node levelThreeFL = new Node(12);
        Node levelThreeFR = new Node(13);
        Node levelThreeL = new Node(16);
        Node levelThreeR = new Node(17);

        mTree3.root = testNode;
        testNode.right = levelTwoR;
        testNode.left = levelTwoL;
        levelTwoL.left = levelThreeFL;
        levelTwoL.right = levelThreeFR;
        levelTwoR.left = levelThreeL;
        levelTwoR.right = levelThreeR;

        String expected = "12 13 16 17 8 10 7 ";
        String actual = ReverseTree.printTree(testNode);

        assertEquals(expected,actual);
    }

    @Test
    public void printTreeStickTest() {
        MyBinaryTree mTree4 = new MyBinaryTree();

        Node testNode = new Node(7);
        Node levelTwoL = new Node(8);
        Node levelThreeFL = new Node(12);
        Node levelThreeR = new Node(17);

        mTree4.root = testNode;
        testNode.left = levelTwoL;
        levelTwoL.left = levelThreeFL;
        levelThreeFL.right = levelThreeR;

        String expected = "17 12 8 7 ";
        String actual = ReverseTree.printTree(testNode);

        assertEquals(expected,actual);
    }

    @Test
    public void printTreePointTest() {
        MyBinaryTree mTree5 = new MyBinaryTree();

        Node testNode = new Node(7);

        mTree5.root = testNode;

        String expected = "7 ";
        String actual = ReverseTree.printTree(testNode);

        assertEquals(expected,actual);
    }
}