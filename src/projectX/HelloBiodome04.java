package projectX;

public class HelloBiodome04 {

    static boolean tempCheck(double temperature){
        return temperature >=10 && temperature <27.5;
    }
    static boolean humCheck(double humidity){
        return humidity >40 && humidity <60;
    }
    static boolean oxyCheck(double oxygen){
        return oxygen >=19.5 && oxygen <=23.5;
    }

//    static void printArgs(double temperature, double humidity, double oxygen){
//        System.out.print(temperature+" ");
//        System.out.print(humidity+" ");
//        System.out.print(oxygen);
//    }

    public static void main(String[] args) {
        args = new String[]{"9","41","20"};

        if(args.length != 3){
            System.out.println("-> 입력된 값이 올바르지 않습니다. [온도][습도][산소농도] 순서대로 숫자 값을 입력해주세요");
            return;
        }

        double temperature;
        double humidity;
        double oxygen;

        try{
            temperature = Double.parseDouble(args[0]);
            humidity = Double.parseDouble(args[1]);
            oxygen = Double.parseDouble(args[2]);
        }catch (Exception e){
            System.out.println("-> 입력된 값이 올바르지 않습니다. [온도][습도][산소농도] 순서대로 숫자 값을 입력해주세요");
            return;
        }

//        boolean message = range(temperature, humidity, oxygen);


        System.out.print(temperature+" ");
        System.out.print(humidity+" ");
        System.out.print(oxygen);

        if(!tempCheck(temperature)){
            System.out.println("\n-> 온도값이 정상 범위를 벗어났습니다. 확인이 필요합니다");
        }else if(!humCheck(humidity)){
            System.out.println("\n-> 습도값이 정상 범위를 벗어났습니다. 확인이 필요합니다");
        }else if (!oxyCheck(oxygen)) {
            System.out.println("\n-> 산소값이 정상 범위를 벗어났습니다. 확인이 필요합니다");
        }else{
            System.out.println("\n-> 생명의 나무는 안정적인 상태입니다 :)");
        }


    }


}
