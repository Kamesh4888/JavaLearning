package program45;

public class Factorial {
	 static int factorial(int a){      
         if (a == 1)      
           return 1;      
         else      
           return(a * factorial(a-1));      
   }  
	 // Febnocci series
	 static int n1=0,n2=1,n3=0;      
     static void printFibo(int count){      
        if(count>0){      
             n3 = n1 + n2;      
             n1 = n2;      
             n2 = n3;      
             System.out.print(" "+n3);     
             printFibo(count-1);      
         }      
     }        
 
public static void main(String[] args) {  
System.out.println("Factorial of 5 is: "+factorial(5));  
int count=15;      
System.out.print(n1+" "+n2);    
printFibo(count-2);    
}  
}  

