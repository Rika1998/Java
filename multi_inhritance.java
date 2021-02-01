class calc{                                           //SUPER CLASS  PARANT PARANT CLASS
  
    public int add(int i,int j){
        return i+j;
    }
}
class calcAdv extends calc{             //SUB CLASS     1ST CHILD CLASS
    public int mul(int i,int j)
    {
        return i*j;
    }
    public int sub(int i,int j)         //SUB CLASS   2ND CHILD CLASS
    {
        return i/j;
    }
}
class vad extends calcAdv
{
    int f=1;
    public int fact(int n)              // CHILD CHILD CLASS
    {
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }

        return f;
    }
}
public class  multi_inhritance{
    public static void main(String[] args) {
        
          calc obj1=new calc();
          int res1=obj1.add(10,20);
          System.out.println(res1);
          

        calcAdv obj2=new calcAdv();
        int res2=obj2.mul(100,200);
        System.out.println(res2);

        calcAdv obj3=new calcAdv();
        int res3=obj3.sub(100,200);
        System.out.println(res3);

        vad obj4=new vad();
        int res4=obj4.fact(5);
        System.out.println(res4);

    }  
    
}
