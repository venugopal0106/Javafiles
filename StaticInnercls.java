class outer{
    public static class inner{
        public static void M(){
            System.out.println("From static inner class");
        }
    }
public class A{
    public void M1(){
        System.out.println("From normal class");
    }
}
}
public class StaticInnercls {
    public static void main(String[] args) {
    outer.inner.M();
    // so,here without creating the instance of the we are calling the 
    // method that means we no need to crate an object for calling a static method
    outer obj1 =new outer();
    outer.A  obj2 =obj1.new A();
    obj2.M1();
        
    }    
}
