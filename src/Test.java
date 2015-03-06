
public class Test {
    
    
    
    public static void main(String[]args){
        BCrypt b = new BCrypt();
        
        String salt = BCrypt.gensalt();
        String password = "alansmithiscool";
        
        String hash = BCrypt.hashpw(password, salt);
        
        System.out.println(BCrypt.checkpw(password, salt));
        
    }
    
}
