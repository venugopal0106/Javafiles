class Demo{
    Demo(){
        System.out.println("From constructor");
    }
    void show(){
        System.out.println("From method");
    }
}
public class AnonymousObj {
    public static void main(String[] args) {
        new Demo(); 
        /*Here we did not create the object...just using its physical existance its like creating the
        object without storing or D:\progamm files\Java\jdk-18.0.2.1\AnonymousObj.javaassgining*/

        new Demo().show();
    }
    
}
