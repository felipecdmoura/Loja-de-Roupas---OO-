package manager;

public class Main {
	private static Client person[] = new Client[10000];
	private static int pos = 1;
	
	public static void main(String[] args) {
		int opt;
		
        for(int count=0;count<10000;count++)
            person[count] = new Client();

		do {
			menu();
			opt = Read.getInt();
		
			switch (opt) {
			case 1:
				clear();
				register();
				break;
			case 2: 
				clear();
				for(int count=0; count<pos; count++ ) {
					System.out.println(person[count].name);
					System.out.println(person[count].address);
					System.out.println(person[count].tel);
				}
				break;
			default:
				System.out.println("Opção inválida! Digite novamente: ");
				opt = Read.getInt();
			}
		} while (opt != 7);
	}

	private static void menu() {
		System.out.println("---Menu---\n\n");
		System.out.println("Escolha uma das opções a baixo: ");
		System.out.println("1) Cadastro de Cliente");
		System.out.println("2) Buscar Cliente");
		System.out.println("3) Cadastro de Produto");
		System.out.println("4) Busca de Produto");
		System.out.println("5) Cadastro de Venda");
		System.out.println("6) Mostrar Estoque");
		System.out.println("7)  Sair");
	}
	
	private static void clear() {
		for(int count=1; count<=25; count++) {
			System.out.println();
		}
	}
	
	private static void register() {
		int qtt;
		int count;
		
		System.out.println("Quantos clientes deseja cadastrar?: ");
		qtt = (Read.getInt() - 1);

		for (count=0; count<10000; count++) {
			if (person[count] == null) {
				pos = count;
				break;
			}
		}
		
		for(count=pos; count<=(pos + qtt); count++) {
			person[count] = new Client();
		}
		
		for (count=pos; count<=(pos + qtt); count++) {
			System.out.println("Digite o nome do cliente " + (count + 1) + ":");
			person[count].name = Read.getString();
			
			System.out.println("Digite o endereço do cliente " + (count + 1) + ":");
			person[count].address = Read.getString();
			
			System.out.println("Digite o telefone do cliente " + (count + 1) + ":");
			person[count].tel = Read.getString();
		}
	}
}
