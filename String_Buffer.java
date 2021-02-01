public class String_Buffer
{
    public static void main(String args[])
    {
        StringBuffer obj=new StringBuffer("HooGhly");
        obj.append("  Engineering");
        obj.append("  &");
        obj.append("  Technology");
        obj.append("  College");                
        obj.replace(3,3,"g");                   //replace
        obj.reverse();                          //reverse word
        obj.ensureCapacity(50);                 //ensuere capacity
        System.out.println(obj.capacity()); 
    }
}