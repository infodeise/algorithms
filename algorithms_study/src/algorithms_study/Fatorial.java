package algorithms_study;

public class Fatorial {
    public static void main(String[] args) {
        int number = 4;
        System.out.println(calculateFatorial(number));
    }

    private static int calculateFatorial(int number){
        if(number == 0 || number == 1) {
            return 1;
        }

        return number * calculateFatorial(number-1);
    }
}
