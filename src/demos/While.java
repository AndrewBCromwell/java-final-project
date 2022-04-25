package demos;
public class While {
    public static void main(String[] args) {
        int round = 1;
        int result = 1;
        while(round <= 6){
            System.out.println(result);
            result *= 2;
            round++;
        }
    }
}
