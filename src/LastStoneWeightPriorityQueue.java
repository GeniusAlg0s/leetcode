import java.util.Comparator;
import java.util.PriorityQueue;

public class LastStoneWeightPriorityQueue {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> stonesGroup = new PriorityQueue<>(Comparator.reverseOrder());

        for (int stoneElement:stones
             ) {
            stonesGroup.add(stoneElement);
        }
        while (stonesGroup.size()>1){
            int stone1 = stonesGroup.remove();
            int stone2 = stonesGroup.remove();
            if(stone1!=stone2)stonesGroup.add(stone1-stone2);
        }
        return stonesGroup.isEmpty() ? 0 : stonesGroup.remove();
    }
}
