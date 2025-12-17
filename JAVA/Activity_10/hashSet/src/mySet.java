import java.util.HashSet;
import java.util.Iterator;

public class mySet {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(12);
        hs.add(1143);
        hs.add(11);
        hs.add(15);
        hs.add(15);
        hs.add(11);


        
        Iterator<Integer> iterator = hs.iterator();

       System.out.print("Values : ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println("Size :" + hs.size());

        hs.remove(1143);

        System.out.println(hs);
        
        hs.remove(10);
        System.out.println(hs);
        
        System.out.println("1143 : "+hs.contains(1143));
        System.out.println("11 : "+hs.contains(11));
        
        System.out.println(hs);




    }
}
