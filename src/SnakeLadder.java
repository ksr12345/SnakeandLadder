import java.util.*;

public class SnakeLadder {
    public static void main(String[] args){
        int p1 = 0;
        while (p1 != 100) {
            int roll_die = (int) ((Math.random()*10) % 6);
            if (roll_die == 0){
                roll_die = 6;
            }
            if ((p1+roll_die) > 100){
                continue;
            }
            p1 += roll_die;
            String option = getRandomOption();
            switch (option) {
                case "No Play":
                    break;
                case "Ladder":
                    if ((p1+roll_die) > 100) {
                        break;
                    }
                    p1 += roll_die;
                    break;
                case "Snake":
                    p1 -= roll_die;
                    if (p1 < 0) {
                        p1 = 0;
                    }
                    break;
                default:
                    System.out.println("Invalid option");
            }
            System.out.println("Outcome: "+ p1);
        }
        System.out.println("It Reached at position "+ p1);
    }
    private static String getRandomOption() {
        String[] options = {"No Play", "Ladder", "Snake"};
        Random random = new Random();
        int index = random.nextInt(options.length);
        return options[index];
    }
}
