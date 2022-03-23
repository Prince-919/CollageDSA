// Collection framework


// import java.util.*;     // (all package import)
import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        
        // ArrayList Use to (add, remove, get, set, clear, cantains) 

        ArrayList<Integer> obj = new ArrayList<>();
        obj.add(10);
        obj.add(20);
        obj.add(30);
        obj.add(40);
        // get
        // int New = obj.get(2);    // 30
        // System.out.println(New);
        
        // clear                // []
        //obj.clear();

        // set
        obj.set(2,100);        // [10, 20, 100, 40]

        // cantains
        boolean f = obj.contains(100);
        System.out.print(f);

        System.out.println();  // newline

        for(int i=0; i<obj.size(); i++)
        {
            System.out.print(obj.get(i) + " ");
        }



        
    }
    
}
