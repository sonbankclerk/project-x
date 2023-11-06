package projectX;

import java.util.Scanner;

public class HelloBiodome02 {
    public static void main(String[] args) {

        args = new String[]{"10000", "20000", "30000"};
        int[] arr = new int[args.length];
        int sum = 0;

        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(args[i]);
//            기능 요구사항인데, 제약조건 args에 입력을 받는 값이면 넣어야할 이유가 있나?
//            if(arr[i]<0 || arr[i] > 30000){
//                System.out.println("에너지 생산량은 정수이며, 마이너스 값이 될 수 없다.");
//                return;
//            }
            System.out.print(arr[i]+" ");
            sum += arr[i];
        }
        System.out.println("->총 에너지 사용량은 "+sum+"입니다.");
    }
}
