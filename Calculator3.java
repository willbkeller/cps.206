//William Keller
//January 19, 2017
//CPS 206
//Calculator Code Submission

public class Calculator3{

   public static void main(String[] args){
      double num1 = Double.parseDouble(args[1]);
      double num2 = Double.parseDouble(args[2]);
      double answer;
      
      String operand = args[0];
      System.out.print(args[0] + " " + args[1] + " " + args[2] + " = ");
      
      if(args[0].equalsIgnoreCase("add")){
         answer = num1 + num2;
         System.out.println(answer);
      }
      else if(args[0].equalsIgnoreCase("subtract")){
         answer = num1 - num2;
         System.out.println(answer);
      }
      else if(args[0].equalsIgnoreCase("multiply")){
         answer = num1 * num2;
         System.out.println(answer);
      }
      else if(args[0].equalsIgnoreCase("divide")){
         if(num2 != 0){
            answer = num1 / num2;
            System.out.println(answer);
         }
         else System.out.println("Undefined");
      }
      else System.out.println("Invalid Request: Please Try Again."); 
   }
}
