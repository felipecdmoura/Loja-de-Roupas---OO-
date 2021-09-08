package codigofonte;
public class Main {
    public static void main(String[] args) {
        Cliente cliente[] = new Cliente[1000];
        
        boolean loop = true;
        int clientcout = 0;

        for(int count=0;count<1000;count++) //Inicialização do array.
            cliente[count] = new Cliente();

        while (loop) {
            System.out.println("Selecione uma das abas abaixo\n" 
            + "1.Cliente\n"
            + "2.Loja\n" 
            + "3.Funcionario\n"
            + "4.Venda\n" 
            + "5.Camisa\n" 
            + "6.Calça\n" 
            + "7.Sair");

            int escolha = Read.getInt();

            switch (escolha) {
                case 1:
                    while (loop) {
                        clear();
                        System.out.println(
                            "Selecione uma das opções abaixo\n" 
                            + "1.Cadastrar Cliente\n"
                            + "2.Editar Informaçoes do Cliente\n"
                            + "3.Pesquisar Cliente\n"
                            + "4.Deletar Cliente\n" 
                            + "5.Visualizar Clientes\n"
                            + "6.Sair");

                        int escolhacliente = Read.getInt();

                        switch (escolhacliente) {
                            case 1:
                                cliente[clientcout].cadatrarCliente();
                                clientcout++;
                                break;
                            case 2:// metodo de editar cliente
                            case 3:// metodo de pesquisar cliente
                            case 4:// metodo de deletar cliente
                            case 5:
                                for(int cout=0; cout<clientcout; cout++){
                                    System.out.println(cliente[cout]);
                                    System.out.println();
                                }
                                System.out.println("Digite qualquer tecla para voltar!");
                                char tecla = Read.getChar();
                            case 6:
                                loop = false;
                                break;
                        }
                    }
                    clear();
                    loop = true;
                    break;
                case 2:
                    clear();
                    while (true) {
                        System.out.println(
                            "Selecione uma das opções abaixo\n" 
                            + "1.Cadastrar Loja\n"
                            + "2.Editar Loja\n" 
                            + "3.Pesquisar Loja\n"
                            + "4.Deletar Loja\n" 
                            + "5.Visualizar Lojas\n" 
                            + "6.Sair");

                        int escolhaloja = Read.getInt();

                        switch (escolhaloja) {
                            case 1:// metodo de cadastrar loja
                            case 2:// metodo de editar loja
                            case 3:// metodo de pesquisar loja
                            case 4:// metodo de deletar loja
                            case 5:// metodo de visualizar loja
                            case 6:
                                break;
                        }
                        break;
                    }
                    clear();
                    break;
                case 3:
                    clear();
                    while (true) {
                        System.out.println(
                            "Selecione uma das opções abaixo\n" 
                            + "1.Cadastrar Funcionario\n"
                            + "2.Editar Funcionario\n"
                            + "3.Pesquisar Funcionario\n"
                            + "4.Deletar Funcionario\n" 
                            + "5.Visualizar Funcionarios\n"
                            + "6.Sair");

                        int escolhafunc = Read.getInt();

                        switch (escolhafunc) {
                            case 1:// metodo de cadastrar funcionario
                            case 2:// metodo de editar editar informações do funcionario
                            case 3:// metodo de pesquisar pelo nome as informaçoes do funcionario
                            case 4:// metodo de deletar informaçoes do funcionario
                            case 5:// metodo de visualizar informaçoes do funcionario
                            case 6:
                                break;
                        }
                        break;
                    }
                    clear();
                    break;
                case 4:
                    clear();
                    while (true) {
                        System.out.println(
                            "Selecione uma das opções abaixo\n" 
                            + "1.Cadastrar Venda\n"
                            + "2.Editar Venda\n" 
                            + "3.Pesquisar Venda\n"
                            + "4.Visualizar Vendas\n" 
                            + "5.Sair");

                        int escolhavenda = Read.getInt();

                        switch (escolhavenda) {
                            case 1:// metodo de cadastrar venda
                            case 2:// metodo de editar informações da venda
                            case 3:// metodo de pesquisar pelo id da venda suas informações
                            case 4:// metodo de deletar informaçoes da venda
                            case 5:// metodo de visualizar informaçoes da venda
                            case 6:
                                break;
                        }
                        break;
                    }
                    clear();
                    break;
                case 5:
                    clear();
                    while (true) {
                        System.out.println(
                            "Selecione uma das opções abaixo\n" 
                            + "1.Cadastrar Camisa\n"
                            + "2.Editar Camisa\n"
                            + "3.Pesquisar Camisa\n"
                            + "4.Deletar Camisa\n" 
                            + "5.Visualizar Camisas\n"
                            + "6.Sair");

                        int escolhacamisa = Read.getInt();
                        switch (escolhacamisa) {
                            case 1:// metodo de cadastrar camisa
                            case 2:// metodo de editar informações da camisa
                            case 3:// metodo de pesquisar pelo nome as informações da canmisa
                            case 4:// metodo de deletar informaçoes da camisa
                            case 5:// metodo de visualizar informaçoes da camisa
                            case 6:
                                break;
                        }
                        break;
                    }
                    clear();
                    break;
                case 6:
                    clear();
                    while (true) {
                        System.out.println(
                            "Selecione uma das opções abaixo\n" 
                            + "1.Cadastrar Calça\n"
                            + "2.Editar Calça\n" 
                            + "3.Pesquisar Calça\n"
                            + "4.Deletar Calça\n" 
                            + "5.Visualizar Calças\n"
                            + "6.Sair");

                        int escolhacalça = Read.getInt();

                        switch (escolhacalça) {
                            case 1:// metodo de cadastrar camisa
                            case 2:// metodo de editar informações da camisa
                            case 3:// metodo de pesquisar pelo nome as informações da canmisa
                            case 4:// metodo de deletar informaçoes da camisa
                            case 5:// metodo de visualizar informaçoes da camisa
                            case 6:
                                break;
                        }
                        break;
                    }
                    clear();
                    break;
                case 7:
                    System.exit(0);
                default:
                    break;
            }
        }
    }
    

    private static void clear() { //Método para limpar a tela.
		for(int count=1; count<=25; count++) {
			System.out.println();
		}
	}
}