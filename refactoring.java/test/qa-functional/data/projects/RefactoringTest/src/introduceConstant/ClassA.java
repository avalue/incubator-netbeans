package introduceConstant;

import java.util.LinkedList;
import java.util.List;

public class ClassA {
    List l = new LinkedList();
    
    String s = "text";
    
    public void method() {
        String local = "text";
    }
    
    public static int statMethod() {
        int c = 3;
        System.out.println(c);
        return 3;
    }
}
