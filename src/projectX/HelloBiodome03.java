package projectX;

public class HelloBiodome03 {
    public final double PI = 3.14;
    public final double B = 0.415;

    //바빌로니아(제곱근) 공식 매서드
    static double sqrt(double num) {
        double multi = 1;
        int count = 0;

        while (true) {
            if (multi * multi == num) {
                return multi;
            } else if (multi * multi > num) {
                multi -= 1;
                break;
            }
            multi++;
        }

        while (true) {
            count++;
            if(count  == 15) {
                return multi;
            }
            multi = (multi + (num / multi)) / 2;
        }
    }

    //절대값 매서드
    static double absolute(double abHum, double abTemp){
        double abNum = abHum - abTemp;
        if(abNum<0){
            abNum = -abNum;
        }
        return abNum;
    }

    //생명나무 건강지수 수식
    public double H(double a, double b, double c){
       return B * absolute(sqrt(a),b) + (c / (PI*PI));
    }

    public static void main(String[] args) {
        //온도, 습도, 산소
//        args = new String[]{"25.5", "65.0", "21.0"};

        double temperature;
        double humidity;
        double oxygen;

        try {
            temperature = Double.parseDouble(args[0]);
            humidity = Double.parseDouble(args[1]);
            oxygen = Double.parseDouble(args[2]);

            //결과값
            double H = new HelloBiodome03().H(humidity, temperature, oxygen);
            System.out.print(temperature+" ");
            System.out.print(humidity+" ");
            System.out.print(oxygen +"\n -> 생명지수 H ="+String.format("%.2f",H));

        }catch (Exception e){
            System.out.println("-> 입력된 값이 올바르지 않습니다. [온도][습도][산소농도] 순서 대로 숫자 값을 입력해주세요.");
        }
    }
}
