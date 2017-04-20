class Swapping{
public static void main(String[] args)
{
int a=3;
int b=5;
a=a+b;
b=a-b;
a=a-b;
System.out.println("the value of a after swap is:" + a);
System.out.println("the value of b after swap is:" + b);
}
}