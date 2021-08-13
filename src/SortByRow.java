import java.util.ArrayList;
import java.util.List;

public class SortByRow {
    public static String convert(String s, int numRows) {
        if(numRows == 1)return s;

    List<StringBuilder> sRows = new ArrayList<>();
        for(int i=0; i< Math.min(numRows, s.length()); i++) sRows.add(new StringBuilder());

    int currentRow = 0;
    boolean addingDownward = false;

        for (char b : s.toCharArray()
            ) {
        sRows.get(currentRow).append(b);
        if(currentRow ==0 || currentRow == numRows-1) addingDownward = !addingDownward;

        if(addingDownward){
            currentRow +=1;
        }else {
            currentRow -=1;
        }
    }

    StringBuilder returnList = new StringBuilder();
        for (StringBuilder in : sRows
             ) {
        returnList.append(in);
    }
        return returnList.toString();
}

    public static void main(String[]args){
        String a ="PAYPALISHIRING";
        System.out.println(SortByRow.convert(a,3));
    }
}
