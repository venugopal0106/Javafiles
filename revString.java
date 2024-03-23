public class revString {
    public static void main(String[] args) {
    
        String s ="123456";
        String rs= " " ;
        int i = s.length();
        char c;
        for (int a=0;a<i;a++){
            c=s.charAt(a);
            rs= c+rs;
        }
    System.out.println(rs);

    }
}
