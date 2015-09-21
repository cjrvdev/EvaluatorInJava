package TreeElements;

/**
 * Created by usuario on 21/09/2015.
 */
public class Node {
    Node[] nodes;

    public Node() {
        nodes = new Node[2];
    }

    public Node getLeftChild (){
        return nodes[0];
    }

    public Node getRightChild (){
        return nodes[1];
    }

    public void setLeftChild(){

    }
}
