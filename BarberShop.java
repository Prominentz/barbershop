//ralph Perricelli
//programming assign 3
//csc111

public class BarberShop{

    public static void main (String[] args){

        //instance variables
        Customer next, arriving;
        Chairs waitingChair;
        Queue arrivalQueue;
        Barber barber;
        int time = 0;
        arrivalQueue = new Queue();
        arrivalQueue.readFile();
        chair = new Chairs();
        barber = new Barber();
        
        while(!arrivalQueue.isEmpty() || !chair.isEmpty() || !barber.isEmpty())
        {
            System.out.println("Time = " + time + "\n");

            if(barber.isEmpty() && !chair.isEmpty()){
                barber.addCustomer(chair.peek());
                chair.removeCustomer();
            }

            if(arrivalQueue.peek().getArrivalTime() == time){
                if(chair.isFull()){
                    System.out.println("Chairs are full");
                    System.out.println("\t" + arrivalQueue.peek().getName() + " has left");
            }
            else{
                waitingChair.addCustomer(arrivalQueue.peek());
                System.out.println("A chair is open");
                System.out.println("\n" + arrivalQueue.peek().getName() + " has sat down");
            }
            arrivalQueue.removeCustomer();

        }
        chair.display();
        barber.display();
        System.out.println("\nArrival List");
        arrivalQueue.display();
        time++;
        barber.service();



			System.out.println("\n________________________\n");

		}

	







	}

}