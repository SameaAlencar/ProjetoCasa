import java.util.Scanner;

public class ProjetoCasa {

	public static void main(String[] args) {
Scanner leitor = new Scanner(System.in);
		
	    String c�modo;
	    int largura;
	    int comprimento;
	    String resposta = "S";
	    
	    
	    System.out.println("*************************");
	    System.out.println("C�lculo de �rea de uma casa");
	    System.out.println("*************************");
	    System.out.println();
	    
	    System.out.println("Qual � o nome do c�modo:");
		c�modo = leitor.next();
		
		System.out.println("Qual � a largura da casa:");
		largura = leitor.nextInt();
		
		System.out.println("Qual � o comprimento da casa?");
		comprimento = leitor.nextInt();
		
		int area = largura * comprimento;
	    System.out.println("A �rea total tem " + area + " metros quadrados.");
	    System.out.println();
	    
	    System.out.println("Voc� deseja calcular mais c�modos(S/N)?");
	    resposta = leitor.next();
	    
	      if (resposta.equals("S") || resposta.equals("s")) {
	      while(resposta.equals("S") || resposta.equals("s")) {
	      
	      
	      System.out.println("Qual � o nome do c�modo:");
		  c�modo = leitor.next();
			
		  System.out.println("Qual � a largura da casa:");
		  largura = leitor.nextInt();
			
		  System.out.println("Qual � o comprimento da casa?");
		  comprimento = leitor.nextInt();
		  area = largura * comprimento;
		  
		  System.out.println("A �rea total tem " + area + " metros quadrados.");
		  System.out.println();
		  
		  
		  
		  System.out.println("Voc� deseja calcular mais c�modos(S/N)?");
		  resposta = leitor.next();
	      } 
	    	  
	      }else if(resposta.equals("N") || resposta.equals("n")) {
	    	  
	      }else {
	    	  System.out.println("N�o existe!");
	      } 
	      }
		  

	}


