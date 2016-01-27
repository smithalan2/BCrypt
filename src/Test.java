public class Test {
    public static void main(String[]args){
        System.out.println("This is a simple example of using BCrypt to hash and verify passwords\n\n");
        System.out.println("First we generate some salt, then hash our password with that salt.");
        System.out.println("Then we use the checkpw function to compare some text (our password) against our hashed password");
        System.out.println("The checkpw function returns true or false\n\n");
        //Create new BCrypt object
        BCrypt b = new BCrypt();
        //Generate some salt to hash the password
        String salt = BCrypt.gensalt();
        //Hash the password using the salt
        String hash = BCrypt.hashpw("mypassword", salt);
        //Is the password password?
        System.out.println("Is the password = password: "+BCrypt.checkpw("password", hash));
        //Is the password mypassword?
        System.out.println("Is the password = mypassword: "+BCrypt.checkpw("mypassword", hash)); 
    }
    
}
