package codigofonte;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    private static ArrayList <Cliente> clientes = new ArrayList<Cliente>();
    private static ArrayList <Loja> lojas = new ArrayList<Loja>();
    private static ArrayList <Funcionario> funcionarios = new ArrayList<Funcionario>();
    private static ArrayList <Venda> vendas = new ArrayList<Venda>();
    private static ArrayList <Camisa> camisas = new ArrayList<Camisa>();
    private static ArrayList <Calca> calcas = new ArrayList<Calca>();

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
                    seccaoloja();
                    break;
                case 3:
                    clear();
                    seccaofuncionario();
                    break;
                case 4:
                    clear();
                    seccaoVenda();
                    break;
                case 5:
                    clear();
                    seccaoCamisa();
                    break;
                case 6:
                clear();
                seccaoCalca();
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

    private static void seccaoloja() {
        char tecla;
        int verpesq;

        while (loop) {
            clear();
            System.out.println(
                "Selecione uma das opções abaixo\n" 
                + "1.Cadastrar loja\n"
                + "2.Editar Informaçoes da loja\n"
                + "3.Pesquisar loja\n"
                + "4.Deletar loja\n" 
                + "5.Visualizar loja\n"
                + "6.Sair");

            int escolhaloja = Read.getInt();

            switch (escolhaloja) {
                case 1:
                    Loja novaLoja = new Loja();
                    novaLoja.cadastrarLoja();
                    lojas.add(novaLoja);
                    break;

                case 2:
                    int indexedit = 0;
                    int infoEdit;

                    clear();
                    System.out.println("Digite o nome da filial a ser editada: ");
                    String posedit = Read.getString();
                    pulaLinha(1);

                    for (Loja lojaedit : lojas) {
                        if(lojaedit.getNomefilial().equalsIgnoreCase(posedit)){
                            break;
                        }
                        indexedit++;
                    }
                    
                    if(indexedit >= lojas.size()){
                        System.out.println("Loja não encontrada!");
                        pulaLinha(1);
                        System.out.println("Digite qualquer tecla para voltar!");
                        tecla = Read.getChar();
                    }else{
                        System.out.println(clientes.get(indexedit));
                        pulaLinha(1);
                        System.out.println("Qual informação deseja alterar?: " + "\n"
                                        +  "1)Nome filial" + "\n"
                                        +  "2)Endereço" + "\n"
                                        +  "3)Estoque calça" + "\n"
                                        +  "4)Estoque camisa" + "\n"
                                        +  "5)cnpj");
                        infoEdit = Read.getInt();
                        pulaLinha(1);

                        
                        lojas.get(indexedit).editarLoja(infoEdit);
                    }
                   break;

                case 3:
                    verpesq = 0;

                    clear();
                    System.out.println("Digite o nome da filial: ");
                    String pesq = Read.getString();
                    pulaLinha(1);

                    for (Loja lojapesq : lojas) {
                        if(lojapesq.getNomefilial().equalsIgnoreCase(pesq)){
                            System.out.println(lojapesq);
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
                    System.out.println("Digite o nome da filial a ser editada: ");
                    String posedel = Read.getString();
                    pulaLinha(1);

                    for (Loja lojaedit : lojas) {
                        if(lojaedit.getNomefilial().equalsIgnoreCase(posedel)){
                            break;
                        }
                        indexdel++;
                    }

                    if(indexdel >= clientes.size()){
                        System.out.println("Loja não encontrada!");
                        pulaLinha(1);
                        System.out.println("Digite qualquer tecla para voltar!");
                        tecla = Read.getChar();
                    }else{
                        clientes.remove(indexdel);
                    }
                    break;

                case 5:
                    for(int cout=0; cout<lojas.size(); cout++){
                        System.out.println(lojas.get(cout));
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
    
    private static void seccaofuncionario() {
        char tecla;
        int verpesq;

        while (loop) {
            clear();
            System.out.println(
                "Selecione uma das opções abaixo\n" 
                + "1.Cadastrar funcionario\n"
                + "2.Editar Informaçoes do funcionario\n"
                + "3.Pesquisar pelo nome do funcionario\n"
                + "4.Deletar funcionario\n" 
                + "5.Visualizar funcionario\n"
                + "6.Sair");

            int escolhaloja = Read.getInt();

            switch (escolhaloja) {
                case 1:
                    Funcionario novofuncionario = new Funcionario();
                    novofuncionario.cadatrarFuncionario();
                    funcionarios.add(novofuncionario);
                    break;

                case 2:
                    int indexedit = 0;
                    int infoEdit;

                    clear();
                    System.out.println("Digite o nome do funcionario a ser editado: ");
                    String posedit = Read.getString();
                    pulaLinha(1);

                    for (Funcionario funcionarioedit : funcionarios) {
                        if(funcionarioedit.getNome().equalsIgnoreCase(posedit)){
                            break;
                        }
                        indexedit++;
                    }
                    
                    if(indexedit >= funcionarios.size()){
                        System.out.println("Funcionario não encontrado(a)!");
                        pulaLinha(1);
                        System.out.println("Digite qualquer tecla para voltar!");
                        tecla = Read.getChar();
                    }else{
                        System.out.println(funcionarios.get(indexedit));
                        pulaLinha(1);
                        System.out.println("Qual informação deseja alterar?: " + "\n"
                                        +  "1)Nome do funcionario " + "\n"
                                        +  "2)email" + "\n"
                                        +  "3)cpf" + "\n"
                                        +  "4)Data de contrataçao" + "\n"
                                        +  "5)Telefone");
                        infoEdit = Read.getInt();
                        pulaLinha(1);

                        
                        funcionarios.get(indexedit).editarFuncionario(infoEdit);
                    }
                   break;

                case 3:
                    verpesq = 0;

                    clear();
                    System.out.println("Digite o nome do funcionario: ");
                    String pesq = Read.getString();
                    pulaLinha(1);

                    for (Funcionario funcionariopesq : funcionarios) {
                        if(funcionariopesq.getNome().equalsIgnoreCase(pesq)){
                            System.out.println(funcionariopesq);
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
                    System.out.println("Digite o nome do funcionario a ser editado: ");
                    String posedel = Read.getString();
                    pulaLinha(1);

                    for (Funcionario funcionarioedit : funcionarios) {
                        if(funcionarioedit.getNome().equalsIgnoreCase(posedel)){
                            break;
                        }
                        indexdel++;
                    }

                    if(indexdel >= funcionarios.size()){
                        System.out.println("Funcionario não encontrado!");
                        pulaLinha(1);
                        System.out.println("Digite qualquer tecla para voltar!");
                        tecla = Read.getChar();
                    }else{
                        funcionarios.remove(indexdel);
                    }
                    break;

                case 5:
                    for(int cout=0; cout<funcionarios.size(); cout++){
                        System.out.println(funcionarios.get(cout));
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

    private static void seccaoVenda() {
        char tecla;
        int verpesq;

        while (loop) {
            clear();
            System.out.println(
                "Selecione uma das opções abaixo\n" 
                + "1.Cadastrar venda\n"
                + "2.Editar Informaçoes da Venda\n"
                + "3.Pesquisar pelo numero de identificaçao da Venda\n"
                + "4.Deletar Venda\n" 
                + "5.Visualizar dados da Venda\n"
                + "6.Sair");

            int escolhaloja = Read.getInt();

            switch (escolhaloja) {
                case 1:
                    Venda novavenda = new Venda();
                    novavenda.cadatrarVenda();
                    vendas.add(novavenda);
                    break;

                case 2:
                    int indexedit = 0;
                    int infoEdit;

                    clear();
                    System.out.println("Digite o nome da venda a ser editada: ");
                    String posedit = Read.getString();
                    pulaLinha(1);

                    for (Venda vendaedit : vendas) {
                        if(vendaedit.getNumident().equalsIgnoreCase(posedit)){
                            break;
                        }
                        indexedit++;
                    }
                    
                    if(indexedit >= funcionarios.size()){
                        System.out.println("Venda não encontrado(a)!");
                        pulaLinha(1);
                        System.out.println("Digite qualquer tecla para voltar!");
                        tecla = Read.getChar();
                    }else{
                        System.out.println(vendas.get(indexedit));
                        pulaLinha(1);
                        System.out.println("Qual informação deseja alterar?: " + "\n"
                                        +  "1)Numero de identificação da venda " + "\n"
                                        +  "2)Valor da venda" + "\n"
                                        +  "3)Nome do cliente" + "\n"
                                        +  "4)Nome do fucionario" + "\n"
                                        +  "5)Telefone");
                        infoEdit = Read.getInt();
                        pulaLinha(1);

                        
                        vendas.get(indexedit).editarVenda(infoEdit);
                    }
                   break;

                case 3:
                    verpesq = 0;

                    clear();
                    System.out.println("Digite o numero de identificação da venda: ");
                    String pesq = Read.getString();
                    pulaLinha(1);

                    for (Venda vendapesq : vendas) {
                        if(vendapesq.getNumident().equalsIgnoreCase(pesq)){
                            System.out.println(vendapesq);
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
                    System.out.println("Digite o numero de identificação de venda para edita-la: ");
                    String posedel = Read.getString();
                    pulaLinha(1);

                    for (Venda vendaedit : vendas) {
                        if(vendaedit.getNumident().equalsIgnoreCase(posedel)){
                            break;
                        }
                        indexdel++;
                    }

                    if(indexdel >= vendas.size()){
                        System.out.println("Venda não encontrada!");
                        pulaLinha(1);
                        System.out.println("Digite qualquer tecla para voltar!");
                        tecla = Read.getChar();
                    }else{
                        vendas.remove(indexdel);
                    }
                    break;

                case 5:
                    for(int cout=0; cout<vendas.size(); cout++){
                        System.out.println(vendas.get(cout));
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

    private static void seccaoCamisa() {
        char tecla;
        int verpesq;

        while (loop) {
            clear();
            System.out.println(
                "Selecione uma das opções abaixo\n" 
                + "1.Cadastrar camisa\n"
                + "2.Editar Informaçoes da camisa\n"
                + "3.Pesquisar pelo nome da camisa\n"
                + "4.Deletar camisa\n" 
                + "5.Visualizar dados das camisas\n"
                + "6.Sair");

            int escolhacamisa = Read.getInt();

            switch (escolhacamisa) {
                case 1:
                    Camisa novacamisa = new Camisa();
                    novacamisa.cadastrarcamisa();
                    camisas.add(novacamisa);
                    break;

                case 2:
                    int indexedit = 0;
                    int infoEdit;

                    clear();
                    System.out.println("Digite o nome da camisa a ser editada: ");
                    String posedit = Read.getString();
                    pulaLinha(1);

                    for (Camisa camisaedit : camisas) {
                        if(camisaedit.getNome().equalsIgnoreCase(posedit)){
                            break;
                        }
                        indexedit++;
                    }
                    
                    if(indexedit >= camisas.size()){
                        System.out.println("camisa não encontrada !");
                        pulaLinha(1);
                        System.out.println("Digite qualquer tecla para voltar!");
                        tecla = Read.getChar();
                    }else{
                        System.out.println(camisas.get(indexedit));
                        pulaLinha(1);
                        System.out.println("Qual informação deseja alterar?: " + "\n"
                                        +  "1)Nome da camisa " + "\n"
                                        +  "2)Descrição" + "\n"
                                        +  "3)Genero" + "\n"
                                        +  "4)preço" + "\n"
                                        +  "5)Marca"+ "\n"
                                        +  "6)Cor" + "\n"
                                        +  "7)Tamanho");
                        infoEdit = Read.getInt();
                        pulaLinha(1);

                        
                        camisas.get(indexedit).editarCamisa(infoEdit);
                    }
                   break;

                case 3:
                    verpesq = 0;

                    clear();
                    System.out.println("Digite o nome da camisa: ");
                    String pesq = Read.getString();
                    pulaLinha(1);

                    for (Camisa camisapesq : camisas) {
                        if(camisapesq.getNome().equalsIgnoreCase(pesq)){
                            System.out.println(camisapesq);
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
                    System.out.println("Digite o nome da camisa para editar as informações: ");
                    String posedel = Read.getString();
                    pulaLinha(1);

                    for (Camisa camisaedit : camisas) {
                        if(camisaedit.getNome().equalsIgnoreCase(posedel)){
                            break;
                        }
                        indexdel++;
                    }

                    if(indexdel >= camisas.size()){
                        System.out.println("Camisa não encontrada!");
                        pulaLinha(1);
                        System.out.println("Digite qualquer tecla para voltar!");
                        tecla = Read.getChar();
                    }else{
                        camisas.remove(indexdel);
                    }
                    break;

                case 5:
                    for(int cout=0; cout<camisas.size(); cout++){
                        System.out.println(camisas.get(cout));
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

    private static void seccaoCalca() {
        char tecla;
        int verpesq;

        while (loop) {
            clear();
            System.out.println(
                "Selecione uma das opções abaixo\n" 
                + "1.Cadastrar camisa\n"
                + "2.Editar Informaçoes da camisa\n"
                + "3.Pesquisar pelo nome da camisa\n"
                + "4.Deletar camisa\n" 
                + "5.Visualizar dados das camisas\n"
                + "6.Sair");

            int escolhacalca = Read.getInt();

            switch (escolhacalca) {
                case 1:
                    Calca novacalca = new Calca();
                    novacalca.cadastrarcalca();
                    calcas.add(novacalca);
                    break;

                case 2:
                    int indexedit = 0;
                    int infoEdit;

                    clear();
                    System.out.println("Digite o nome da calça a ser editada: ");
                    String posedit = Read.getString();
                    pulaLinha(1);

                    for (Calca calcaedit : calcas) {
                        if(calcaedit.getNome().equalsIgnoreCase(posedit)){
                            break;
                        }
                        indexedit++;
                    }
                    
                    if(indexedit >= calcas.size()){
                        System.out.println("calça não encontrada !");
                        pulaLinha(1);
                        System.out.println("Digite qualquer tecla para voltar!");
                        tecla = Read.getChar();
                    }else{
                        System.out.println(calcas.get(indexedit));
                        pulaLinha(1);
                        System.out.println("Qual informação deseja alterar?: " + "\n"
                                        +  "1)Nome da calça " + "\n"
                                        +  "2)Descrição" + "\n"
                                        +  "3)Genero" + "\n"
                                        +  "4)preço" + "\n"
                                        +  "5)Marca"+ "\n"
                                        +  "6)Cor" + "\n"
                                        +  "7)Tamanho da cintura");
                        infoEdit = Read.getInt();
                        pulaLinha(1);

                        
                        calcas.get(indexedit).editarCalca(infoEdit);
                    }
                   break;

                case 3:
                    verpesq = 0;

                    clear();
                    System.out.println("Digite o nome da calça: ");
                    String pesq = Read.getString();
                    pulaLinha(1);

                    for (Calca calcapesq : calcas) {
                        if(calcapesq.getNome().equalsIgnoreCase(pesq)){
                            System.out.println(calcapesq);
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
                    System.out.println("Digite o nome da camisa para editar as informações: ");
                    String posedel = Read.getString();
                    pulaLinha(1);

                    for (Calca calcaedit : calcas) {
                        if(calcaedit.getNome().equalsIgnoreCase(posedel)){
                            break;
                        }
                        indexdel++;
                    }

                    if(indexdel >= calcas.size()){
                        System.out.println("calça não encontrada!");
                        pulaLinha(1);
                        System.out.println("Digite qualquer tecla para voltar!");
                        tecla = Read.getChar();
                    }else{
                        calcas.remove(indexdel);
                    }
                    break;

                case 5:
                    for(int cout=0; cout<calcas.size(); cout++){
                        System.out.println(calcas.get(cout));
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