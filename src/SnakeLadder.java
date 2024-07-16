import java.util.*;

public class SnakeLadder {
    public static void main(String[] args){
        int cp = 1;
        int[] pos = {0, 0};
        boolean won = false;
        while (!won) {
            int roll_die = (int) ((Math.random()*10) % 6);
            if (roll_die == 0){
                roll_die = 6;
            }
            String option = getRandomOption();
            switch (option) {
                case "No Play":
                    break;
                case "Ladder":
                    pos[cp-1] += roll_die;
                    if (pos[cp-1] == 100){
                        won = true;
                        System.out.println("Player"+ cp +" wins!");
                    }
                    continue;
                case "Snake":
                    pos[cp-1] -= roll_die;
                    if (pos[cp-1] <0){
                        pos[cp-1] =0;
                    }
                    break;
                default:
                    System.out.println("Invalid option");
            }
            cp = (cp % 2) +1;
        }
    }
    private static String getRandomOption() {
        String[] options = {"No Play", "Ladder", "Snake"};
        Random random = new Random();
        int index = random.nextInt(options.length);
        return options[index];
    }
}
