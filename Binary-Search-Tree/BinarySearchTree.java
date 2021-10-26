public class BinarySearchTree {
    private Node root;

    //constructor
    public BinarySearchTree(){

    }

    // stuff for root
    public void setRoot(Node root){
        this.root = root;
    }
    public Node getRoot(){
        return this.root;
    }

    //insertion
    // T is the binary search tree object 
    // and z is the node we want to insert
    public void insert(Node z){
        
        Node y = null;
        // make x the root node
        Node x = getRoot();
        
        // while the root node has children
        while(x != null ){ // x being null breaks things
            y = x; // set the root node to the blank node
            if(z.getID() < x.getID()){ // if z's id is less than the root id
                x = x.getLeft(); // go left
               if(x != null) y = x; // gotta change y again or the parent will be messed up
            }
            else{
                x = x.getRight(); // go right
                if (x != null) y = x; // gotta change y again or the parent will be messed up
            }
        }
        z.setParent(y); // make y the parent of z
        if(y == null && z != getRoot()){ // if y is still null // this being root also screws it up
            setRoot(z); // tree was empty so make the inserted 
                        // node the root
        }
        else if(z.getID() < y.getID()){ // if the inserted node value is less than the parent
            y.setLeft(z); // make z the left child of y
        }
        else{
            y.setRight(z); // make z the right child of y
        }
    }


    public void inOrderTreeWalk(Node x){
        if(x!= null){
            inOrderTreeWalk(x.getLeft());
            System.out.print(x.getID() + " ");
            inOrderTreeWalk(x.getRight());
        }
    }

    // iterative version
    public Node search(Node x, long k){ // k is id we are searching
        while(x != null && k != x.getID()){
            if(k < x.getID()){
                x = x.getLeft();
            }
            else{
                x = x.getRight();
            }
        }
        return x;
    }





}
