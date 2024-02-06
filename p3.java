class sggs{
static int x=786;
int y=2024;
{
System.out.println("Inside init block" + this);}
sggs(){
System.out.println("Inside sggs constructor "+ this);
}
public static void main(String args[]){
System.out.println("Inside main ");
sggs a =new sggs();
System.out.println(a);
}
public String toString(){
return "hi";
}
//public String toString1(){
//return "hi";
//}
//public String toString(){
//return "Y " +y;
//}
}
