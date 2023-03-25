
package infinty;
/**
 * abstract class Ticket and implements BookTicket specific To book tickets and flight information or the passenger if we need
 * @author Manar
 */

public abstract class Ticket implements BookTicket {
//    Random ticket number for each flight

    /**
     *number of ID passenger
     */
        public int NumID;

    /**
     * object from calss Flight for Details Flight
     */
        public Flight DetailsFlight;

    /**
     *object from calss Passenger for Passenger Details if we need
     */
        public Passenger PassengDetails;
    /**
     * Row for seats number
     */
        public static final int Row = 4;

    /**
     *column for seats number
     */
    public static final int Col = 5;

    /**
     *Array to the seats number 
     * It will not be booked into our system because it will come at the time of boarding (we only show you the seats you can see at that time so you know about them)in main
     */
    public char[][] SeatNumber = new char[Row][Col];

    /**
     *default constructor Ticket
     */
    public Ticket(){
}

    /**
     *constructor Ticket
     * @param NumID
     * @param DetailsFlight
     * @param PassengDetails
     */
    public Ticket( int NumID,Flight DetailsFlight, Passenger PassengDetails) {
        this.NumID = (int)(Math.random()*(101));
        this.DetailsFlight = DetailsFlight;
        this.PassengDetails = PassengDetails;
    }

    /**
     *Ticket clone The ticket inside the flight, we will give the passenger one of them, and the passenger will change the ticket
,so it will affect them, It is supposed to take a separate copy of it (create a new thing of the same type,but it will be different for the passenger)
     * @param id
     * @param F
     * @return
     */
    
    public abstract Ticket clone (Ticket id ,Flight F);

     /**
     * method toString Override    
     * @return   String For NumID
     */
    @Override
    public String toString() {
        return " NumID= "+NumID;
    }

    
}
