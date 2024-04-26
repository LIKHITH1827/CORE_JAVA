import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class streampr {
    public static void main(String[] args) {
        List<Integer> l=new ArrayList<>();
       l.add(2);
       l.add(4);
       l.add(8);
       l.add(7);
       Stream<Integer> s=l.stream();
    s.count();
       s.sorted();
       s.filter(n -> n%2==0);
       
    }
}
