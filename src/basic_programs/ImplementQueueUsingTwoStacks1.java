package basic_programs;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ImplementQueueUsingTwoStacks1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Stack<Integer> ip = new Stack<>();
        Stack<Integer> op = new Stack<>();
        
        Scanner input = new Scanner(System.in);
        
        int q = input.nextInt();
        
        while(q-->0){
            
            int query = input.nextInt();
            
            switch(query){
                
                case 1:{
                    
                    int x = input.nextInt();
                    ip.push(x);
                    break;
                }
                
                case 2:{
                    
                    if(!op.empty()){
                        
                        op.pop();
                    }
                    else{
                        
                        while(!ip.empty()){
                            
                            op.push(ip.pop());
                        }
                               
                        op.pop();
                    }
                    
                    break;
                }
                
                case 3:{
                    
                    if(!op.empty()){
                        
                        System.out.println(op.peek());
                    }
                    else{
                        
                        while(!ip.empty()){
                            
                            op.push(ip.pop());
                        }
                        
                        System.out.println(op.peek());
                    }
                    
                    break;
                }
            }
        }
    }
}