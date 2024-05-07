class Aopertation
{
 public static void main(String args[])
  { int a =add(3,4);
    System.out.println(a);
    float a1 =add(3,4.0f);
    System.out.println(add(3.4f,3.4f));
    System.out.println(a1);
   // System.out.println();
    
  }
     public static int add(int a,int b)
     {
     return a+b;
     }
     public static float add(int a,float b)
     {
     return a+b;
     }
     public static float add(float a,float b)
     {
     return a+b;
     }
     /*public static double add(double  a,double b)
     {
     return a+b;
     }*/
}
