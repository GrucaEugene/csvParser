/*** Imitation of parsing csvFile converted to String
 */

public class Main {
    public static void main(String[] args) {

        String mainline = "id,name,surname,salary\n" +
                "1,Chickie,Narducci,3000\n" +
                "2,Pete,Casella,1100\n" +
                "3,Phil,Testa,2000\n" +
                "4,Joey,Merlino,1300";
        Solution solution = new Solution();
        System.out.println("Max value equals: "
                + solution.getMaximumValueOfColumn(mainline, "salary") + "$");
    }

}
