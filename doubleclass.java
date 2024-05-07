class sggs
{
 String collegename;
 sggs (String collegename)
 {
  this.collegename =collegename;
 }
class department{
String hllo;
department(String deprtname)
{this.hllo=deprtname;
//this.collegename = collegename;
}
}

public static void main(String args[]){
sggs SGGS =new sggs("hi");
department IT=SGGS.new department("IT","ch");
System.out.println(IT.hllo);
System.out.println(SGGS.collegename);

}
}
