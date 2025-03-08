public class Calculator{
static int a;
static int b;
static int c;
static int d;
static int e;
static int f;
int answer;
public int add (){
answer =a+b;
return answer;
}
public int subtract(){
answer =b-c;
return answer;
}
public int multiple(){
answer =f*e;
return answer;
}
public int divide(){
answer =a/d;
return answer;
}
public Calculator(){
}
public Calculator(int a,int b,int c,int d,int e,int f){
this.a=a;
this.b=b;
this.c=c;
this.d=d;
this.e=e;
this.f=f;
}
public static void main (String[]args){
Calculator c=new Calculator(60,70,20,30,12,3);
  int g=c.add();
  System.out.println(g);
  int h=c.subtract();
  System.out.println(h);
    int j=c.multiple();
  System.out.println(j);
  int k=c.divide();
  System.out.println(k);
  }
}
