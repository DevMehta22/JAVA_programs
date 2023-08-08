import java.util.*;
class Words {

    static void count(String str){
       String strArr[]=null;
       strArr=str.split("");
       char c;
       int ct=0;
       for(int i=0;i<strArr.length;i++){
            c=str.charAt(i);
            if(c>=65 && c<=90){
                ct++;
            }        
       }
       System.out.println("number of words with capital letter is:"+ct);


    }
   public static void main(String[] args) {
        System.out.print("enter the string:");
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
         
        count(line);

   }
  
}
