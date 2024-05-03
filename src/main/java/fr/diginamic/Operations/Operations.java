package fr.diginamic.Operations;

public class Operations {

	public double calc(double a, double b, char op) {
		switch(op){
		   
	       case '+': 
	           return a + b;
	   
	       case '-':
	    	   return a - b;
	   
	       case '*':
	    	   return a * b;
	       case '/':
	    	   return a / b;
	       default:
	    	   System.out.println("not an operand");
	    	   return 0;
	   }
	}
}
