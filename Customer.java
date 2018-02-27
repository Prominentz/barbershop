//Ralph Perricelli
//programmign assign 3
//csc111

public class Customer{

    //instance vars
    private int arrivalTime;
    private int serviceTime;
    private String name;
    private Customer next;
    
    //default constructor
    public Customer(){
        name = "";
        next = null;
        arrivalTime = 0;
        serviceTime = 0;
    }
    
    //constructor
    public Customer(String myName, int arriveTime, int serveTime){
        name = myName;
        arrivalTime = arriveTime;
        serviceTime = serveTime;
        next = null;
    }
    
    //getsnext customer
    public Customer getNext(){
        return next;
    }
    
    //gets name, returns as string
    public String getName(){
        return name;
    }
    
    //sets new name to customer
    public void setName(String newName){
        name = newName;
    }
    
    //gets time arrived
    public int getArrivalTime(){
        return arrivalTime;
    }
    
    //sets new arrival time
    public void setArrivalTime(int newTime){
        arrivalTime = newTime;
    }
    
    //gets service time
    public int getServiceTime(){
        return serviceTime;
    }
    
    //sets new service time
    public void setServiceTime(int newTime){
        serviceTime = newTime;
    }

    //sets customer as next
    public void setNext(Customer nextCust){
        next = nextCustomer;
    }
    
    public boolean hasNext(){
        return next == null;
    }

    //displays customer info
    public void display(){
        System.out.println("\t" + name + " : " + " Arrival Time = " + arrivalTime + ':' + " Service Time = " + serviceTime);
    }
    
}