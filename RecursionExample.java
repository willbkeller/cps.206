public class RecursionExample{

   public static void main(String[] args){
   
      RecursionExample recursion = new RecursionExample();
      System.out.println(recursion.doFactorial(5));
      System.out.println(recursion.doSum(recursion.sumRange(5, 10)));
   }
   
   public int doFactorial (int n){
      
      if(n==1) return 1;
      return n*=doFactorial(n-1);
      
   }
   
   public int doSum(int n){
     
      return (n*n + n)/(2);
   }
   
   public int sumRange(int f, int t){
   
   }
  
}