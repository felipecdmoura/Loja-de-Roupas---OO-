package manager;

public class Main {
	private static Client person[] = new Client[10000]; //Criação da classe cliente como array.
    private static Product product[] = new Product[10000]; //Criação da cçasse produto como array.
	private static int posClient = 10; //Variavel que guarda a proxima posição do proximo cliente a ser cadastrado .
    private static int posProd = 10; ///Variavel que guarda a proxima posição do proximo produto a ser cadastrado .
	
	public static void main(String[] args) {
		int opt;
		
        for(int count=0;count<10000;count++) //Inicialização do array.
            person[count] = new Client();

        for(int count=0;count<10000;count++) //Inicialização do array.
            product[count] = new Product();

        DefaultData.setDefaultData(person, product); //Puxa o método que define os prod e clientes padrão.
            
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

//-----------------------MÉTODOS-----------------------------

	private static void menu() { //Método para printar o menu.
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
	

	private static void clear() { //Método para limpar a tela.
		for(int count=1; count<=25; count++) {
			System.out.println();
		}
	}
	

	private static void registerClient() { //Método para registrar os clientes.
		int qtt; //Armazena quantos clientes a serem cadastrados.
		
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
        posClient += qtt; //Atualiza a proxima posição a ser cadastrada.
	}

    private static void searchClient() { //Método para pesquisar os clientes.
        int verifier = 0; //Verificador para identificar se o cliente foi encontrado ou não.
        int loc = 0; //Localização do cliente no array.
        int num = 0;
        char opt = '0';

        System.out.println("Insira o nome do cliente a ser pesquisado: ");
        String inputName = Read.getString();

        for(int count=0; count<posClient; count++){ //Pesquisa o cliente.
            if(person[count].name.equalsIgnoreCase(inputName)){
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
                    String newData = Read.getString(); //Altera a informação escolhida.
                        
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
            }while(opt != 'S' || opt != 's' || opt != 'N' || opt != 'n'); //Verifica se a opção foi valida.
        }else{
            System.out.println();
            System.out.println("Cliente não encontrado!");;
        } 
    }

    private static void registerProd() { //Método para registrar produtos
		int qtt; //Armazena quantos clientes a serem cadastrados
		
		System.out.println("Quantos produtos deseja cadastrar?: ");
		qtt = Read.getInt();

		for (int count=posProd; count<(posProd + qtt); count++) {
            clear();
			System.out.println("Digite o nome do produto " + (count + 1) + ":");
			product[count].name = Read.getString();
			
			System.out.println("Digitea a descrição do produto " + (count + 1) + ":");
			product[count].descrip = Read.getString();

            System.out.println("Digite o valor de compra do produto " + (count + 1) + ":");
			product[count].price = Read.getDouble();

            System.out.println("Digite a porcentagem de lucro do produto " + (count + 1) + ":");
			product[count].profit = Read.getFloat();

            System.out.println("Digite a quantidade em estoque do produto " + (count + 1) + ":");
			product[count].stock = Read.getInt();
		}
        posProd += qtt; //Atualiza a proxima posição a ser cadastrada
	}

    private static void searchProd() { //Método para pesquisar os produtos
        int verifier = 0; //Verificador para identificar se o cliente foi encontrado ou não
        int loc = 0; //Localização do cliente no array
        int num = 0;
        char opt = '0';

        System.out.println("Insira o nome do produto a ser pesquisado: ");
        String inputName = Read.getString();

        for(int count=0; count<posProd; count++){ //Pesquisa o produto.
            if(product[count].name.equalsIgnoreCase(inputName)){
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
                        
                    switch(num){ //Altera a informação baseada em qual foi selecionada.
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
                        double newPrice = Read.getDouble();
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
            }while(opt != 'S' || opt != 's' || opt != 'N' || opt != 'n'); //Verifica se a opção foi válida.
        }else{
            System.out.println();
            System.out.println("Produto não encontrado!");;
        } 
    }

    public static void registerSell() { //Registra as vendas para clientes.
        int clientChoice; //Armazena o cliente escolhido.
        int prodChoice; //Armazena o produto escolhido.
        int sellQtd; //Armazena quanto foi vendido.
        char opt = '0';

        System.out.println("Selecione um dos usuários cadastrados: ");
        for(int count=0; count<posClient; count++ ) { //Mostra os clientes cadastrados.
			System.out.println((count+1) + ") " + person[count].name);
		}
        clientChoice = Read.getInt();

        do{
            if(clientChoice < 1 || clientChoice > posClient ){ //Verifica se o numero corresponde a um dos clientes da lista.
                System.out.println("Opção Inválida! Digite novamente: ");
                clientChoice = Read.getInt();
            }
        }while(clientChoice < 1 || clientChoice > posClient );

        do{
            clear();
            System.out.println("Selecione o produto vendido: "); 

            for(int count=0; count<posProd; count++ ) { //Mostra os produtos cadastrados.
                System.out.println((count+1) + ") " + product[count].name);
            }

            prodChoice = Read.getInt();

            do{ //Verifica a opação.
                if(prodChoice < 1 || prodChoice > posProd){
                    System.out.println("Opção Inválida! Digite novamente: ");
                    prodChoice = Read.getInt();
                }
            }while(prodChoice < 1 || prodChoice > posProd);

            System.out.println("Quantidade Vendida: ");
            sellQtd = Read.getInt();
            
            do{ //Verifica se a quantidade vendida não excede a quantidade no estoque.
                if(sellQtd > product[(prodChoice - 1)].stock){
                    System.out.println("A quantidade vendida excede o estoque disponível (" + product[(prodChoice - 1)].stock + " produtos)! Digite novamente: ");
                    sellQtd = Read.getInt();
                }
            }while(sellQtd > product[(prodChoice - 1)].stock);

            product[(prodChoice - 1)].stock = product[(prodChoice - 1)].stock - sellQtd; //Subtrai o estoque pelo quanto foi vendido.

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

    public static void showStock() { //Método que mostra o estoque.
        char opt;
        do{
            clear();
            if (posProd == 0){ //Verifica se algum produto já foi cadastrado.
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
            }else if(opt != 'S' && opt != 's' && opt != 'N' && opt != 'n'){ //Verifica se a opção foi válida.
                do{
                    System.out.println("Opção Inválida! Digite novamente: ");
                    opt = Read.getChar();
                }while(opt != 'S' && opt != 's' && opt != 'N' && opt != 'n');
            }
        }while((opt == 'N') || (opt == 'n'));
    } 
}
