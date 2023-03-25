package infinty;

/**
 * @author Manar
 * Flight class 
 *in class Flight we give it in the main (we create ArrayList from the flight class of the flight class that assigns values ​​to all these attribute )
*/
public class Flight {
   /**
    *Flight ID attribute of the flight number
    */ 
    private int FlightID;
    /**
     * Departure:The place of the flight(the flight will go from where? From which city?)
     */
    private String Departure;
    /**
     *DepartureTime:Flight departure time (Example: 04:05 PM) 
     */
    private String DepartureTime;
    /**
     *DepartureData:Flight departure date (Example: 1-1-1444)
     */
    private String DepartureData;
    /**
     * Arrival:The destination of the flight (Where will you go? To a city?)
     */
    private String Arrival;
    /**
     * ArrivalTime:Flight Arrival time (Example: 06:10 PM)
     */
    private String ArrivalTime;
    /**
     *  ArrivalData:Flight Arrival date (Example: 1-1-1444)
     */
    private String ArrivalData;

    /**
     * Polymorphism  object - array of object( sub class EconomicTicket and BusinessTicket and FirstClassTicket)
     */
        public Ticket[] tickets = new Ticket[3];
        
    /**
    * variable  in loop addTicket
    */
    int num =0;
    
    /**
     * default constructor Flight
     */
    public Flight() {

    }
  /**
     * constructor Flight
     * @param FlightID
     * @param Departure
     * @param DepartureTime
     * @param DepartureData
     * @param Arrival
     * @param ArrivalTime
     * @param ArrivalData
     */
    public Flight(int FlightID, String Departure, String DepartureTime, String DepartureData, String Arrival, String ArrivalTime, String ArrivalData) {
        this.FlightID = FlightID;
        this.Departure = Departure;
        this.DepartureTime = DepartureTime;
        this.DepartureData = DepartureData;
        this.Arrival = Arrival;
        this.ArrivalTime = ArrivalTime;
        this.ArrivalData = ArrivalData;
    }
    /**
     * get FlightID attribute
     * @return FlightID 
     */

    public int getFlightID() {
        return FlightID;
    }
    /**
     *set FlightID attribute 
     * @param FlightID 
    */
    public void setFlightID(int FlightID) {
        this.FlightID = FlightID;
    }
    /**
     * get Departure attribute 
     * @return Departure 
    */
    public String getDeparture() {
        return Departure;
    }
    
    /**
      *  set Departure attribute 
      * @param Departure
    */
    public void setDeparture(String Departure) {
        this.Departure = Departure;
    }
    /**
      * get DepartureTime attribute 
      * @return  DepartureTime
    */
    public String getDepartureTime() {
        return DepartureTime;
    }
    /**
    *  set DepartureTime attribute 
    * @param DepartureTime
    */
    public void setDepartureTime(String DepartureTime) {
        this.DepartureTime = DepartureTime;
    }
    /**
     *  get DepartureData attribute 
     * @return DepartureData
   */
    public String getDepartureData() {
        return DepartureData;
    }
    
    /**
     * set DepartureData attribute 
     * @param  DepartureData
    */ 
 public void setDepartureData(String DepartureData) {
        this.DepartureData = DepartureData;
    }
 
   /**
    *  get Arrival attribute 
    * @return  Arrival
  */ 
    public String getArrival() {
        return Arrival;
    }
    
   /**
    * set Arrival attribute 
    * @param  Arrival
   */ 
    public void setArrival(String Arrival) {
        this.Arrival = Arrival;
    }
   /**
    *  get ArrivalTime attribute 
    * @return  ArrivalTime
   */
    public String getArrivalTime() {
        return ArrivalTime;
    }
 /**
 *set ArrivalTime attribute 
 *@param  ArrivalTime
 */ 
    public void setArrivalTime(String ArrivalTime) {
        this.ArrivalTime = ArrivalTime;
    }
 /**
 *get ArrivalData attribute 
 *@return ArrivalData
 */ 
    public String getArrivalData() {
        return ArrivalData;
    }
    
  /**
 *set ArrivalData attribute 
 *@param  ArrivalData
 */ 
    public void setArrivalData(String ArrivalData) {
        this.ArrivalData = ArrivalData;
    }

/**
 *get Number attribute 
 *@return num
 */ 
    public int getNum() {
        return num;
    }
/**
 * set Number attribute
 *@param  num 
 */     public void setNum(int num) {
        this.num = num;
    }
/**
 * above in Ticket[] tickets = new Ticket[3]; Originally we have 3 subclass EconomicTicket and BusinessTicket and FirstClassTicket  So on every Flight we will add them
 * @param t   public Ticket[] tickets = new Ticket[3];
*/
    public void addTicket(Ticket t) {
        if (num < 3) {
            tickets[num++] = t;
        }
    }
 /**
  * get Ticket attribute
  * @param i 
  * @return tickets
  */
    public Ticket getTicket(int i) {
        return tickets[i];
    }

    /**
     * Show tickets available for each flight
     * @pre 
     */
    public void displayticket() {
        for (int i = 0; i < 3; i++) {
            System.out.println((i+1)+"-"+tickets[i]);
        }
         System.out.println("Please choose Ticket");
    }

    /**
     *method toString Override  
     * @return string information
     */
    @Override
    public String toString() {
        return " FlightID=" + FlightID + "\n\tDeparture=" + Departure + " DepartureTime=" + DepartureTime
                + " DepartureDate=" + DepartureData + "\n\tArrival=" + Arrival + "ArrivalTime=" + ArrivalTime
                + " ArrivalData=" + ArrivalData+"\n-------------------------------------------------------------------";
        
    }
}