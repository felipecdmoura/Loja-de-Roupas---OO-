package codigofonte;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    private static ArrayList <Cliente> clientes = new ArrayList<Cliente>();
    private static boolean loop = true;;
    public static void main(String[] args) {
        
        DadosAleatorios.setDefaultData(clientes);

        while (true) {
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
                    seccaoCliente();
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

    private static void pulaLinha(int nlinha) {
        for (int i = 0; i < nlinha; i++) {
            System.out.println();
        }
    }

    private static void seccaoCliente() {
        char tecla;
        int verpesq;

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
                    Cliente novocCliente = new Cliente();
                    novocCliente.cadatrarCliente();
                    clientes.add(novocCliente);
                    break;

                case 2:
                    int indexedit = 0;
                    int infoEdit;

                    clear();
                    System.out.println("Digite o nome do cliente a ser editado: ");
                    String posedit = Read.getString();
                    pulaLinha(1);

                    for (Cliente clienteEdit : clientes) {
                        if(clienteEdit.getNome().equalsIgnoreCase(posedit)){
                            break;
                        }
                        indexedit++;
                    }
                    
                    if(indexedit >= clientes.size()){
                        System.out.println("Cliente não encontrado!");
                        pulaLinha(1);
                        System.out.println("Digite qualquer tecla para voltar!");
                        tecla = Read.getChar();
                    }else{
                        System.out.println(clientes.get(indexedit));
                        pulaLinha(1);
                        System.out.println("Qual informação deseja alterar?: " + "\n"
                                        +  "1)Nome" + "\n"
                                        +  "2)Email" + "\n"
                                        +  "3)CPF" + "\n"
                                        +  "4)Data de Nascimento" + "\n"
                                        +  "5)Telefone");
                        infoEdit = Read.getInt();
                        pulaLinha(1);

                        
                        clientes.get(indexedit).editCliente(infoEdit);
                    }
                   break;

                case 3:
                    verpesq = 0;

                    clear();
                    System.out.println("Digite o nome do cliente: ");
                    String pesq = Read.getString();
                    pulaLinha(1);

                    for (Cliente clientePsq : clientes) {
                        if(clientePsq.getNome().equalsIgnoreCase(pesq)){
                            System.out.println(clientePsq);
                            verpesq = 1;
                        }
                    }

                    if(verpesq == 0){
                        System.out.println("Não encontrado!");
                    }

                    pulaLinha(1);
                    System.out.println("Digite qualquer tecla para voltar!");
                    tecla = Read.getChar();
                    break;

                case 4:
                    int indexdel = 0;

                    clear();
                    System.out.println("Digite o nome do cliente a ser editado: ");
                    String posedel = Read.getString();
                    pulaLinha(1);

                    for (Cliente clienteEdit : clientes) {
                        if(clienteEdit.getNome().equalsIgnoreCase(posedel)){
                            break;
                        }
                        indexdel++;
                    }

                    if(indexdel >= clientes.size()){
                        System.out.println("Cliente não encontrado!");
                        pulaLinha(1);
                        System.out.println("Digite qualquer tecla para voltar!");
                        tecla = Read.getChar();
                    }else{
                        clientes.remove(indexdel);
                    }
                    break;

                case 5:
                    for(int cout=0; cout<clientes.size(); cout++){
                        System.out.println(clientes.get(cout));
                        pulaLinha(1);
                    }

                    System.out.println("Digite qualquer tecla para voltar!");
                    tecla = Read.getChar();
                    break;
                case 6:
                    loop = false;
                    break;
            }
        }
        clear();
        loop = true;
    }
}