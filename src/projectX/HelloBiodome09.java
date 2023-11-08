package projectX;

public class HelloBiodome09 {
    public static void main(String[] args) {
        //출력을 위한 args 인자 값
        args = new String[]{"8","&"};

        try {
            int num = Integer.parseInt(args[0]);

            if(num<3 || num>100){
                System.out.println(">>> 잘못된 입력입니다. 3~100 사이의 숫자를 입력하세요.");
                return;
            }

            for(int i=0; i<num; i++){
                for(int j=1; j<=num-i; j++){
                    System.out.print(" ");
                }
                for(int k=0; k<i*2+1; k++){
                    if(k==i){
                        System.out.print(args[1]);
                    }else {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }

            for (int i=0; i<num-(num-1); i++){
                for (int j=0; j<num; j++){
                    System.out.print(" ");
                }
                System.out.println("|");
            }


        }catch(NumberFormatException e){
            System.out.println(">>> 잘못된 입력입니다. 3~100 사이의 숫자를 입력하세요.");
        }

    }
}
