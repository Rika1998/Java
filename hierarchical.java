class h1{
    int a=10,b=10;
    void display(){
        System.out.println("Method of class 1");                 //PARANT CLASS
        System.out.println(a+b);
    }
}
class h2 extends h1{
    int a=100,b=12;
    void show(){
        System.out.println("Method of class 2 inhritance 1");      // INHRITANCE FROM CLASS 'h1'
    }
}
class h3 extends h1{
    int a=11,b=22;                                                  // INHRITANCE FROM CLASS 'h1'
    void dis(){
        System.out.println("Method of Class 3 from 1");
    }
}
public class hierarchical {
    public static void main(String args[])
    {
        h3 obj1=new h3();
        obj1.dis();
        obj1.display();

        h2 obj2=new h2();
        obj2.show();
        obj2.display();
    }
}
