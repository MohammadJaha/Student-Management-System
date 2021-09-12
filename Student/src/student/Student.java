/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package student;



import java.awt.*;
import java.io.*;
import javax.swing.*;


/**
 *
 * @author Mohammad Jaha
 */
public class Student {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception{  
        JOptionPane.showMessageDialog(null,"           "
                + "King AbdulAziz University"
                +"\n        Student Managment System\n             "
                + "                 2013"
                + "\n\n\n                   Copyrights For\n"
                + "                Mohammad Jaha\n\n");
        String name[]=new String[50];
        long id[]=new long[50];
        double cgpa[]=new double[50];
        String nat[]=new String[50];
        int age[]=new int[50];
        int i=0;
        String t;
        int a;
        for(;;){
           t=JOptionPane.showInputDialog("Choose a Process"
                + "\n\n1- Add a new Student"
                + "\n2- Show all students"
                + "\n3- Show the student with the highest GPA"
                + "\n4- Update CGPA for a student"
                + "\n5- Delete a student"
                + "\n6- Sort by name or GPA"
                + "\n7- Save all the data in a text file"
                + "\n8- Exit\n\n");
           a=Integer.parseInt(t);
           if(a==1){
               if(i==50){
                   JOptionPane.showMessageDialog(null,"There is Already 50 Student");
               }else{
               name[i]=JOptionPane.showInputDialog("Enter The Name Of The Student");
               String w=JOptionPane.showInputDialog("Enter The ID");
               id[i]=Long.parseLong(w);
               String w1=JOptionPane.showInputDialog("Enter The GPA");
               cgpa[i]=Double.parseDouble(w1);
               nat[i]=JOptionPane.showInputDialog("Enter The Nationality");
               String w2=JOptionPane.showInputDialog("Enter The Age");
               age[i]=Integer.parseInt(w2);
               JOptionPane.showMessageDialog(null,"New Student Has been Added");
               i++;}
           }
           if(a==2){
               int i1=0;
               String sh = "";
               if(i1==i)
                   JOptionPane.showMessageDialog(null, "No Student Has been Recorded");
               else{
                    for(;i1<i;i1++)
                        sh+=i1+1+" "+name[i1]+"  "+id[i1]+"  "+cgpa[i1]+"  "
                               +nat[i1]+"  "+age[i1]+"\n";
                    JOptionPane.showMessageDialog(null,"The Data Of All The Studens\n"
                            +sh);}
           }
           if(a==3){
               int i2=0;
               double hi=cgpa[i2];
               int hig=0;
               for(;i2<i;i2++)
                   if(hi<cgpa[i2]){
                       hi=cgpa[i2];
                       hig=i2;}
               JOptionPane.showMessageDialog(null,"The Student With The Highest"
                       + "GPA\n"
                       +(hig+1)+" "+name[hig]+"  "+id[hig]+"  "+cgpa[hig]+"  "
                               +nat[hig]+"  "+age[hig]+"\n");   
           }
           if(a==4){
               String ms=JOptionPane.showInputDialog("Enter The Student ID");
               long up=Long.parseLong(ms);
               int io=-1;
               for (int ii=0;ii<i;ii++)
                   if(up==id[ii])
                       io=ii;
               if(io==-1)
                   JOptionPane.showMessageDialog(null,"There is No Student With This ID"
                           + " "+up);
               else{
                   String ne=JOptionPane.showInputDialog("Enter The New GPA");
                   double nee=Double.parseDouble(ne);
                   cgpa[io]=nee;
                   JOptionPane.showMessageDialog(null,"The GPA Has Been Updated");
               }
           }
           if(a==5){
               String ms=JOptionPane.showInputDialog("Enter The Student ID");
               long up=Long.parseLong(ms);
               int io=-1;
               for (int ii=0;ii<i;ii++)
                   if(up==id[ii])
                       io=ii;
               if(io==-1)
                   JOptionPane.showMessageDialog(null,"There is No Student With This ID"
                           + " "+up);
               else{
                   i--;
                   if(io==i){
                   }
                   else{
                        for(;io<i;io++){
                            name[io]=name[io+1];
                            id[io]=id[io+1];
                            cgpa[io]=cgpa[io+1];
                            nat[io]=nat[io+1];
                            age[io]=age[io+1];
               }}}
               
           }
           if(a==6){
               String ss=JOptionPane.showInputDialog("Enter"
                       + "\n1- Sort By Name\nor\n2-Sort By GPA");
               int so=Integer.parseInt(ss);
               String name1[]=new String[i];
               long id1[]=new long[i];
               double cgpa1[]=new double[i];
               String nat1[]=new String[i];
               int age1[]=new int[i];
               if(so==1||so==2){
               if(so==1){
                   int r=0;
                   for(int tt=0;tt<i;tt++){
                       r=0;
                       for(int ttt=0;ttt<i;ttt++)
                       {
                           if(name[tt].compareToIgnoreCase(name[ttt])>0){
                               r++;
                           }
                       }
                       name1[r]=name[tt];
                       id1[r]=id[tt];
                       cgpa1[r]=cgpa[tt];
                       nat1[r]=nat[tt];
                       age1[r]=age[tt];
                   }
               }
               if(so==2){ 
                   int r=0;
                   for(int tt=0;tt<i;tt++){
                       r=0;
                       for(int ttt=0;ttt<i;ttt++)
                       {
                           if(cgpa[tt]<cgpa[ttt]){
                               r++;
                           }
                       }
                       name1[r]=name[tt];
                       id1[r]=id[tt];
                       cgpa1[r]=cgpa[tt];
                       nat1[r]=nat[tt];
                       age1[r]=age[tt];
                   }
               }
               for(int o=0;o<i;o++){
                   name[o]=name1[o];
                   id[o]=id1[o];
                   cgpa[o]=cgpa1[o];
                   nat[o]=nat1[o];
                   age[o]=age1[o];}
               JOptionPane.showMessageDialog(null,"Sorting Has Been Done");
               }
               else
                   JOptionPane.showMessageDialog(null, "Wrong Input");
               
               
           }
           if(a==7){
               File FF = new File("Student.txt");
               System.out.print(FF.getAbsolutePath());
               PrintWriter pp=new PrintWriter(FF);
               for(int e=0;e<i;e++)
                   pp.println(name[e]+"\t"+id[e]+"\t"+cgpa[e]+
                           "\t"+nat[e]+"\t"+age[e]);
               pp.close();
           }
           if(a==8){
               JOptionPane.showMessageDialog(null, "Thank You");
               break;
           }
        }
        
        
        // TODO code application logic here0
   }
}
