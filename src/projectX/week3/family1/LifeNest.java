package projectX.week3.family1;

import java.util.ArrayList;
import java.util.List;

public class LifeNest {
    final private List<Organism> organismList;

    public LifeNest() {
        this.organismList = new ArrayList<>();
    }

    public void addOrganism(Organism organism){
        organismList.add(organism);
        System.out.println(organism.name+" 추가 되었습니다.");
    }

    public void delOrganism(Organism organism){
        organismList.remove(organism);
        System.out.println(organism.name+" 삭제 되었습니다.");
    }

    public void allOrganism(){
        System.out.println("전체목록 출력:");
        for(Organism organism : organismList){
            organism.displayInfo();
        }
    }
}
