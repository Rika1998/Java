class cal
{
    public int add(int i,int j)
    {
        return i+j;
    }
}
class cal_adv extends cal
{
    public int mul(int i,int j)
    {
        return i*j;
    }
}
public class sing_Inheritance {
    public static void main(String args[])
    {
        cal_adv obj=new cal_adv();
        System.out.println(obj.add(10,20));
        System.out.println(obj.mul(20,5));
    }
}
