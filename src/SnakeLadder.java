public class SnakeLadder {
    public static void main(String[] args){
        int p1 = 0;
        if (p1 ==0) {
            System.out.println("Player is at " + p1 + " position.");
        }
        int roll_die = (int) ((Math.random()*10) % 6);
        if (roll_die == 1){
            System.out.println("Outcome: "+ roll_die);
        } else if (roll_die == 2) {
            System.out.println("Outcome: "+ roll_die);
        } else if (roll_die == 3) {
            System.out.println("Outcome: "+ roll_die);
        } else if (roll_die == 4) {
            System.out.println("Outcome: "+ roll_die);
        } else if (roll_die == 5) {
            System.out.println("Outcome: "+ roll_die);
        } else {
            System.out.println("Outcome: "+ 6);
        }
        p1 += roll_die;
        System.out.println("New Position: "+ p1);
    }
}
