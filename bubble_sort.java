import java.util.Scanner;
import java.util.Arrays;
class bubble
{
    int temp;
    void Get_Input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of array Element : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array Element : ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        } 
        Get_cal(arr);
    }
    
    void Get_cal(int arr[])
    {
     int len=arr.length;   
        for(int i=0;i<len-1;i++)
        {
            for(int j=0;j<len-i-1;j++)
            {
            if(arr[j]>arr[j+1])
            {
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
        }
        compare(arr);
    }
void compare(int arr[])
{   int max=0,min=0;
    int len=arr.length;   
    for(int i=0;i<len;i++)
    {
        if(arr[i]>max)
        {
            max=arr[i];
            System.out.println(max+"");
        }
        if(arr[i]<min)
        {
            min=arr[i];
            System.out.println(min+"");
        }
       
    }
    Get_Display(arr);
}
    void Get_Display(int arr[])
    {
        int len=arr.length;   
        System.out.println("Array Element are");
        for(int i=0;i<len;i++)
        {
            System.out.println(arr[i]+"");
        } 
        System.out.println(max);
        System.out.println(min);
    }
}

class bubble_sort
{
    public static void main(String args[])
    {
        bubble obj=new bubble();
        obj.Get_Input();

    }
}