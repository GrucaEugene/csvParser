
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public int getMaximumValueOfColumn(String mainline, String columnName) throws NumberFormatException {

        int pos = findPosition(mainline, columnName);
        Scanner sc = new Scanner(mainline);
        int maxValue = 0;
        while (sc.hasNextLine()) {
            String[] values = sc.nextLine().split(",");
            if(values[pos].equals(columnName)) continue;
            int currentValue = Integer.parseInt(values[pos]);
            if (currentValue > maxValue) maxValue = currentValue;
        }
        return maxValue;
    }

    /** Method finds and returns index of a needed column
     * from the first line of csvTable converted to String*/
    private int findPosition(String mainline, String columnName) {
        Scanner sc = new Scanner(mainline);
        String[] raws = sc.nextLine().split(",");
        return Arrays.asList(raws).indexOf(columnName);
    }

}
