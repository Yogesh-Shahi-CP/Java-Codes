import java.util.*;
public class List {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 22, 43, 64, 95));
        
        list.add(90);               // insert 90 at end
        list.add(15);               // insert 15 at end
        list.add(2, 45);            // insert 45 at index 2
        
        System.out.println(list);
    }
}

