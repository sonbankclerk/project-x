package projectX;

public class HelloBiodome03 {
    public static void main(String[] args) {
        //온도, 습도, 산소
        args = new String[]{"25.5", "65.0", "21.0"};
        final double PI = 3.14;
        final double B = 0.415;
        double temperature = Double.parseDouble(args[0]);
        double humidity = Double.parseDouble(args[1]);
        double oxygen = Double.parseDouble(args[2]);

        //바빌로니아법(제곱근,√ /⚠️Math.sqrt()메서드 사용불가)
        double babylonian = humidity;
        for(int i=0; i<10; i++){
            babylonian = (babylonian + (humidity / babylonian)) / 2;
        }
        System.out.println(babylonian);

        //Math 클래스의 sqrt를 이용한 제곱근 구하기
        //double result = Math.sqrt(humidity);
        //System.out.println(result);

        //절대값
        double absolute = babylonian-temperature;
        if(absolute<0){
            absolute = -absolute;
        }

        System.out.println(absolute);

        //결과값
        double H = B * absolute + (oxygen / (PI*PI));

        System.out.print(temperature+" ");
        System.out.print(humidity+" ");
        System.out.print(oxygen +"\n -> 생명지수 H ="+ H);

    }
}
