package projectX;

public class HelloBiodome05 {
    static int g, h;

    static void gh(){
        for(g=0; g<16; g++){ //최대 데이터 크기 4bit: 2^4=16
            for (h=0; h<16; h++){
                if((g & 1 >> g << 2 | h + g ^ h) == 1 && (g % 2 << h >> g | 1 & 0 ^ 0) == 2){
                    return;
                }
            }
        }
    }

    static int calculate(){
        return (h*h+g) * (h<<h) + (g<<g);
    }

    public static void main(String[] args) {
        gh();
        System.out.println(calculate());

    }
}
