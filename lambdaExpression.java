interface A{
    public void method();
}
public class lambdaExpression {
    public static void main(String[] args) {
        A obj = ()->System.out.println("from object class"); 
        /*Here -> represents the lambda expression it meant that by indicating that symbol we are 
        telling the compiler that i dont write the remaining code u just compile it, so now instead of writing the
        remaining code we can simply use this lambda expression...
          */
        obj.method();
    }
    
}
