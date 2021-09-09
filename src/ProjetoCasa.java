import java.util.Scanner;

public class ProjetoCasa {

	public static void main(String[] args) {
Scanner leitor = new Scanner(System.in);
		
	    String cômodo;
	    int largura;
	    int comprimento;
	    String resposta = "S";
	    
	    
	    System.out.println("*************************");
	    System.out.println("Cálculo de área de uma casa");
	    System.out.println("*************************");
	    System.out.println();
	    
	    System.out.println("Qual é o nome do cômodo:");
		cômodo = leitor.next();
		
		System.out.println("Qual é a largura da casa:");
		largura = leitor.nextInt();
		
		System.out.println("Qual é o comprimento da casa?");
		comprimento = leitor.nextInt();
		
		int area = largura * comprimento;
	    System.out.println("A área total tem " + area + " metros quadrados.");
	    System.out.println();
	    
	    System.out.println("Você deseja calcular mais cômodos(S/N)?");
	    resposta = leitor.next();
	    
	      if (resposta.equals("S") || resposta.equals("s")) {
	      while(resposta.equals("S") || resposta.equals("s")) {
	      
	      
	      System.out.println("Qual é o nome do cômodo:");
		  cômodo = leitor.next();
			
		  System.out.println("Qual é a largura da casa:");
		  largura = leitor.nextInt();
			
		  System.out.println("Qual é o comprimento da casa?");
		  comprimento = leitor.nextInt();
		  area = largura * comprimento;
		  
		  System.out.println("A área total tem " + area + " metros quadrados.");
		  System.out.println();
		  
		  
		  
		  System.out.println("Você deseja calcular mais cômodos(S/N)?");
		  resposta = leitor.next();
	      } 
	    	  
	      }else if(resposta.equals("N") || resposta.equals("n")) {
	    	  
	      }else {
	    	  System.out.println("Não existe!");
	      } 
	      }
		  

	}


