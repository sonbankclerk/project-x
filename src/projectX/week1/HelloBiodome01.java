package projectX.week1;

public class HelloBiodome01 {
    public static void main(String[] args) {
//        args = new String[]{"ss"};
        for(String name : args){
            if(name.isEmpty()){
                System.out.println("문자를 입력해주세요.");
                return;
            }
            System.out.println("반갑습니다,"+"\""+name+"\"");
        }


    }
}
