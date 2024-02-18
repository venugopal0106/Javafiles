public class execp {
    public static void main(String[] args) {
        int x,y=0;
        try{
            x=(y=10*10)/0;
        }
       // The commented out `catch` block in the code is used to catch any exceptions that may occur
       // during the execution of the `try` block. In this specific case, it is trying to catch an
       // `Exception` and then print a message "Denominator can not be Zero".
        catch(Exception e)
        {
        System.out.println("Denominator can not be Zero");
        }    
        finally{
        
        System.out.println(y);
        // The `finally` block in the code snippet is used to execute a piece of code regardless of
        // whether an exception is thrown or not. In this specific case, the `finally` block is
        // printing the value of variable `y` to the console. This block is generally used for cleanup
        // actions or releasing resources that need to be done whether an exception occurs or not.
        }
    }
}
