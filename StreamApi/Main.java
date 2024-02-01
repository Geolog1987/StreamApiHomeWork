package StreamApi;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> finishlist = new ArrayList<>();

        for (int i = 0; i < intList.size(); i++) {//
            if (intList.get(i) > 0) {
                if(intList.get(i) % 2 == 0){
                    finishlist.add(intList.get(i));
                }
            }
        }
        Collections.sort(finishlist);
        System.out.println(finishlist);

    }
}
