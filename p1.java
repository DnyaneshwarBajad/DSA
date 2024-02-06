class A{ static int y=233;
A(int a){
System.out.println("A constructor");
System.out.println(y);
}
static {System.out.println("A ststic block");
 int y =34;
 System.out.println(y);
}
}

class sggs{
static int x =32;
static {
System.out.println("sggs ststic begin  block");
}

sggs(){
//this(4);
System.out.println("sggs  default constructor");
}{
System.out.println("Inside init");}


sggs(float x){
//this(7.0f);
System.out.println("sggs constructor");
}
sggs(int a, int b){
System.out.println("sggs second  constructor");
}
static {int x =22;
System.out.println("sggs ststic end  block");
}
public static void main(String args[]){
A b = new A(3);
sggs d=new sggs(3,4);
//sggs a =new sggs(0.3f);
System.out.println(x);
//32 will print 
sggs a1=new sggs();
//A aa =new A(6);
}
}
