package projectX;

public class HelloBiodome06 {
    public static void main(String[] args) {
        args = new String[]{"as","asd"};

        int i=0;
        int j=0;

        try {
            String a = args[0];
            String b = args[1];

            while (i<a.length() && j<b.length()){
                if(a.charAt(i) != b.charAt(j)){
                    if(j==0){
                        i++;
                    }else{
                        break;
                    }
                }
                i++;
                j++;
            }

            if(i==a.length() && j==b.length()){
                System.out.println("동일한 유전자 코드입니다.");
            }else {
                System.out.println("일치하지 않는 코드입니다.");
            }

            if(i==a.length()){
                System.out.println("부분적으로 포함됩니다.");
            }else {
                System.out.println("포함되지 않습니다.");
            }
        }catch (Exception e){
            System.out.println("두 개의 유전자 코드를 입력해주세요.");
        }


    }
}
