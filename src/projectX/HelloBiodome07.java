package projectX;

import java.util.Arrays;

public class HelloBiodome07 {
    static String message(String a){
        String b = a.toUpperCase();
        String c = b.replaceAll(" ","");
//        System.out.println(c);
        return c;
    }

    public static void main(String[] args){
        args = new String[]{" jjjccc EEEEYYYeee"};
        String a = args[0];

//        final String[] NUCLEOTIDE = new String[]{"C","Y","J","E","H"};
        final char[] NUCLEOTIDE = new char[]{'C','Y','J','E','H'};

        char[] list = message(a).toCharArray();
        System.out.println(Arrays.toString(list));


        String result = "";
        int count =0;

        //맞는 염기서열
        for (int i=0; i<list.length; i++){
            for(int j=0; j< NUCLEOTIDE.length; j++){
                if(NUCLEOTIDE[j] == list[i]){
                    result += NUCLEOTIDE[j];
                }
            }
        }

        for(int i=0; i<result.length(); i++){

        }


        // 문자열을 저장할 변수
//        String output ="";
//
//        int count = 0;
//        for (int i = 0; i < list.length; i++) {
//            if (list[i] == list[i - 1]) {
//                count++;
//            } else {
//                output += list[i-1]+count;
//                count = 1;
//            }
//        }

//        output += list[list.length - 1] + count;
//        System.out.println(list);
//        System.out.print("->"+output);

    }
}
