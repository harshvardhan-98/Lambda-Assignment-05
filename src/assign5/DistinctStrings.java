package assign5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

interface DistinctStringsInterface{
    String viewStr(List<String> str);

}

public class DistinctStrings {
    public static void main(String...args){
        DistinctStringsInterface strObj = (str) -> {
            Scanner sc = new Scanner(System.in);
            str = new ArrayList<>();
            str.add("java");
            str.add("scala");
            str.add("java");
            str.add("clojure");
            str.add("clojure");
            str.add("scala");
            List<String> list = str.stream().distinct().collect(Collectors.toList());

            return String.valueOf(list);
        };
        System.out.println(strObj.viewStr(Arrays.asList()));
    }
}