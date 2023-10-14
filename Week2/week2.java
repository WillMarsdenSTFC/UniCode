import java.util.Scanner;

class week2 {
    public static void main(String[] args) {
        boolean Continue = true;
        Scanner reader = new Scanner(System.in);

        do {

            basicLoop bL = new basicLoop();
            bL.loop();

            SevenMultiples sM = new SevenMultiples();
            sM.timesTables();

            DynamicMultiples dM = new DynamicMultiples();
            System.out.println("Enter a number: ");
            String num = reader.nextLine();
            dM.dynamicMultiplication(Integer.valueOf(num));

            System.out.println("Would you like to continue? Y/N");
            String Ans = reader.nextLine();

            if(Ans.equals("N")) {
                Continue = false;
            }

        } while (Continue == true);

        reader.close();
    }

}