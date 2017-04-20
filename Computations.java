class Computations {

   public static void main(String args[])
   {
      int a, b;
      a = 15;
      b = (a == 1) ? 20: 30;
      System.out.println( "Value of b is : " +  b );
	  System.out.println("Value of a is: "+ a);

      b = (a == 10) ? 20: 30;
      System.out.println( "Value of b is : " + b );
	  System.out.println(a>b?true:false);
   }
}