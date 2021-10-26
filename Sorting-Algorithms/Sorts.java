public class Sorts {
    private double total_time;
    private String method;
    private double start;
    private double end;

    public double getTime(){
        return this.total_time;
    }
    public void setTime(){
        this.total_time = this.end - this.start;
    }
    public void setStart(double start){
        this.start = start;
    }
    public void setEnd(double end){
        this.end = end;
    }
    public String getMethod(){
        return this.method;
    }
    public void setMethod(String method){
        this.method = method;
    }
    public String toString(){
        String s = "\n" + "Method: " + getMethod() + "   " + "Time: " + getTime();
        return s;
    }
}
