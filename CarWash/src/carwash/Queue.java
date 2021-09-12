/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carwash;

/**
 *
 * @author Mohammad.Jaha
 */// Queue.java

// queue

// run this program: java QueueApp
import javax.swing.*;
import java.io.*;      
// for I/O

 

public class Queue extends recall

  {

  private int maxSize;

  private String[] queArray;

  private int front;

  private int rear;

  private int nItems;

  private PrintWriter ll;
  
  private File F;
//--------------------------------------------------------------

  public Queue(int s)throws Exception         // constructor

     {
         super ();
         F=new File("CarWash.txt");
         
         ll=new PrintWriter (F);
         
         for(int i=0;i<super.size();i++)
             ll.println(super.write(i));

     maxSize = s;

     queArray = new String[maxSize];

     front = 0;

     rear = -1;

     nItems = 0;

     }
//--------------------------------------------------------------

    public void insert(String jq,String i)

     {
        if(rear == maxSize-1)         // deal with wraparound
            rear = -1;
        queArray[++rear] = jq;         // increment rear and insert
        nItems++;
        JOptionPane.showMessageDialog(null,"The Customer {"+jq+"} Has Enter");
        JOptionPane.showMessageDialog(null,"He Must Pay "+i);
        ll.println(jq+i);
     }
     


//--------------------------------------------------------------

    public String remove()         // take item from front of queue

     {
        if(isEmpty()){
            JOptionPane.showMessageDialog(null,"The Car Wash Is Empty");
            return "";}
        else
     {
          String temp = queArray[front++]; 
          if(front == maxSize)         
              front = 0;
          nItems--;                     
          return temp;}
     }


//--------------------------------------------------------------

  public String peekFront()      // peek at front of queue

     {

      if(isEmpty()){

         JOptionPane.showMessageDialog(null,"The Car Wash Is Empty");

         return "";

}

else

     return queArray[front];

     }

//--------------------------------------------------------------

  public boolean isEmpty()    // true if queue is empty

     {

     return (nItems==0);

     }

//--------------------------------------------------------------

  public boolean isFull()     // true if queue is full

     {

     return (nItems==maxSize);

     }

//--------------------------------------------------------------

  public int size()           // number of items in queue

     {

     return nItems;

     }

  
  public void iii(){
      ll.close();
  }
//--------------------------------------------------------------

  }  // end class Queue
