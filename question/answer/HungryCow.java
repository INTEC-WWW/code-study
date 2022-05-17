import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

public class HungryCow {

    public List<Integer> resultFunction(List<Integer> cowList, List<Integer> barnList){
        List<Integer> returnArray = new ArrayList<>();

        for(int index =0; index<cowList.size();index++) {
            returnArray.add(barnCalculator(cowList.get(index), barnList));
        }

        return returnArray;
    }

    private Integer barnCalculator(Integer cowPosition ,List<Integer> barnList){
        Integer lowPosition = 1000000000;
        Integer selectPosition = 1000000000;
        Integer distance = 2000000000;

        for(int index =0; index<barnList.size();index++){
            Integer thisDistance = Math.abs(barnList.get(index) - cowPosition);
            if (thisDistance < distance || thisDistance.equals(distance) && selectPosition > barnList.get(index)  ){
                lowPosition = index;
                selectPosition = barnList.get(index);
                distance = thisDistance;
            }
        }

        return lowPosition;
    }
}
