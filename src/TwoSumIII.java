import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

public class TwoSumIII {
    @Getter private HashMap<Integer,Integer> numberCount;
    public TwoSumIII() {
        this.numberCount = new HashMap<Integer,Integer>();

    }

    public void add(int number) {
        if(this.numberCount.containsKey(number)){
            this.numberCount.replace(number, this.numberCount.get(number)+1);
        }else {
            this.numberCount.put(number,1);
        }

    }

    public boolean find(int value) {
        for(Map.Entry<Integer,Integer> entry: this.numberCount.entrySet()){
            int complement = value-entry.getKey();
            if(complement != entry.getKey()){
                if(this.numberCount.containsKey(complement)) return true;
            }else {
                if (entry.getValue() >1) return true;
            }
        }
            return false;
    }
}
