import java.util.*;

public class GuessingGame {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Random r = new Random();
        int machineNum = r.nextInt(5) +1;
        
        for (int i=1; i<=3; i++) {
          

            System.out.println(machineNum);

            int userNum = sc.nextInt();
    
            String champ = (userNum == machineNum) ? "U have won!" : "Machine won!";
    
            System.out.println(champ);
        }


        sc.close();
    }
}
