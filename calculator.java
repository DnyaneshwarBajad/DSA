class complex
{  
 public static int real_number_sum(int a,int b)
  { 
   return a+b;
  }
 public static int imaginary_number_sum(int a, int b)
  {
   return a+b;
  }
public static void main(String args[])
  { //basic operation
    String s="125+3i";
    String s1="6+2i";
    /*int a1 =real_number_sum(5,6);
    int b1 =imaginary_number_sum(2,1);
    System.out.println(a1 + "+i" + b1);*/
    //using parse int
    Integer real_num1 =Integer.parseInt(s.substring(0,s.indexOf('+')));
    Integer imaginary_num1=Integer.parseInt(s.substring(s.indexOf('+'),s.indexOf('i')));
    Integer real_num2 =Integer.parseInt(s1.substring(0,s1.indexOf('+')));
    Integer imaginary_num2=Integer.parseInt(s1.substring(s1.indexOf('+'),s1.indexOf('i')));
    
    int real_number_summ=real_num1+real_num2;
    //System.out.println(real_number_summ);
    int imaginary_number_summ=imaginary_num1+imaginary_num2;
    System.out.println(real_number_summ+ "+i" +imaginary_number_summ);
    //subtraction
    int real_number_sub=real_num1-real_num2;
    int imaginary_number_sub=imaginary_num1-imaginary_num2;
    System.out.println(real_number_sub+ "+i" -imaginary_number_sub);
    
    
    
    
    
    
    
    
    
     
  }
}
