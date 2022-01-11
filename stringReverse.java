import java.util.Scanner;
class stringReverse
{
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);
       System.out.print("Enter a string and hit <ENTER>: ");
       String str= sc.nextLine();    
 
int len = str.length();
String rev = "";
for( int i = len - 1; i >= 0;i--)
{
 rev = rev + str.charAt(i);
}
        System.out.println("You entered the string :" +str);
        System.out.println("Reversed string is :" +rev);
    }
    
}