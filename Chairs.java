//ralph Perricelli
//Programming assign 3
//csc111
public class Chairs{
    
    //instanc vars
    private int totalNum = 0;
    private int first;
    private int last;
    private int size = 3;
    private Customer[] c;

    //defaulut constructor
    public Chairs(){
        size = 3;
        c = new Customer[size];
        first = 0;
        last = 0;
    }
    
    //adds customer to chair
    public void addCustomer(Customer firstCustomer){
        if(!isFull()){
            c[first] = firstCustomer;
            first = (first+1)%size;
            totalNum++;
            }
            else{
                System.out.println("Queue is full!");
        }
    }


    //removes customer from chair
    public Customer removeCustomer(){
        Customer lastCustomer = customer[last];
        last = (last+1) %size;
        totalNum--;
        return lastCustomer;
    }


    public Customer peek(){
        return c[last];
    }	


    public void display(){
        if(!isEmpty()){
            System.out.println("\nChairs");
            
            for(int i = 0;i < totalNum; i++){
                c[(last+i)%size].display();
            }
        }
        else{
            System.out.println("\nChairs are empty");
        }

    }

    //checks to see if queue is full
    public boolean isFull(){
        if(totalNum == size){
            return true;
        }
        else{
            return false;
        }
    }

    //checks to see if empty
    public boolean isEmpty(){
        if(totalNum == 0){
            return true;
        }
        else{
            return false;
        }
    }
}

