import java.util.Scanner;
class calc{
  
    public int add(int i,int j){
        return i+j;
    }
}
public class inheritence {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        calc obj=new calc();
       
       System.out.println("\n Enter the value of i : ");                            // SINGLE TYPE INHERITANCE
       int i=sc.nextInt();
       System.out.println("\n Enter the value of j : ");
       int j=sc.nextInt();
       System.out.println("The Value of Addiation is "+obj.add(i,j));

    }
    
}
