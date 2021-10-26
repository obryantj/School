import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile extends Sorts{

    // public WriteFile(String file_name, Sorts obj){
    // double time = getTime();
    // String method = getMethod();
    // writeStudentFile(file_name, obj);
    // }
    public static void writeFile(String file_name, Sorts obj){
        
        try{
            File o = new File(file_name);
            // PrintWriter pw = new PrintWriter(o);
            FileWriter fw = new FileWriter(o, true);
            fw.write(Double.toString(obj.getTime()));
            fw.write("\n");
            fw.close();
        }
        catch(IOException fnf){
            System.out.println("io exception");
        }
    }
    
}
