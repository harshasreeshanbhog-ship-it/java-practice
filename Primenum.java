mport java.util.*;
public class Primenum
    {
    public static void main(String[] args) {
        int a;
        int count=0;
        Scanner q = new Scanner(System.in);
        System.out.println("enter the number:");
        a=q.nextInt();
        for(int i=2;i<=a/2;i++)
            {
                if(a%i==0)
                    count++;
                     break;
            }
        if(count==0)
        {
            System.out.println("the number is prime");
        }
        else{
            System.out.println("the number is a composite number");
         }
    }
}
/*
output:
enter the number:
2
the number is prime
enter the number:
4
the number is composite
*/       
