import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class arraylist {
    public static void main(String[] args) {
        List<Integer> nums=new ArrayList<Integer>();
        nums.add(5);
        nums.add(6);
        Set<Integer> sets=new HashSet<Integer>();

        Map<String,Integer> maps= new Hashtable<String,Integer>();

        maps.put("lik",100);
        maps.put("man",200);
        maps.put("koh",300);

       System.out.println(maps.get("man"));
       System.out.println(maps.keySet());
       System.out.println(maps.size());
        System.out.println(maps);
    }
}
