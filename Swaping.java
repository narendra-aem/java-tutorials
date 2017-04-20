class Swaping{
public static void main(String args[]){
int x = -15;
int y  = -30;
System.out.println("before swaping x = "  + x);
System.out.println("before swaping y = " + y);
x = x^y;
y = x ^y;
x= x^y;
System.out.println("after swaping x =" + x );
System.out.println("after swaping y = " + y );

 }

}
