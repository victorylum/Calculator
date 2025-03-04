class Calculator{
static int a=60;
static int b=70;
static int c=20;
static int d=30;
static int e=12;
static int f=3;
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
public static void main (String[]args){
Calculator c=new Calculator();
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
