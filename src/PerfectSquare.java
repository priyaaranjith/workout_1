import java.util.Scanner;

public class PerfectSquare {
    public static void main (String[] args){
        double result;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println("perfect squares are:"+"/t"+n1+"\t"+"and"+"/t"+n2);
        int i;
        for (i=n1;i<=n2;i++){
            result=Math.sqrt(i);
            if(result == (int) Math.sqrt(i))
            {
                System.out.println((i));

            }

        }


    }
}



