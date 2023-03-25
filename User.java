
package infinty;

/**
 *class User for logged
 * @author Manar

 */
/* 
Here the person is logged in only without being a passenger 
Entry will not be accepted unless it meets the conditions in the main 
*/
public class User {
    
    /**
     *   username of User
     */
    public String username;

    /**
     * password of User
     */
    public static String password;
    
    /**
     * default constructors User
     */
    public User() {
    }
    
    /**
     *constructors User
     * @param username 
     */
    public User(String username) {
        this.username = username;
    }
    
    /**
     * method Check password
     * @param password
     * @return false if length less than 8 
     * @return true if length equal 8
     */
    public boolean Check(String password) {
        if (password.length() < 8) {
            return false;
        }
        int charCount = 0;
        int numCount = 0;
        for (int i = 0; i < password.length(); i++) {
            // قطع حرف واحد من الباسوورد لنص (0,1)
            //Take the character at index i as sting "Take only one letter" 
            String ss = password.substring(i, i + 1);
            /* exception handling
            try Take the String and try to convert it to a number Integer and put it in the variable x
            If it works then it is a number and add the number ( 1 )
            */
            try {
                int x = Integer.parseInt(ss);
                numCount++;
            } 
             /* exception handling
             If it not works then go to catch and This means that it is
            not a number so if char add 1 or if not return false 
            */
            catch (Exception e) {
                if (Check(ss.charAt(0))) {
                    charCount++;
                } else {
                    return false;
                }
            }
        }
//       
        if ((charCount >= 2 && numCount >= 2)) {
            User.password = password;
            return true;
        }
        return false;
    }
//overloading 

    /**
     * method overloading
     * @param ch is character
     * @return true if check condition
     */
    public boolean Check(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }
    
       
    /**
     *method toString Override  
     * @return string 
     */
    @Override
    public String toString() {
        return "username:" + username + "password:" + password;
    }
}