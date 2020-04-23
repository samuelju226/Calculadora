package br.edu.univas.main;

import java.util.Scanner;

public class StartApp {
	public static void main (String args[]){ 
	    
	       int x = 0;
	       int y = 0; 
	       int z = 0; 
	       int operacao = 0; 
	    
	        Scanner menu = new Scanner(System.in);
		 
	         
	      do {  
	      
	        System.out.println("Escolha uma opção");  
	        System.out.println("1. Soma");    
	        System.out.println("2. Subtracao");    
	        System.out.println("3. Multiplicacao");    
	        System.out.println("4. Divisao");    
	        System.out.println("9. Sair");    
	        operacao = menu.nextInt();    
	        
	       
	     switch (operacao) { 
		   
		    
		     
		 case 1:{
	 			 
	 		 System.out.println("Qual o primeiro numero: ");  
	 		 x = menu.nextInt();
	 		 System.out.println("Qual o segundo numero: ");  
	 		 y= menu.nextInt();
	 		 z = x + y;
	 		 System.out.println(" A [operacao] "+ operacao + " de " + x + " por "+ y +" é igual a: " + z);	
	 		 break;
		     } 
		    
		 case 2:{
	 		
	 		System.out.println("Qual o primeiro numero: ");  
	 		x = menu.nextInt();
	 	    System.out.println("Qual o segundo numero: ");  
	 		y= menu.nextInt();
	 	    z = x - y;
	 	    System.out.println(" A [operacao] "+ operacao + " de " + x + " por "+ y +" é igual a: " + z);
	 		break;
		    }
		 
		 case 3:{
	 	       
	 	    System.out.println("Qual o primeiro numero: ");  
	 	    x = menu.nextInt();
	 		System.out.println("Qual o segundo numero: ");  
	 	    y= menu.nextInt();
	 	    z = x * y;
	 	    System.out.println(" A [operacao] "+ operacao + " de " + x + " por "+ y +" é igual a: " + z);
	 	    break;
		    }

        case 4:{
	 		System.out.println("Qual o primeiro numero: ");  
	 	    x = menu.nextInt();
	 	    System.out.println("Qual o segundo numero: ");  
	 	    y= menu.nextInt();
	 		z = x / y;
	 	    System.out.println(" A [operacao] "+ operacao + " de " + x + " por "+ y +" é igual a: " + z);
	 		break;
		    }
		   
		    case 9: {
		    	System.out.println("Fim de Programa");
		        break;
		    }
		    
		    default:{
	 		
		      System.out.println("Opeção invalida! Por favor digite opeção correta!");
	 		   break;
		    
	 	    }  
		    
		   
		  }
		    
	     }while(operacao != 9);
	     
		    
		    menu.close();

	}		 
}


