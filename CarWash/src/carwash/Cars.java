/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carwash;

/**
 *
 * @author Mohammad.Jaha
 */
public class Cars extends Queue {
    
    private String name;
    private String car;
    private String typeWoshing;
    private String price;
    
    
    public Cars(int b)throws Exception{
        super (b);
        
    }
    
    public void enter(String a,String b,int c){
        name=a;
        car=b;
        if(c==1){
            price="  20 SR  ";
            typeWoshing="  Normal Wash";}
        else if(c==2){
            price="  40 SR  ";
            typeWoshing="  Dry Wash";}
        else if(c==3){
            typeWoshing="  Wax Wash";
            price="  70 SR  ";}
        else if(c==4){
            typeWoshing="  Shiny Wash";
            price="  100 SR  ";}
        else{
            typeWoshing="  UnDefined  ";
            price="  0 SR  ";}
        
        
        
    }
    
    public void display(){
        String er=price;
        String g=name+"   "+car+" "+typeWoshing;
        super.insert(g,er);
        
    }
}
