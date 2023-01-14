/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fcf2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
/**
 *
 * @author Hp
 */
public class FCF2 {

    /**
     * @param args the command line arguments
     */
   
    public void FCFSCompletionTime(){
     
    }
    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
           
        int pro=0;
          int burst=0;
           int k;
    
           
        int arrivalinput;
      //  int process[];
      int arrivalTime[];
      
           ArrayList  <Integer> arrival=new ArrayList <Integer> ();
  
         HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();    
         HashMap<Integer,Integer> hm2=new HashMap<Integer,Integer>();    
              ArrayList  <Integer> burtTime=new ArrayList <Integer> ();
   ArrayList  <Integer> completionTime=new ArrayList <Integer> ();
                      ArrayList  <Integer> Process=new ArrayList <Integer> ();
       
       System.out.println("Input number of process");
   int numberofinput=sc.nextInt();
           
               
       
       for(int i=0;i<numberofinput;i++){
           System.out.println("Input Process");
           pro=sc.nextInt();
            
           System.out.println("Input burst  time");
             burst=sc.nextInt();
     System.out.println("Input arrival time time");
           arrivalinput=sc.nextInt();
           arrival.add( arrivalinput);
            burtTime.add(burst);
           Process.add(pro);
       }
       
//       for( k=0;k<numberofinput;k++){
//           // putting the values to array
//            process[k]=pro;
//                 
//
//                  
//       }
            int p = 0;
            int compl=0;
             int j;
              System.out.println("Burst Time:");
       for( j=0;j<numberofinput;j++){
          
         
                   
             //asrival time
    Collections.sort(arrival);
      hm.put(arrival.get(j), (burtTime.get(j)));
//Collections.sort(burtTime);
  p+=burtTime.get(j);
       System.out.print("FCFS:"+"{"+p+"}");
            System.out.println("process"+Process.get(j));
     //       hm2.put(burt.get(j), k)
    // compl=compl+p;
              System.out.println("completion time:"+p);  
              int turn=p-arrival.get(j);
              System.out.println("turn around time:"+turn);  
              int waitingtime=turn-burtTime.get(j);
              System.out.println("waiting time:"+waitingtime);    
       }
       
         System.out.println(hm);    
         System.out.println(arrival);
         
    }
    
    
    
}
