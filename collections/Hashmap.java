package CollectionsPractice;
import java.util.*;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<Integer,String> hm =new HashMap<>();
        hm.put(100,"sai");
        hm.put(101,"abhi");
        hm.put(102,"ram");
        hm.put(103,"yash");
        hm.put(104,"yash");
      Set s= hm.keySet();
      Iterator it =s.iterator();
      while (it.hasNext()){
         Object obj=it.next();
          System.out.println(obj+": "+hm.get(obj));
      }
    }

}
