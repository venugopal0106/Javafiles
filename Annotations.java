class A{
    public void m1(){
        System.out.println("Hello from m1");
    }
}
class B extends A{
    @override /* This is called Annotation.BY mentioning this we are telling to
    compiler that iam going to override the method so if i make any mistakes let me know....*/
    public void m11(){
        System.out.println("from M1");
    }
}
public class Annotations {
    public static void main(String[] args) {
        B obj =new B();
        obj.m1();

    }
    
}
