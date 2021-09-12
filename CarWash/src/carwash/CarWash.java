/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carwash;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 *
 * @author Mohammad.Jaha
 */
import javax.swing.JOptionPane;


class CarWash
  {
  public static void main(String[] args)throws Exception
     {
         
         File F=new File("CarWash.txt");
         if(!F.exists()){
             PrintWriter d=new PrintWriter (F);
             System.out.println(F.getAbsolutePath());
             d.close();
         }
         
        String s=JOptionPane.showInputDialog("How Many Cars The Car Wash Can Contains");
        int a=Integer.parseInt(s);
        Cars car=new Cars(a);
        Scanner M=new Scanner (F);
        
         
         
         
         
         String w1=" 1 to Enter Car\n";
         String w2=" 2 to Remove Car\n";
         String w3=" 3 to Know How many Cars in the Car Wash Machine\n";
         String w4=" 4 to Know The Car In The Front\n";
         String w0=" 0 to ShutDown\n";
         
         String q1="1 to Normal Wash\n";
         String q2="2 to Dry Wash\n";
         String q3="3 to Wax Wash\n";
         String q4="4 to Shiny Wash\n";
         
         int s33=0;
       
     for(;;){
         
         String ss=JOptionPane.showInputDialog("Enter \n"+w1+w2+w3+w4+w0);
         int b=Integer.parseInt(ss);
         if(b==1){
             if(car.isFull())
                 JOptionPane.showMessageDialog(null,"The Car Wash is Full");
             else{
                 String s1=JOptionPane.showInputDialog("Enter The Customer Name");
                 String s2=JOptionPane.showInputDialog("Enter The Customer Car's Name");
                 for(;;){
                     String s3=JOptionPane.showInputDialog("What Kind Of Wash?\nEnter\n"+q1+q2+q3+q4);
                     s33=Integer.parseInt(s3);
                     if (s33==1||s33==2||s33==3||s33==4)
                        break;
                     else
                         JOptionPane.showMessageDialog(null,"Wrong InPut");}
                 car.enter(s1,s2,s33);
                 car.display();
             }
          }
       else if(b==2){
           String t=car.remove();
           if(t=="")
              System.out.println();
           else
              System.out.println("Customer { "+t+" } Has Come Out ");
          }
       else if(b==3)
          JOptionPane.showMessageDialog(null,"There is "+car.size()+" Cars in the Car Wash");
       else if(b==4){
          String zz=car.peekFront();
          if(zz=="")
            System.out.println();
          else
            JOptionPane.showMessageDialog(null,"The Car in the Front is   "+zz);
       }
        else if(b==0){
            if(car.size()==0)
               break;
            else
               JOptionPane.showMessageDialog(null,"You Should Remove All The Cars Befor ShutDown");
        }
        else
          JOptionPane.showMessageDialog(null,"Wrong Input");
}
  
  JOptionPane.showMessageDialog(null, "ShutDown");  
  
  M.close();
  car.iii();   
         
     }  // end main()
  }  // end class
