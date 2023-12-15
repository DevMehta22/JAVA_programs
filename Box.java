public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) throws exception {
        if (length < 0 || width < 0 || height < 0) {
            throw new exception("Box dimensions must be greater than or equal to zero.");
        }
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public static void main(String[] args) {
        try {
            Box validBox = new Box(2.0, 3.0, 4.0);
            System.out.println("Valid Box created.");
            
            Box invalidBox = new Box(-1.0, 3.0, 4.0); // This will throw InvalidBoxException.
        } catch (exception e) {
            System.err.println("InvalidBoxException: " + e.getMessage());
        }
    }
}
