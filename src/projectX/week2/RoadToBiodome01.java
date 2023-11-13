package projectX.week2;

import java.util.ArrayList;
import java.util.List;

public class RoadToBiodome01 {
    public static void main(String[] args) {
        List<Integer> inputList = checkList(args);
        List<Integer> result = countList(inputList);
            System.out.println(">> " + result);

    }

    //최소값:0, 최대값:1000
    //입력값이 올바르지 않은 경우 안내 메시지 출력
    public static List<Integer> checkList(String[] args){
        List<Integer> list = new ArrayList<>();

        args = new String[]{"5", "9", "16", "16", "5", "11", "5", "5", "9", "16", "16", "9", "9"};
        try {
            for(int i=0; i< args.length; i++){
                int num = Integer.parseInt(args[i]);
                if(num<0 || num>1000){
                    System.out.println("입력된 값의 범위가 올바르지 않습니다. 0에서 1000까지의 값을 입력해주세요.");
                    return null;
                }
                list.add(num);
            }
        }catch(Exception e){
            System.out.println("숫자를 입력해 주세요.");
            return null;
        }
        return list;
    }

    //중복체크 & 결과
    public static List<Integer> countList(List<Integer> inputList){
        List<Integer> result = new ArrayList<>();

        for(int i=0; i<inputList.size(); i++){
            boolean check = true;
            int currentNum = inputList.get(i);
            for(int j=0; j<inputList.size(); j++){
                if(i!=j && currentNum == inputList.get(j)){
                    check = false;
                    break;
                }
            }
            if(check){
                result.add(currentNum);
            }
        }
        return result;
    }
}


