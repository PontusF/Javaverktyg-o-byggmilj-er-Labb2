public class TestGuesser {

    public static void main(String[] args) {
        Guesser guesser1 = new Guesser(0, 100);
        if (guesser1.toString().equals("low: " + 0 + " high: " + 100)){
            System.out.println("Test for constructor asigning parameters correctly passed!");
        } else{
            System.out.println("Test for constructor asigning parameters correctly failed!");
        }

        try {
            Guesser guesser2 = new Guesser(100, 100);
            System.err.println("Test for same input for 'low' and 'high' resulting in exception failed");
        }catch(Exception e ) {
            System.out.println("Test for same input for 'low' and 'high' resulting in exception succeeded!");
        }

        try {
            Guesser guesser2 = new Guesser(1000, 0);
            System.err.println("Test for higher 'low' than 'high' resulting in exception failed");
        }catch(Exception e ) {
            System.out.println("Test for higher 'low' than 'high' resulting in exception succeeded!");
        }
    }
}
