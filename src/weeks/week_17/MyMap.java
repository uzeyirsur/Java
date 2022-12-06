package weeks.week_17;
import java.util.*;
public class MyMap {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(10,48);
        map.put(1,58);
        map.put(2,76);

        print(map);
    }
    private static void print(Map map){
        Set<Integer> set = map.keySet();
        for(Integer key: set){
            System.out.println(map.get(key));
        }
    }
}
