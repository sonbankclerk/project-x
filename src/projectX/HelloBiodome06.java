package projectX;

public class HelloBiodome06 {
    public static void main(String[] args) {
        args = new String[]{"asfd215j","asfd215j"};
        String a = args[0];
        String b = args[1];


        int i=0;
        int j=0;
        char[] resertA = new char[a.length()];
        char[] resertB = new char[b.length()];

        while (i<a.length()){
            resertA[i] = a.charAt(i);
            i++;
        }


        System.out.println(resertA);

        while (j<b.length()){
            resertB[j] = b.charAt(j);
            j++;
        }

        System.out.println(resertB);

        if(resertA.equals(resertB)){
            System.out.println("-> 동일한 유전자 코드입니다.");
        }else {
            System.out.println("-> 일치하지 않습니다.");
        }
    }
}
