package projectX;

public class HelloBiodome06 {
    public static void main(String[] args) {
        args = new String[]{"asfd215j","asfd215j"};
        String a = args[0];
        String b = args[1];

        //정규식
//        ^[a-zA-Z0-9]*$

        int i=0;
        while (i<a.length() && i<b.length()){
            if(a.charAt(i) == b.charAt(i)){
                System.out.println("-> 동일한 유전자 코드입니다.");
                System.out.println(a.charAt(i));
            }else {
                System.out.println("-> 일치하지 않습니다.");
            }
            return;
        }
    }
}
