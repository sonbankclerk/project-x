package projectX;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HelloBiodome07 {
    static String message(String a){
        String b = a.toUpperCase();
        String c = b.replaceAll(" ","");
//        System.out.println(c);
        return c;
    }

    public static void main(String[] args){
        args = new String[]{" jjjcccg EEEYYYeee"};
        String a = args[0];

//        final String[] NUCLEOTIDE = new String[]{"C","Y","J","E","H"};
        final char[] NUCLEOTIDE = new char[]{'C','Y','J','E','H'};

        char[] list = message(a).toCharArray();
//        System.out.println(Arrays.toString(list));

        // 문자열을 저장할 변수
        String output ="";

        int count = 1;
        for (int i = 1; i < list.length; i++) {
            if (list[i] == list[i - 1]) {
                count++;
            } else {
                output += list[i-1]+count;
                count = 1;
            }
        }

        output += list[list.length - 1] + count;
        System.out.println(list);
        System.out.print("->"+output.toString());

//        boolean match = false;
//
//        for(char forList: list){
//            for(char forNucleo: NUCLEOTIDE){
//                if(forList == forNucleo){
//                    match = true;
//                    break;
//                }
//            }
//            if(match){
//                System.out.print(forList);
//            }else {
//                System.out.println("-> 염기서열은 C, J, H, E, Y 다섯가지로만 입력됩니다. 확인하고 다시 입력해주세요.");
//            }
//        }

    }
}
