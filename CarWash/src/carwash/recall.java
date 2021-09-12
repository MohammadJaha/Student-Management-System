/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carwash;

import java.io.File;
import java.util.*;
/**
 *
 * @author Mohammad.Jaha
 */
public class recall {
    private String s[];
    private int x;
    private int w;
    
    public recall()throws Exception{
        
        x=0;
        String s1,s2,s3,s4,s5,s6;
        File F=new File("CarWash.txt");
        Scanner n=new Scanner (F);
        Scanner nn=new Scanner (F);
        for(;n.hasNext();){
            x++;
            n.next(); }
        w=x/6;
        s=new String[w];
        for(int i=0;nn.hasNext();i++){
            s1=nn.next();
            s2=nn.next();
            s3=nn.next();
            s4=nn.next();
            s5=nn.next();
            s6=nn.next();
            if(i<w)
                s[i]=(s1+"   "+s2+"   "+s3+"   "+s4+"   "+s5+" "+s6);
            ;
        }
        n.close();
        nn.close();
    }
    
    public String write(int a){
        if (a<w)
            return s[a];
        else
            return "Error";
    } 
    public int size(){
        return w;
    }
    
}
