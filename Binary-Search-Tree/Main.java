import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        // prep work for the driver
        File f = new File("upc.csv");
        String[] input = GetFile.getStringFile(f);
        ArrayList<ArrayList<String>> list_ception = parseThing(input);
        File f2 = new File("input.dat");
        String[] input2 = GetFile.getStringFile(f2);
        ArrayList<ArrayList<String>> list_ception2 = parseThing(input2);
        Scanner sc = new Scanner(System.in);
        BinarySearchTree tree = new BinarySearchTree();

        driver(list_ception, list_ception2, sc, tree);
        sc.close();
    }
    public static void driver(ArrayList<ArrayList<String>> list_ception, ArrayList<ArrayList<String>> list_ception2, Scanner sc, BinarySearchTree tree){
        System.out.println("\n***************************");
        System.out.println("        TEST MENU");
        System.out.println("***************************");
        System.out.println("Press 1 to build a tree");
        System.out.println("Press 2 to walk the tree in order");
        System.out.println("Press 3 to search the tree");
        System.out.println("Press 4 to search the given input file and record times");
        System.out.println("Press 5 to exit");
        byte choice = sc.nextByte();

        if (choice == 1) { // build a tree
            tree = buildTree(list_ception);
        }
        if (choice == 2) { // tree walk
            if (tree == null){
                System.out.println("Please build a tree first");
            }
            else{
                Node root = tree.getRoot();
                tree.inOrderTreeWalk(root);
            }
        }
        if (choice == 3){ // search an ID manually
            System.out.println("Please enter UPC for search: ");
            long k = sc.nextLong();
            Node root = tree.getRoot();
            Node thing = tree.search(root,k);
            System.out.println(thing);
        }
        if (choice == 4){ // search the given input file and record times
            int l = list_ception2.size();
            long[] IDs = new long[l];
            ArrayList<String> inner_list = new ArrayList<String>();
            for(int i = 0; i<l; i++){
                inner_list = list_ception2.get(i);
                IDs[i] = Long.parseLong(inner_list.get(0));
            }
            Node root = tree.getRoot();
            for(long ID:IDs){
                long start = System.nanoTime();
                Node thing = tree.search(root,ID);
                long end = System.nanoTime();
                long total_time = end - start;
                System.out.println("\n" + thing);
                System.out.println("Time: " + total_time);
            }

        }
        if (choice == 5){
            System.exit(0);
        }
        driver(list_ception,list_ception2,sc,tree);
    }

    public static BinarySearchTree buildTree(ArrayList<ArrayList<String>> list_ception){
        ArrayList<String> outer_list = list_ception.get(0);
        Long k;
        String v;
        ArrayList<Node> nodes = new ArrayList<Node>();
        BinarySearchTree tree = new BinarySearchTree(); 
        
        // make a list of nodes
        // the input file is in sorted order 
        // need a randomizer to avoid worst case scenario
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
        for(int i = 0; i < n; i++){
            tree.insert(nodes2.get(i));
        }

        return tree;
    }

    public static ArrayList<Node> radnomizer(ArrayList<Node> nodes){
        int l = nodes.size();
        ArrayList<Node> nodes2 = new ArrayList<Node>();

        // make a temp list
        Node[] A = new Node[l];
        for(int i = 0; i < l; i ++){
            A[i] = nodes.get(i);
        }

        // make a random obj
        Random r = new Random();
        for(int i = 0; i < l; i++){
            // swap A[i] with A[random]
            int random = r.nextInt(l);
            Node temp_node = A[i];
            A[i] = A[random];
            A[random] = temp_node;
        }

        // copy temp back to nodes2
        for(int i =0; i < l; i++){
            nodes2.add(A[i]);
        }

        return nodes2;
    }


    public static ArrayList<ArrayList<String>> parseThing(String[] input){
        // break down the csv into lists in a list
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
