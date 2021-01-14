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
class cal_adv_1 extends cal_adv
{
    public int div(int i,int j)
    {
        return i/j;
    }
}
public class Multi_Inheritance {
    public static void main(String args[])
    {
        cal_adv_1 obj=new cal_adv_1();
        System.out.println(obj.add(10,20));
        System.out.println(obj.mul(20,5));
        System.out.println(obj.div(20,5));
    }
}
