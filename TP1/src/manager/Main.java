package manager;

public class Main {
	private static Client person[] = new Client[10000];
    private static Product product[] = new Product[10000];
	private static int posClient = 0;
    private static int posProd = 0;
	
	public static void main(String[] args) {
		int opt;
		
        for(int count=0;count<10000;count++)
            person[count] = new Client();

        for(int count=0;count<10000;count++)
            product[count] = new Product();

		do {
            clear();
			menu();
			opt = Read.getInt();
            
			switch (opt) {
			case 1:
				clear();
				registerClient();
				break;
            case 2:
                clear();
                searchClient();
                break;
            case 3:
                clear();
                registerProd();
                break;
            case 4:
                clear();
                searchProd();
                break;
            case 5:
                clear();
                registerSell();
                break;
            case 6:
                clear();
                showStock();
                break;
            case 7:
                break;
			default:
				System.out.println("Opção inválida!");
			}
		} while (opt != 7);

        clear();
        System.out.println("Até a próxima!");
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
	
	private static void registerClient() {
		int qtt;
		
		System.out.println("Quantos clientes deseja cadastrar?: ");
		qtt = Read.getInt();

		for (int count=posClient; count<(posClient + qtt); count++) {
            clear();
			System.out.println("Digite o nome do cliente " + (count + 1) + ":");
			person[count].name = Read.getString();
			
			System.out.println("Digite o endereço do cliente " + (count + 1) + ":");
			person[count].address = Read.getString();
			
			System.out.println("Digite o telefone do cliente " + (count + 1) + ":");
			person[count].tel = Read.getString();
		}
        posClient += qtt;
	}

    private static void searchClient() {
        int verifier = 0;
        int loc = 0;
        int num = 0;
        char opt = '0';

        System.out.println("Insira o nome do cliente a ser pesquisado: ");
        String inputName = Read.getString();

        for(int count=0; count<posClient; count++){
            if(person[count].name.equals(inputName)){
                verifier = 1;
                loc = count;
                break;
            }else{
                verifier = 0;
            }
        }

        if(verifier == 1){
            do{
                clear();
                System.out.println("Dados do Cliente: " );
                System.out.println("(1)Nome: " + person[loc].name);
                System.out.println("(2)Endereço: " + person[loc].address);
                System.out.println("(3)Telefone: " + person[loc].tel);
                System.out.println();
                System.out.println("Deseja alterar algum dado cadastrado?(S/N)");
                opt = Read.getChar();
                
            
                if(opt == 'S' || opt == 's'){
                    do{
                        System.out.println("Digite o número correspondente ao dado alterado: ");
                        num = Read.getInt();
                        if(num<1 || num>3)
                            System.out.println("Opção Inválida!");
                            System.out.println();
                    }while(num<1 || num>3);
   
                    System.out.println("Nova informação: ");
                    String newData = Read.getString();
                        
                    switch(num){
                    case 1:
                        person[loc].name = newData;
                        break;
                    case 2:
                        person[loc].address = newData;
                        break;
                    case 3:
                        person[loc].tel = newData;
                        break;
                    default:
                        break;
                    }
                }else if (opt == 'N' || opt == 'n') {
                    clear();
                    break;
                }
            }while(opt != 'S' || opt != 's' || opt != 'N' || opt != 'n');
        }else{
            System.out.println();
            System.out.println("Cliente não encontrado!");;
        } 
    }

    private static void registerProd() {
		int qtt;
		
		System.out.println("Quantos produtos deseja cadastrar?: ");
		qtt = Read.getInt();

		for (int count=posProd; count<(posProd + qtt); count++) {
            clear();
			System.out.println("Digite o nome do produto " + (count + 1) + ":");
			product[count].name = Read.getString();
			
			System.out.println("Digitea a descrição do produto " + (count + 1) + ":");
			product[count].descrip = Read.getString();

            System.out.println("Digite o valor de compra do produto " + (count + 1) + ":");
			product[count].price = Read.getFloat();

            System.out.println("Digite a porcentagem de lucro do produto " + (count + 1) + ":");
			product[count].profit = Read.getFloat();

            System.out.println("Digite a quantidade em estoque do produto " + (count + 1) + ":");
			product[count].stock = Read.getInt();
		}
        posProd += qtt;
	}

    private static void searchProd() {
        int verifier = 0;
        int loc = 0;
        int num = 0;
        char opt = '0';

        System.out.println("Insira o nome do produto a ser pesquisado: ");
        String inputName = Read.getString();

        for(int count=0; count<posProd; count++){
            if(product[count].name.equals(inputName)){
                verifier = 1;
                loc = count;
                break;
            }else{
                verifier = 0;
            }
        }

        if(verifier == 1){
            do{
                clear();
                System.out.println("Dados do Produto: " );
                System.out.println("(1)Nome: " + product[loc].name);
                System.out.println("(2)Descrição: " + product[loc].descrip);
                System.out.println("(3)Valor de Compra: R$" + product[loc].price);
                System.out.println("(4)Porcentagem de Lucro: " + "%" + product[loc].profit);
                System.out.println("(5)Qtd. em Estoque: " + product[loc].stock);
                System.out.println();
                System.out.println("Deseja alterar algum dado cadastrado?(S/N): ");
                opt = Read.getChar();
                
            
                if(opt == 'S' || opt == 's'){
                    do{
                        System.out.println("Digite o número correspondente ao dado alterado: ");
                        num = Read.getInt();
                        if(num<1 || num>5)
                            System.out.println("Opção Inválida!");
                            System.out.println();
                    }while(num<1 || num>5);
                        
                    switch(num){
                    case 1:
                        System.out.println("Nova informação: ");
                        String newName = Read.getString();
                        product[loc].name = newName;
                        break;
                    case 2:
                        System.out.println("Nova informação: ");
                        String newDescript = Read.getString();
                        product[loc].descrip = newDescript;
                        break;
                    case 3:
                        System.out.println("Nova informação: ");
                        float newPrice = Read.getFloat();
                        product[loc].price = newPrice;
                        break;
                    case 4:
                        System.out.println("Nova informação: ");
                        float newProfit = Read.getFloat();
                        product[loc].profit = newProfit;
                        break;
                    case 5:
                        System.out.println("Nova informação: ");
                        int newStock = Read.getInt();
                        product[loc].stock = newStock;
                        break;
                    default:
                        break;
                    }
                }else if (opt == 'N' || opt == 'n') {
                    clear();
                    break;
                }
            }while(opt != 'S' || opt != 's' || opt != 'N' || opt != 'n');
        }else{
            System.out.println();
            System.out.println("Produto não encontrado!");;
        } 
    }

    public static void registerSell() {
        int clientChoice;
        int prodChoice;
        int sellQtd;
        char opt = '0';

        System.out.println("Selecione um dos usuários cadastrados: ");
        for(int count=0; count<posClient; count++ ) {
			System.out.println((count+1) + ") " + person[count].name);
		}
        clientChoice = Read.getInt();

        do{
            if(clientChoice < 1 || clientChoice > posClient ){
                System.out.println("Opção Inválida! Digite novamente: ");
                clientChoice = Read.getInt();
            }
        }while(clientChoice < 1 || clientChoice > posClient );

        do{
            clear();
            System.out.println("Selecione o produto vendido: ");

            for(int count=0; count<posProd; count++ ) {
                System.out.println((count+1) + ") " + product[count].name);
            }

            prodChoice = Read.getInt();

            do{
                if(prodChoice < 1 || prodChoice > posProd){
                    System.out.println("Opção Inválida! Digite novamente: ");
                    prodChoice = Read.getInt();
                }
            }while(prodChoice < 1 || prodChoice > posProd);

            System.out.println("Quantidade Vendida: ");
            sellQtd = Read.getInt();
            
            do{
                if(sellQtd > product[(prodChoice - 1)].stock){
                    System.out.println("A quantidade vendida excede o estoque disponível (" + product[(prodChoice - 1)].stock + " produtos)! Digite novamente: ");
                    sellQtd = Read.getInt();
                }else{
                    product[(prodChoice - 1)].stock -= sellQtd;
                }
            }while(sellQtd > product[(prodChoice - 1)].stock);

            System.out.println("Deseja cadastrar mais vendas?(S/N): ");
            opt = Read.getChar();

            if(opt == 'N' || opt == 'n'){
                break;
            }else if(opt != 'S' && opt != 's' && opt != 'N' && opt != 'n'){
                do{
                    System.out.println("Opção Inválida! Digite novamente: ");
                    opt = Read.getChar();
                }while(opt != 'S' && opt != 's' && opt != 'N' && opt != 'n');
            }
        }while(opt == 'S' || opt == 's');
    }

    public static void showStock() {
        char opt;
        do{
            clear();
            if (posProd == 0){
                System.out.println("Nenhum produto cadastrado! ");
                System.out.println();
            }else{
                for(int count=0; count<posProd; count++ ) {
                    System.out.println((count+1) + ") " + product[count].name + " - " + product[count].stock + " em estoque. " );
                }
            }

            System.out.println("Deseja voltar?(S/N): ");
            opt = Read.getChar();

            System.out.println(opt);
            if(opt == 'S' || opt == 's'){
                break;
            }else if(opt != 'S' && opt != 's' && opt != 'N' && opt != 'n'){
                do{
                    System.out.println("Opção Inválida! Digite novamente: ");
                    opt = Read.getChar();
                }while(opt != 'S' && opt != 's' && opt != 'N' && opt != 'n');
            }
        }while((opt == 'N') || (opt == 'n'));
    } 
}