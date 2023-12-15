import java.util.Scanner;
      class MathCalc 
    {
            public static void main(String[] args)
            {
                  Scanner scanner = new Scanner(System.in);
                  while (true) {
                  System.out.println("Scientific Calculator");
                  System.out.println("1. Square Root");
                  System.out.println("2. Cube Root");
                  System.out.println("3. Power");
                  System.out.println("4. Sine");
                  System.out.println("5. Cosine");
                  System.out.println("6. max ");
                  System.out.println("7. Exit");
                  System.out.print("Enter your choice: ");
                  int choice = scanner.nextInt();
                 double result = 0.0;
            switch (choice) 
            {
                case 1:
                    System.out.print("Enter a number: ");
                    double number = scanner.nextDouble();
                    result = Math.sqrt(number);
                    break;
                case 2:
                    System.out.print("Enter a number: ");
                    double c = scanner.nextDouble();
                    result = Math.cbrt(c);
                    break;
                case 3:
                    System.out.print("Enter the base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter the exponent: ");
                    double exponent = scanner.nextDouble();
                    result = Math.pow(base, exponent);
                    break;
                case 4:
                    System.out.print("Enter an angle in degrees: ");
                    double angle = scanner.nextDouble();
                    result = Math.sin(Math.toRadians(angle));
                    break;
                case 5:
                    System.out.print("Enter an angle in degrees: ");
                    angle = scanner.nextDouble();
                    result = Math.cos(Math.toRadians(angle));
                    break;
                case 6:
                    System.out.print("Enter the first number: ");
                   float a= scanner.nextFloat();
                   System.out.print("Enter the second number: ");
                   float b= scanner.nextFloat();
                   result= Math.max(a,b);
                   break;
                case 7:
                    System.out.println("Exiting the calculator !!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    continue;
            }
            System.out.println("Result: " + result);  
            }
    }
}
