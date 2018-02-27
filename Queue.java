//Ralph Perricelli
//Programming assign 3
//csc111

import java.io.*;
import java.util.Scanner;

public class Queue{

    //instance vars
    private Customer firstCust;
    private Customer lastCust;
    private int numCust;
    
    //default constructor
    public Queue(){
        numCust=0;
        firstCust = null;
        lastCust = null;
    }
    
    //adds new customer to queue
    public void addCustomer(Customer newCust){
    
        //checks to see if queue is empty
        if(firstCust == null && lastCust == null){
            numCust++;  //updates num of customers in queue
            firstCust = newCust;  //sets new Cust to first 
            lastCust = newCust;  //sets new cust to last position since it is only thing in queue
        }
        else{
            numCust++; //updates
            firstCust.setNext(newCust); //sets pointer
            firstCust = newCust; //sets new cust to first
        }
    }
    
    //checks for empty
    public boolean isEmpty(){
        
        //checks to see if num is 0
        if(numCust == 0){
            return true;
        }
        else{
            return false;
        }
    }
    
    //removes customer from queue
    public Customer removeCustomer(){
        Customer temp = lastCust; 
        lastCust = lastCust.getNext();
        numCust--;
        return temp;
    }
    
    public Customer peek(){
        if(!isEmpty()){
            return lastCust;
        }
        else{
            Customer temp = new Customer("temp",1, 1);
            return temp;
        }
    }
    
    
    //reads file and sets data accordignly
    public void readFile(){
        String inputLine;
        
        Scanner fileInput;
        File inFile = newFile("Barber.txt");
        System.out.println("Opening and reading");
    
            try{
                fileInput = new Scanner(inFile);
        
                while(fileInput.hasNext()){
                    Customer temp = new Customer();
                    temp.setArrival(fileInput.nextInt()); //sets arrival time
                    temp.setService(fileInput.nextInt()); //sets service time
                    temp.setName(fileInput.nextLine()); //sets name of customer
                    addCustomer(temp);
                }
                fileInput.close();
            } //end try
    
        catch (FileNotFoundException e){
            System.out.println(e);
            System.exit(1);
        }
    }
    
    
    public void display(){
        Customer temp = lastCust;
        while(temp != null){
            temp.display();
            temp = temp.getNext();
        }
    }
    
    
}