public class Multiple_Catch{
    public static void main(String[] args) {
        try {
            // Outer try block
            int[] numbers = { 1, 2, 3 };
            System.out.println(numbers[5]); // This will throw an ArrayIndexOutOfBoundsException

            try {
                // Inner try block
                String text = null;
                System.out.println(text.length()); // This will throw a NullPointerException
            } catch (NullPointerException e) {
                System.out.println("Inner catch block: Caught a NullPointerException");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch block: Caught an ArrayIndexOutOfBoundsException");
        } catch (Exception e) {
            System.out.println("Outer catch block: Caught a generic Exception");
        }

        System.out.println("Program continues after exceptions.");
    }
}
