public class Node {
    private long id;
    private Node left; // pointer
    private Node right; // pointer
    private String value;
    private Node parent; //pointer

    // constructor
    public Node(long id, String value){
        this.id = id;
        this.value = value;
        this.left = null;
        this.right = null;
        this.parent = null;
    }

    // right and left child stuff
    public void setLeft(Node x){
        this.left = x;
    }
    public void setRight(Node x){
        this.right = x;
    }
    public Node getLeft(){
        return this.left;
    }
    public Node getRight(){
        return this.right;
    }

    //parent stuff
    public void setParent(Node x){
        this.parent = x;
    }
    public Node getParent(){
        return this.parent;
    }


    //id and value stuff
    public void setID(int id){
        this.id = id;
    }
    public void setValue(String value){
        this.value = value;
    }
    public long getID(){
        return this.id;
    }
    public String getValue(){
        return this.value;
    }

    //overwrite to string
    public String toString(){
        String s = "\nID: " + getID() + " Value: " + getValue();
        return s;
    }

}
