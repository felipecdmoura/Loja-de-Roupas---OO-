import java.util.Date;
import java.util.Scanner;


public class Cliente extends Pessoa{
	//declaração de variaveis
	static String datanasc[] = new String[50];
	static int nextnome = 0;
	
	
	
	//Sobrecarga de Metodos ou construtor
	public Cliente(String[] n,int[] c,String[] e,Telefone tel,String[] dt) {
		this.nome = n;
		this.cpf = c;
		this.email = e;
		this.numtel.setNumero(99);
		this.datanasc = dt;
	}
	static Scanner s = new Scanner(System.in);
	
	//gets and sets
	public String[] getDatanasc() {
		return datanasc;
	}
	public void setDatanasc(String[] datanasc) {
		this.datanasc = datanasc;
	}
	
	//metodos do cliente
	static void registrocliente() { //Método para registrar os clientes.
		System.out.print("Qual a quantidade de clientes a ser cadastrada?\n");
    	int qc = s.nextInt();//qc guarda a quantidade de clientes
    	
    	for( int i = nextnome; i <(nextnome + qc); i++) {
    		
    		System.out.print("Nome do cliente\n");
    		
    		nome[i] = s.next();
    		s.nextLine();
    		
    		System.out.print("email do cliente\n");
    		
    		email[i] = s.next();
    		s.nextLine();
    		
    		System.out.print("CPF do cliente\n");
    		
    		cpf[i] = s.nextInt();
    		s.nextLine();
    		
    		System.out.print("Data de nascimento do cliente\n");
    		
    		datanasc[i] = s.next();
    		s.nextLine();
    		
    		

    		}
    	nextnome += qc;

	}
	
	static void editarcliente() {
		System.out.println("Digite o nome do cliente cadastrado");
		String clientecadastrado = s.next();
		

		for (int k =0;k<nextnome;k++) {
			
			
			
			if(clientecadastrado.equalsIgnoreCase(nome[k])) {
				System.out.println("Nome: "+nome[k]);
				System.out.println("Email: "+email[k]);
				System.out.println("CPF: "+cpf[k]);
				System.out.println("Data de nascimento: "+datanasc[k]);
				
				
				System.out.print("Gostaria de alterar os dados se sim digite 1 se não digite 2 ?");
				int ad = s.nextInt();
				
				
				if (ad == 1) {
					
					System.out.print("1.alterar todos os dados\n2.algum dado especifico ?\n");
					int ad2 = s.nextInt();
					
					if(ad2 == 1) {
					
					for( int i = 1; i <= 1; i++) {
			    		
						System.out.print("Nome do cliente\n");
			    		
			    		nome[i] = s.nextLine();
			    		s.nextLine();
			    		
			    		System.out.print("email do cliente\n");
			    		
			    		email[i] = s.nextLine();
			    		s.nextLine();
			    		
			    		System.out.print("CPF do cliente\n");
			    		cpf[i] = s.nextInt();
			    		s.nextLine();
			    		
			    		System.out.print("Data de nascimento do cliente\n");
			    		datanasc[i] = s.nextLine();
			    		s.nextLine();
			    		}}
					if(ad2 ==2) {
						System.out.print("Qual dos dados gostaria de alterar:\n1.nome\n2.Email\n3.Cpf\n4.Data de nascimento ");
						int ad3 = s.nextInt();
						
						switch (ad3) {
						case 1 :for( int i = 1; i <= 1; i++) {
							System.out.println("Digite o novo nome do cliente a ser cadastrado: ");
							nome[i] = s.next();
				    		s.nextLine();
				    		}break;
						case 2:
							for( int i = 1; i <= 1; i++) {
								System.out.println("Digite o novo Email do cliente a ser cadastrado: ");
								email[i] = s.next();
					    		s.nextLine();}
							break;
						case 3 :	
						for( int i = 1; i <= 1; i++) {
								System.out.println("Digite o novo Email do cliente a ser cadastrado: ");
								cpf[i] = s.nextInt();
								s.nextLine();}
							break;
						case 4 :
							for( int i = 1; i <= 1; i++) {
							System.out.print("Digite a nova data de nascimento do cliente\n");
				    		datanasc[i] = s.nextLine();
				    		s.next();}
							break;
									}
								}
											}					
				if(ad == 2) {break;}
				}
}
	}
	
	static void visualizarcliente() {
		System.out.println("Digite o nome do cliente a ser pesquisado");
		String clientecadastrado = s.next();
		

		for (int k =0;k<nextnome;k++) {
			
			
			
			if(clientecadastrado.equalsIgnoreCase(nome[k])) {
				System.out.println("Nome: "+nome[k]);
				System.out.println("Email: "+email[k]);
				System.out.println("CPF: "+cpf[k]);
				System.out.println("Data de nascimento: "+datanasc[k]);
				System.out.print("\n");}
		}
	}

	
}
