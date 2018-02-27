//ralph Perricelli
//programming assign 3
//csc111

public class Barber{

    //instance vars
    private int serviceTime;
    private Customer c;
    
    //default constructor
    public Barber(){
        serviceTime = 0;
        c = null;
    }
    
    public boolean isEmpty(){
    if(c == null){
        return true;
    }
    else{
        return false;
        }
    }
    
    public boolean addCustomer(Customer newCust){
        if(isEmpty()){
            customer = newCust;
            serviceTime = newCust.getServiceTime();
            return true;
        }
        else{
            return false;
        }

    }
    
    public void service(){
        serviceTime--;

        if(serviceTime == 0){
            removeCustomer();
        }
    }
    
    public void removeCustomer(){
        c = null;
    }
    
    public Customer peek(){
        return c;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("\nBarber's chair is empty");
        }
        else{
            System.out.println("Barber\n" + c.getName() + " is chair " + serviceTime + " left");
        }
    }

}
