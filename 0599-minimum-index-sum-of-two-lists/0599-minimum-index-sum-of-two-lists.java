import java.util.*;

class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map1.put(list1[i], i);
        }

        for (int j = 0; j < list2.length; j++) {
            map2.put(list2[j], j);
        }

        List<String> list = new ArrayList<>();
        int ans = Integer.MAX_VALUE;
        for (String key : map1.keySet()) {
            if (map2.containsKey(key)) {
                int value1 = map1.get(key); 
                int value2 = map2.get(key); 
                
                int sum = value1 + value2;

                if (ans > sum) {
                    ans = sum;
                    list.clear(); 
                    list.add(key); 
                } else if (ans == sum) {
                    list.add(key); 
                }
            }
        }

        return list.toArray(new String[0]); 
    }
}
