import java.util.Scanner;
import java.lang.Scanner;

class sum
{
  int a, b, c;
  void input()
  {
    System.out.println("enter any two number");
    Scanner mano=new Scanner();
    a=mano.nextInt();
    b=mano.nextInt();
  }
  
  void output()
  {
    c=a+b;
    System.out.println("sum="+c);
  }
  
  void show()
  {
    System.out.println("program to add two number completed");
  }
  
}


class one
{
  public static void main(String[] args)
  {
    Scanner ob=new Scanner();
    ob.input();
    ob.output();
  }
}
