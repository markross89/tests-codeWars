package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Tribonacci {

    public static void main(String[] args) {

        double[] number = {0,0,1};
        System.out.println(Arrays.toString(tribonacci(number, 10)));
    }

    public static double[] tribonacci(double[] s, int n) {

        List<Double> list = Arrays.stream(s)
                .boxed()
                .collect(Collectors.toList());

        for (int i = 0; i < list.size(); i++) {
            double next = list.get(i)+ list.get(i+1)+list.get(i+2);
            if(list.size()!=n) {
                list.add(next);
            }else{
                break;
            }
        }

        return list.stream().mapToDouble(d -> d).toArray();
    }
}
