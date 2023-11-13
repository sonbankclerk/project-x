package projectX.week1;

import java.util.Scanner;

public class HelloBiodome02 {
    public static void main(String[] args) {

//        args = new String[]{"10000", "20000", "30000"};

        try {
            double sun = Double.parseDouble(args[0]);
            double wind = Double.parseDouble(args[1]);
            double land = Double.parseDouble(args[2]);

            if(sun<0 || wind<0 || land<0 || sun>30000 || wind>30000 || land>30000){
                System.out.println("범위에 맞는 값을 넣어주세요.");
                return;
            }

            int[] arr = new int[args.length];
            int sum = 0;

            for(int i=0; i<arr.length; i++){
                arr[i] = Integer.parseInt(args[i]);
                sum += arr[i];
            }
            System.out.println("->총 에너지 사용량은 "+sum+"입니다.");

            //percent값 구하기
            double sunPer = sun/(double) sum *100.0;
            double windPer = wind/(double) sum *100.0;
            double landPer = land/(double) sum *100.0;

            System.out.print("태양광 " + String.format("%.9f",sunPer)+"%");
            System.out.print(", 풍력 " + String.format("%.8f",windPer)+"%");
            System.out.print(", 지열 " + String.format("%.7f",landPer)+"%");

        }catch (Exception e){
            System.out.println("숫자만 입력하시오.");
        }

    }
}
