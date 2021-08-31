import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		

			while(true) {System.out.println("Selecione uma das abas abaixo\n"
	    			+ "1.cadastrar cliente\n"
	    			+ "2.editar cliente\n"
	    			+ "3.visualizar cliente\n"
	    			+ "4.deletar cliente.\n"
	    			+ "5.pesquisar pelo nome do cliente\n"
	    			+ "6.Sair\n");
			int escolha = s.nextInt();

			switch(escolha) {
			case 1 :
				Cliente.registrocliente();

				break;
			case 2:	
				Cliente.editarcliente();
				
				
				
				break;
			case 3 :
				Cliente.visualizarcliente();
			}
}
}
		
}