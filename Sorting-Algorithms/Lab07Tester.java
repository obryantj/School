import java.io.File;

public class Lab07Tester{

    public static void main(String[] args){
       // array of file names
        String[] files = {"input_100.txt", "input_1000.txt", "input_5000.txt",
        "input_10000.txt", "input_50000.txt", "Input_Random.txt", "Input_ReversedSorted.txt", 
        "Input_Sorted.txt"};

        // do selection sort stuff
        System.out.println("\n" + "Selection Sort Tests:");
        for(String s:files){
            File f = new File(s);
            int[] A = GetFile.getIntFile(f);
            SelectionSort o = new SelectionSort(A);
            System.out.println("\n" + "Input File: " + f + o);
            String output_file_name = "Output_SelectionSort.txt";
            WriteFile.writeFile(output_file_name, o);
        }
        for(String s:files){
            File f = new File(s);
            int[] A = GetFile.getIntFile(f);
            RevSelectionSort o = new RevSelectionSort(A);
            System.out.println("\n" + "Input File: " + f + o);
            String output_file_name = "Output_RevSelectionSort.txt";
            WriteFile.writeFile(output_file_name, o);
        }
        // do bubble sort stuff
        System.out.println("\n" + "Bubble Sort Tests:");
        for(String s:files){
            File f = new File(s);
            int[] A = GetFile.getIntFile(f);
            BubbleSort o = new BubbleSort(A);
            System.out.println("\n" + "Input File: " + f + o);
            String output_file_name = "Output_BubbleSort.txt";
            WriteFile.writeFile(output_file_name, o);
        }
        for(String s:files){
            File f = new File(s);
            int[] A = GetFile.getIntFile(f);
            RevBubbleSort o = new RevBubbleSort(A);
            System.out.println("\n" + "Input File: " + f + o);
            String output_file_name = "Output_RevBubbleSort.txt";
            WriteFile.writeFile(output_file_name, o);
        }
        // do insertion sort stuff
        System.out.println("\n" + "Insertion Sort Tests:");
        for(String s:files){
            File f = new File(s);
            int[] A = GetFile.getIntFile(f);
            InsertionSort o = new InsertionSort(A);
            System.out.println("\n" + "Input File: " + f + o);
            String output_file_name = "Output_InsertionSort.txt";
            WriteFile.writeFile(output_file_name, o);
        }
        for(String s:files){
            File f = new File(s);
            int[] A = GetFile.getIntFile(f);
            RevInsertionSort o = new RevInsertionSort(A);
            System.out.println("\n" + "Input File: " + f + o);
            String output_file_name = "Output_RevInsertionSort.txt";
            WriteFile.writeFile(output_file_name, o);
        }
        // do merge sort stuff
        System.out.println("\n" + "Merge Sort Tests:");
        for(String s:files){
            File f = new File(s);
            int[] A = GetFile.getIntFile(f);
            MergeSort o = new MergeSort(A);
            System.out.println("\n" + "Input File: " + f + o);
            String output_file_name = "Output_MergeSort.txt";
            WriteFile.writeFile(output_file_name, o);
        }
        for(String s:files){
            File f = new File(s);
            int[] A = GetFile.getIntFile(f);
            RevMergeSort o = new RevMergeSort(A);
            System.out.println("\n" + "Input File: " + f + o);
            String output_file_name = "Output_RevMergeSort.txt";
            WriteFile.writeFile(output_file_name, o);
        }
        // do heap sort stuff
        System.out.println("\n" + "Heap Sort Tests:");
        for(String s:files){
            File f = new File(s);
            int[] A = GetFile.getIntFile(f);
            HeapSort o = new HeapSort(A);
            System.out.println("\n" + "Input File: " + f + o);
            String output_file_name = "Output_HeapSort.txt";
            WriteFile.writeFile(output_file_name, o);
        }
        for(String s:files){
            File f = new File(s);
            int[] A = GetFile.getIntFile(f);
            RevHeapSort o = new RevHeapSort(A);
            System.out.println("\n" + "Input File: " + f + o);
            String output_file_name = "Output_RevHeapSort.txt";
            WriteFile.writeFile(output_file_name, o);
        }
        // do quick sort stuff
        System.out.println("\n" + "Quick Sort Tests:");
        for(String s:files){
            File f = new File(s);
            int[] A = GetFile.getIntFile(f);
            QuickSort o = new QuickSort(A);
            System.out.println("\n" + "Input File: " + f + o);
            String output_file_name = "Output_QuickSort.txt";
            WriteFile.writeFile(output_file_name, o);
        }
        for(String s:files){
            File f = new File(s);
            int[] A = GetFile.getIntFile(f);
            RevQuickSort o = new RevQuickSort(A);
            System.out.println("\n" + "Input File: " + f + o);
            String output_file_name = "Output_RevQuickSort.txt";
            WriteFile.writeFile(output_file_name, o);
        }

    }




}