
package infinty;

/**
 * @author Manar
 * FirstClassTicket inheritance from Ticket its subclass 
 * All Implemented Interfaces:BookTicket 
 * this class is subclass from Ticket and Each ticket will have its own category and each category has a different price for each flight so in this class 
we Override method GetSeatPrice and clone also to string 
 */

public class FirstClassTicket extends Ticket {
    /**
     * SeatType of FirstClassTicket 
     */
 public String SeatType;
     /**
     * Price of FirstClassTicket 
     */
 public double Price;
  /**
     * default constructors FirstClassTicket 
     */
    public FirstClassTicket() {
  
    }
     /**
     * constructors FirstClassTicket
     * @param SeatType
     * @param Price 
     */
    public FirstClassTicket(String SeatType,double Price ){
    this.SeatType="FirstClass";
    this.Price=Price;
    }
 /**
     * constructors FirstClassTicket
     * @param NumID 
     * @param DetailsFlight 
     * @param PassengDetails
     */
    public FirstClassTicket(int NumID, Flight DetailsFlight, Passenger PassengDetails) {
  super( NumID,DetailsFlight, PassengDetails);  
    }

    @Override // implements BookTicket 
     /**
     * implements BookTicket  
     * @return Price 
     */
       public double GetSeatPrice(){

         return Price ;
       }
      /**
     * method clone Override   
     * @param  id  Ticket 
     * @param  F   
     * @return t   Ticket 
     */
    @Override 
  public  Ticket clone (Ticket id ,Flight F){
 Ticket t= new FirstClassTicket(SeatType , Price);
 t.DetailsFlight=F;
 t.NumID= (int)(Math.random()*(101));
 return t;
 }
     /**
     * method toString Override    
     * @return   String For seat type information 
     * will display string of this object
     */
    @Override
    public String toString() {
        return  "SeatType is : " + SeatType +","+" Price ="+Price+" Rial"+"\n*Wi-Fi&USB  *On-Demand TV  *Prayer Area *fresh meals \n Baggage Info: 1 Piece + 7 Kilos (Per Person)" ;
    }
}
