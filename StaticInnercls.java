class outer{
    public static class inner{
        public static void M(){
            System.out.println("From static inner class");
        }
    }
}
public class StaticInnercls {
    public static void main(String[] args) {
    outer.inner.M();
        
    }    
}
