import java.util.*;
class Maxm {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter Elements:");
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();
    int maxm=(a>b)?(a>c?a:c):(b>c?b:c);
    System.out.println("The maximum of the numbers is:"+maxm);
    
    }
    
}
