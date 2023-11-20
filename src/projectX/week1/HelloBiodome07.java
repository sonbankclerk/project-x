package projectX.week1;

public class HelloBiodome07 {
    //대문자, 빈칸없애는 메소드
    static String message(String a){
        String b = a.toUpperCase();
        String c = b.replaceAll(" ","");
//        System.out.println(c);
        return c;
    }

    public static void main(String[] args){
        args = new String[]{" jjccc EEEEYYYeee"};
        String a = args[0];


        final char[] NUCLEOTIDE = new char[]{'C','Y','J','E','H'};

        //뉴클레오타이드 5가지 list 변수에 저장
        char[] list = message(a).toCharArray();
//        System.out.println(Arrays.toString(list));

//        String result = "";
//        //뉴클레오타이드 5가지와 맞는 염기서열인지 result에 저장
//        for (int i=0; i<list.length; i++){
//            for(int j=0; j< NUCLEOTIDE.length; j++){
//                if(NUCLEOTIDE[j] == list[i]){
//                    result += NUCLEOTIDE[j];
//                }
//            }
//        }
//        System.out.println(result);


        // 맞는 염기서열 중복값 count
        String result = "";
        char currentChar = list[0];
        int count = 1;

        for (int i = 1; i < list.length; i++) {
            if (list[i] == currentChar) {
                count++;
            } else {
                result += currentChar;
                if (count > 1) {
                    result += count;
                }
                currentChar = list[i];
                count = 1;
            }
        }

        // 마지막 염기서열 처리
        result += currentChar;
        if (count > 1) {
            result += count;
        }

        System.out.println(result);

    }
}
