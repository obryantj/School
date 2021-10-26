// need the key and discriptor
// dat file is just keys for searching
// csv file has three files 
// he is looking for his input file that had two fields
// you don't need an array for the tree
// just nodes with pointers
// node objects??
// node class should point to two other nodes// insert is O(log(n))
// for best case and worst is O(n)
import java.io.File;
import java.util.ArrayList;
// import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Lab08Tester{
    public static void main(String[] args){
        File f = new File("UPC.csv");
        String[] input = GetFile.getStringFile(f);
        ArrayList<ArrayList<String>> list_ception = parseThing(input);
        Scanner sc = new Scanner(System.in);
        BinarySearchTree tree = new BinarySearchTree();
        driver(list_ception, sc, tree);
        sc.close();
        


        // ArrayList<String> outer_list = list_ception.get(0);
        // Long k;
        // String v;
        

        // ArrayList<Node> nodes = new ArrayList<Node>();

        // BinarySearchTree tree = new BinarySearchTree(); 
        // // make a tree using input file
        // int list_ception_len = list_ception.size();
        // for(int i = 0; i < list_ception_len; i++){
        //     outer_list = list_ception.get(i);
        //     k = Long.parseLong(outer_list.get(0));
        //     v = outer_list.get(2);
        //     nodes.add(new Node(k,v));
        // }


        // int n = nodes.size();
        // for(int j = 1; j < n; j++){
        //     tree.insert(nodes.get(j));
        // }

        // Node root = tree.getRoot();
        // tree.inOrderTreeWalk(root);

    }

    public static void driver(ArrayList<ArrayList<String>> list_ception, Scanner sc, BinarySearchTree tree){

        System.out.println("\nPress 1 to build a tree");
        System.out.println("Press 2 to walk the tree in order");
        System.out.println("Press 3 to search the tree");
        System.out.println("Press 4 to exit");
        byte choice = sc.nextByte();
        // BinarySearchTree tree = new BinarySearchTree();
        if (choice == 1) {
            tree = buildTree(list_ception);
        }
        if (choice == 2) {
            if (tree == null){
                System.out.println("Please build a tree first");
            }
            else{
                Node root = tree.getRoot();
                tree.inOrderTreeWalk(root);
            }
        }
        if (choice == 3){
            System.out.println("Please enter UPC for search: ");
            long k = sc.nextLong();
            Node root = tree.getRoot();
            Node thing = tree.search(root,k);
            System.out.println(thing);
        }
        if (choice == 4){
            System.exit(0);
        }
        driver(list_ception,sc,tree);
    }



    public static BinarySearchTree buildTree(ArrayList<ArrayList<String>> list_ception){
        ArrayList<String> outer_list = list_ception.get(0);
        Long k;
        String v;
        ArrayList<Node> nodes = new ArrayList<Node>();
        BinarySearchTree tree = new BinarySearchTree(); 

        // make a list of nodes
        // the input file is in sorted order big f
        // i need a randomizer

        int list_ception_len = list_ception.size();
        for(int i = 0; i < list_ception_len; i++){
            outer_list = list_ception.get(i);
            k = Long.parseLong(outer_list.get(0));
            v = outer_list.get(2);
            nodes.add(new Node(k,v));
        }

        //randomizer call
        ArrayList<Node> nodes2 = radnomizer(nodes);

        // insert the nodes into the tree
        int n = nodes.size();
        for(int j = 1; j < n; j++){
            tree.insert(nodes2.get(j));
        }

        return tree;
    }

    public static ArrayList<Node> radnomizer(ArrayList<Node> nodes){
        int l = nodes.size();
        ArrayList<Node> nodes2 = new ArrayList<Node>();

        // make a temp list
        Node[] nodes_temp = new Node[l];
        for(int i = 0; i < l; i ++){
            nodes_temp[i] = nodes.get(i);
        }

        
        // make a random obj
        Random r = new Random();
        for(int i = 0; i < l; i++){
            int temp_i = r.nextInt(l);
            Node temp_node = nodes_temp[temp_i];
            nodes_temp[i] = nodes_temp[temp_i];
            nodes_temp[temp_i] = nodes_temp[i];
        }

        // copy temp back to nodes2

        for(int i =0; i < l; i++){
            nodes2.add(nodes_temp[i]);
        }


        return nodes2;
    }

    public static ArrayList<ArrayList<String>> parseThing(String[] input){
        int l = input.length;
        ArrayList<ArrayList<String>> s_ception = new ArrayList<ArrayList<String>>();
        for(int i = 0; i < l; i++){
            String[] split_line = input[i].split(",");
            int l_split_line = split_line.length;
            ArrayList<String> inner_list = new ArrayList<String>();
            for(int j = 0; j < l_split_line; j++){
                inner_list.add(split_line[j]);
            }
            s_ception.add(inner_list);
        } 

        return s_ception;
    }


}