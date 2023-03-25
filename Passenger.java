
package infinty;

import java.util.ArrayList;

/**
  * @author Manar
 * class Passenger
 * All Implemented Interfaces:BookTicket
 */
/* class passenger specific It contains information that we will obtain from it
and  ArrayList Ticket For all flights booked and reservTicket and 
implements BookTicket interface method GetSeatPrice
*/
public class Passenger implements BookTicket {

    //instance varible
/**
     * Passenger FirstName
     */
    private  String FirstName;
    /**
     * Passenger LastName
     */
    private String LastName;
     /**
     * Passenger Gender
     */
    private String Gender;
     /**
     * Passenger Age
     */
    private int Age;
    /**
     * Passenger PassportNum
     */
    private String PassportNum;
    //ArrayList <object Ticket> and name is allTickets 
     /**
     * ArrayList Ticket 
     */
    public ArrayList<Ticket> allTickets;
    /**
     *   Number ID of Ticket 
     */
    public Ticket NumID;
     /**
     *   Number increase in loop 
     */
        public int Num=0;

 
     /**
     *    default constructor Passenger
     */
    public Passenger() {
        allTickets = new ArrayList<Ticket>();
    }
     /**
     *     constructor Passenger
     * @param FirstName
     * @param LastName
     * @param Gender
     * @param Age
     * @param PassportNum
     */
    public Passenger(String FirstName, String LastName, String Gender, int Age, String PassportNum) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Gender = Gender;
        this.Age = Age;
        this.PassportNum = PassportNum;
        allTickets = new ArrayList<Ticket>();
    }
/**
     * get the FirstName attribute 
     * @return  FirstName of passenger
     */
    public String getFirstName() {
        return FirstName;
    }
     /**
     * set the FirstName attribute 
     * @param FirstName of passenger
     */
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }
   /**
     * get the LastName attribute 
     * @return  LastName of passenger
     */
    public String getLastName() {
        return LastName;
    }
    /**
     * set the LastName attribute 
     * @param LastName of passenger
     */
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }
     /**
     * get the getGender attribute 
     * @return  Gender of passenger
     */
    public String getGender() {
        return Gender;
    }
  /**
     * set the Gender attribute 
     * @param Gender of passenger
     */
    public void setGender(String Gender) {
        this.Gender = Gender;
    }
  /**
     * get the Age  attribute 
     * @return  Age of passenger
     */
    public int getAge() {
        return Age;
    }
 /**
     * set the Age attribute 
     * @param Age of passenger
     */
    public void setAge(int Age) {
       
        this.Age = Age;
    }
//        return PassportNum;
    /**
     * get the PassportNum  attribute 
     * @return  PassportNum of passenger
     */
    public String getPassportNum() {
        return PassportNum;
    }
/**
     * set the PassportNum attribute 
     * @param PassportNum of passenger
     */
      public void setPassportNum(String PassportNum) {
          this.PassportNum = PassportNum;
    }
     /**
     * reservTicket method
     * @param t is element Ticket 
     */
      public void reservTicket(Ticket t) {
        allTickets.add(t);
    }
//implements BookTicket interface (return price) and add price for Ticket
      /**
     * GetSeatPrice method  
     * @return price of each Ticket 
     */
    @Override
    public double GetSeatPrice() {
        double price = 0;
        for (Ticket t : allTickets) {
            price =price+ t.GetSeatPrice();
           
        }
        return price;
    }
      /**
     * NamegenString method  
     * @param name if any string
     * @return true if include string   
     */
     public static boolean namegenString(String name)
    {
        // If string is empty or null
        if (name == null || name.equals("")) {
 
            // Return false
            return false;
        }
        // If we reach here we have character/s in string
        for (int i = 0; i < name.length(); i++) {
            // Getting character at indices
            // using charAt() method
            char cha = name.charAt(i);
            if ((!(cha >= 'A' && cha <= 'Z')) && (!(cha >= 'a' && cha <= 'z'))){
                return false;
            }
        }
        // String is only alphabetic
        return true;
    }

   /**
     *method toString Override  
     * @return string information
     */
    @Override
    public String toString() {
       
        String s= "FirstName=" + FirstName + ", LastName=" + LastName + 
                ", Gender=" + Gender + ", Age=" + Age + 
                ", PassportNum=" + PassportNum +"\n";
                for (Ticket t : allTickets) {
                    
                    s+=t.DetailsFlight+"\n"+"NumID="+ t.NumID+"\n" ;
                    s+=t+"\n________________________________________________\n";
        }
                s+= GetSeatPrice();
                return s;
                
    }
     /**
     * num method  
     * @return Num if include error in mane   
     */
    public int num(){
    return Num;
    }
}

