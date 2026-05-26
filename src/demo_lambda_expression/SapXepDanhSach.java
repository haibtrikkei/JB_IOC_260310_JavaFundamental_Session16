package demo_lambda_expression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SapXepDanhSach {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(2, 6, 6, 4, 6, 8, 5, 76, 3, 6, 3, 6, 7, 43, 6));

        list.sort((a,b)->b.compareTo(a));

//        list.sort(Comparator.reverseOrder());
        System.out.println("Danh sách giảm dần: ");
        for(Integer val : list){
            System.out.print(val+"\t");
        }
        System.out.println();
    }
}
