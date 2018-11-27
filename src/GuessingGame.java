public class GuessingGame {
    public static void main(String[] args) {
        int low = 0;
        int high = 1000;
        try{
            low = Integer.parseInt(args[0]);
            high = Integer.parseInt(args[1]);

        }catch (Exception e){

        }

        Guesser guesser = new Guesser(low,high);
        guesser.start();
    }
}
