
public class Tire {
    private String name;
    private int id;
    private static int nextid = 0;
    
    public Tire(String n){
        name = n;
        nextid++;
        id = nextid;
        //Each id is unique and auto increasing
    }
    
    public String toString(){
        return "ID " + id + "\tBrand: " + name;
    }
}
