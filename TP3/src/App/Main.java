package App;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

import Objetos.*;


public class Main {
    //Delcaração dos e instanciação dos arraylists e do objeto loja
    private static ArrayList <Cliente> clientes = new ArrayList<Cliente>();
    private static ArrayList <Funcionario> funcionarios = new ArrayList<Funcionario>();
    private static ArrayList <Venda> vendas = new ArrayList<Venda>();
    private static ArrayList <Camisa> camisas = new ArrayList<Camisa>();
    private static ArrayList <Calca> calcas = new ArrayList<Calca>();
    private static Loja loja  = new Loja("021.054.932-21","qr 312 cj f loja 315 Gama DF", "Filial Guimarães");

    private static boolean loop = true;//Variavel para controle dos menus, defindo quando se deve ou nao sair de um loop.
    public static void main(String[] args) {
        
        DadosAleatorios.setDefaultData(clientes, funcionarios, vendas, calcas, camisas);//Metodo que carrega dados aleatorios para clientes, funcionarios, camisas e calcas.

        while (true) {
            System.out.println("Selecione uma das abas abaixo\n" //Menu inicial
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
                    seccaoCliente();//Puxa o metodo da seccao de clientes
                    break;
                case 2:
                    clear();
                    seccaoloja();//Puxa o metodo da seccao de loja
                    break;
                case 3:
                    clear();
                    seccaofuncionario();//Puxa o metodo da seccao de funcionario
                    break;
                case 4:
                    clear();
                    seccaoVenda();//Puxa o metodo da seccao de venda
                    break;
                case 5:
                    clear();
                    seccaoCamisa();//Puxa o metodo da seccao de camisa
                    break;
                case 6:
                    clear();
                    seccaoCalca();//Puxa o metodo da seccao de calca
                    break;
                case 7:
                    System.exit(0);
                default:
                    break;
            }
        }
    }
    
    //Método para limpar a tela
    private static void clear() { 
		for(int count=1; count<=25; count++) {
			System.out.println();
		}
	}

    //Metodo para pular linha
    private static void pulaLinha(int nlinha) {
        for (int i = 0; i < nlinha; i++) {
            System.out.println();
        }
    }

    //Metodo da seccao de controle de cliente
    private static void seccaoCliente() {
        char tecla; //Serve apenas como um confirmador para avancar na interface, para que o usuario consiga observar e analisar as informacoes tranquilamente
        int verpesq;

        while (loop) {
            clear();

            //Menu de opcoes para cliente
            System.out.println(
                "Selecione uma das opções abaixo\n" 
                + "1.Cadastrar Cliente\n"
                + "2.Editar Informações do Cliente\n"
                + "3.Pesquisar Cliente\n"
                + "4.Deletar Cliente\n" 
                + "5.Visualizar Clientes\n"
                + "6.Sair");

            int escolhacliente = Read.getInt();

            switch (escolhacliente) {
                case 1: //Opcao para cadastro de cliente
                    Cliente novocCliente = new Cliente(); // Instancia um novo cliente
                    novocCliente.cadatrarCliente(); //Registra esse cliente pelo metodo de cliente
                    clientes.add(novocCliente); //Adiciona esse novo cliente ao arraylist clientes
                    break;

                case 2: //Opcao para editar informacoes de um cliente ja cadastrado 
                    int indexedit = 0; //Variavel com o objetivo de armazenar a localizacao no arraylist do cliente que se almeja editar
                    int infoEdit; //Seletor de qual informacao deseja-se alterar

                    clear();
                    System.out.println("Digite o nome do cliente a ser editado: ");
                    String posedit = Read.getString(); //Nome a ser pesquisado
                    pulaLinha(1);

                    //Repetidor que tem como funcao pesquisar um cliente, com o nome inserido anteriormente, no arraylsit cliente
                    for (Cliente clienteEdit : clientes) {
                        if(clienteEdit.getNome().equalsIgnoreCase(posedit)){
                            break;
                        }
                        indexedit++;
                    }

                    if(indexedit >= clientes.size()){ //Se nenhum cliente com o nome for inserido, a posicao sera do tamanho ou maior que o arraylist.size(), assim informa que nada foi encontrado
                        System.out.println("Cliente não encontrado!");
                        pulaLinha(1);
                        System.out.println("Digite qualquer tecla para voltar!"); 
                        tecla = Read.getChar(); //Apenas para confirmar o avanco para o resto do codigo
                    }else{ //Caso seja encontrado, inicializa o menu de qual informacao deseja-se alterar
                        System.out.println(clientes.get(indexedit));
                        pulaLinha(1);
                        System.out.println("Qual informação deseja alterar?: " + "\n"
                                        +  "1)Nome" + "\n"
                                        +  "2)Email" + "\n"
                                        +  "3)CPF" + "\n"
                                        +  "4)Data de Nascimento" + "\n"
                                        +  "5)Telefone");
                        infoEdit = Read.getInt(); //Le a opcao do menu escolhida
                        pulaLinha(1);

                        
                        clientes.get(indexedit).editCliente(infoEdit); //Puxa o metodo edit para o clinte almejado
                    }
                   break;

                case 3: //Opcao para pesquisar um cliente cadastrado
                    verpesq = 0; //Verificador de busca, se encontrou ou nao

                    clear();
                    System.out.println("Digite o nome do cliente: ");
                    String pesq = Read.getString(); //Le o nome inserido
                    pulaLinha(1);

                    for (Cliente clientePsq : clientes) {
                        if(clientePsq.getNome().equalsIgnoreCase(pesq)){
                            System.out.println(clientePsq); //Escreve na tela o cliente almejado
                            verpesq = 1; //Indica que o cliente foi encontrado
                        }
                    }

                    if(verpesq == 0){ //Erro de nao encontrado
                        System.out.println("Não encontrado!");
                    }

                    pulaLinha(1);
                    System.out.println("Digite qualquer tecla para voltar!");
                    tecla = Read.getChar();
                    break;

                case 4: //Opcao para deletar um cliente
                    int indexdel = 0;

                    clear();
                    System.out.println("Digite o nome do cliente a ser deletado: ");
                    String posedel = Read.getString(); //Le o nome do cliente a ser deletado
                    pulaLinha(1);

                    //Acha a posicao do clienete, se cadastrado, igual a opcao editar
                    for (Cliente clienteEdit : clientes) {
                        if(clienteEdit.getNome().equalsIgnoreCase(posedel)){ 
                            break;
                        }
                        indexdel++;
                    }

                    if(indexdel >= clientes.size()){ //Erro de nao encontrado
                        System.out.println("Cliente não encontrado!");
                        pulaLinha(1);
                        System.out.println("Digite qualquer tecla para voltar!");
                        tecla = Read.getChar();
                    }else{
                        clientes.remove(indexdel); //Caso o cliente seja encontrado, o programa oi deleta
                    }
                    break;

                case 5: //Opcao para escrever todos os clientes cadastrados na tela
                    for(int cout=0; cout<clientes.size(); cout++){
                        System.out.println(clientes.get(cout));
                        pulaLinha(1);
                    }

                    System.out.println("Digite qualquer tecla para voltar!");
                    tecla = Read.getChar();
                    break;
                case 6:
                    loop = false; //Sai do loop do menu atual
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
                + "1.Visualizar Loja\n"
                + "2.Editar Informações da Loja\n"
                + "3.Sair");
                
            int escolhaloja = Read.getInt(); //Escolha do menu acima

            switch (escolhaloja) {
                case 1: //Opcao apra vizualizar as informacoes da loja
                    System.out.println(loja);
                    pulaLinha(1);
                    
                    System.out.println("Digite qualquer tecla para voltar!");
                    tecla = Read.getChar();
                    break;

                case 2: //Opcao para editar informacoes da loja (funciona semelhante a de cliente)
                    int infoEdit;
                    clear();
                    
                    System.out.println(loja);
                    pulaLinha(1);
                    System.out.println("Qual informação deseja alterar?: " + "\n"
                                    +  "1)Nome Filial" + "\n"
                                    +  "2)Endereço" + "\n"
                                    +  "3)CNPJ");
                    infoEdit = Read.getInt(); //Escolha do menu acima
                    pulaLinha(1);
                        
                    loja.editarLoja(infoEdit);
                    break;

                case 3: //Sai do menu atual
                    loop = false;
                    break;

                default:
                    System.out.println("Opção Inválida!");
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
                + "1.Cadastrar Funcionario\n"
                + "2.Editar Informações de Funcionário\n"
                + "3.Pesquisar Funcionario\n"
                + "4.Deletar Funcionario\n" 
                + "5.Visualizar Funcionarios\n"
                + "6.Sair");

            int escolhafuncionario = Read.getInt(); //Escolha do menu acima

            switch (escolhafuncionario) {
                case 1: //Opcao para cadastrar um novo funcionario (funciona semelhante a de cliente)
                    Funcionario novofuncionario = new Funcionario();
                    novofuncionario.cadatrarFuncionario();
                    funcionarios.add(novofuncionario);
                    break;

                case 2: //Opcao para editar as infos de um funcionario cadastrado (funciona semelhante a de cliente)
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
                                        +  "2)Email" + "\n"
                                        +  "3)CPF" + "\n"
                                        +  "4)Data de contrataçao" + "\n"
                                        +  "5)Telefone");
                        infoEdit = Read.getInt(); //Escolha do menu acima
                        pulaLinha(1);

                        
                        funcionarios.get(indexedit).editarFuncionario(infoEdit);
                    }
                   break;

                case 3: //Opcao de pesquisa de um funcionario cadastrado (funciona semelhante a de cliente)
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

                case 4: //Opcao para deletar um funcionario cadastrado (funciona semelhante a de cliente)
                    int indexdel = 0;

                    clear();
                    System.out.println("Digite o nome do funcionario a ser deletado: ");
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

                case 5: //Opcao para escrever na tela todos os funcionarios cadastrados (funciona semelhante a de cliente)
                    for(int cout=0; cout<funcionarios.size(); cout++){
                        System.out.println(funcionarios.get(cout));
                        pulaLinha(1);
                    }

                    System.out.println("Digite qualquer tecla para voltar!");
                    tecla = Read.getChar();
                    break;
                case 6: //Sai do menu atual
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
                + "1.Registrar Venda\n"
                + "2.Pesquisar Venda\n"
                + "3.Visualizar Vendas\n"
                + "4.Sair");

            int escolhavenda = Read.getInt(); //Escolha do menu acima

            switch (escolhavenda) {
                case 1: //Registra uma nova venda
                    int posfunc = 0;
                    int poscliente = 0;
                    int poscamisa = 0;
                    int poscalca = 0;
                    float precototal = 0;

                    //O funcionario responsavel digita o seu cpf
                    clear();
                    System.out.println("Digite o CPF do funcionário responsável: ");
                    String pesqfunc = Read.getString();
                    pulaLinha(1);

                    //Esse cpf e procurado pelo arraylist de funcionarios
                    for (Funcionario funcionarioindex : funcionarios) {
                        if(funcionarioindex.getCpf().equalsIgnoreCase(pesqfunc)){
                            break;
                        }
                        posfunc++; //Posicao do funcionario no arraylist
                    }
            
                    if(posfunc >= funcionarios.size()){ //Erro de nao encontrado
                        System.out.println("Não encontrado!");
                        break;
                    }
                    
                    //O funcionario digita o nome do cliente que esta fazendo a compra
                    clear();
                    System.out.println("Digite o nome do cliente: ");
                    String pesqcliente = Read.getString();
                    pulaLinha(1);
                    
                    //O nome do cliente e pesquisado no arraylist cliente (E OBRIGATORIO O CLIENTE ESTAR CADASTRADO PARA FAZER A COMPRA)
                    for (Cliente clienteindex : clientes) {
                        if(clienteindex.getNome().equalsIgnoreCase(pesqcliente)){
                            break;
                        }
                        poscliente++; //Posicao do cliente no arraylist
                    }
                    

                    if(poscliente >= clientes.size()){ //Erro de nao registrado
                        System.out.println("Cliente não registrado!");
                        break;
                    }
                    
                    //Menu para selecao do tipo de produto vendido
                    clear();
                    System.out.println("Selecione o tipo do produto vendido: \n"
                                    +   "1)Camisa\n"
                                    +   "2)Calça");
            
                    int selectprod = Read.getInt(); //Escolha do menu acima
            
                    switch (selectprod) {
                        case 1: //Registro da venda de uma camisa

                            //Pesquisa a camisa vendida pelo seu Id
                            clear();
                            System.out.println("Digite o Id do produto: ");
                            String pesqcamisa = Read.getString();
            
                            for (Camisa camisaindex : camisas) {
                                if(camisaindex.getId().equalsIgnoreCase(pesqcamisa)){
                                    break;
                                }
                                poscamisa++; //Posicao da camisa no arraylist camisas
                            }
            
                            if(poscamisa >= camisas.size()){ //Erro de nao registrado
                                System.out.println("Produto não registrado!");
                                break;
                            }else{ //Produto encontrado
                                camisas.get(poscamisa).setEstoqueCamisa(camisas.get(poscamisa).getEstoqueCamisa() - 1); //Reduz o estoque do produto vendido em 1
                                precototal += camisas.get(poscamisa).getPreco(); //Soma o preco do produto ao valor total final
                            }
                            break;
                            
                        case 2: //Registro da venda de uma calca

                            //Pesquisa a calca vendida pelo seu Id
                            clear();
                            System.out.println("Digite o Id do produto: ");
                            String pesqcalca = Read.getString();
            
                            for (Calca calcaindex : calcas) {
                                if(calcaindex.getId().equalsIgnoreCase(pesqcalca)){
                                    break;
                                }
                                poscalca++; //Posicao da calca no arraylist calcas
                            }
            
                            if(poscalca >= calcas.size()){ //Erro de nao registrado
                                System.out.println("Produto não registrado!");
                                break;
                            }else{ //Produto encontrado
                                calcas.get(poscalca).setEstoqueCalca(calcas.get(poscalca).getEstoqueCalca() - 1); //Reduz o estoque do produto vendido em 1
                                precototal += calcas.get(poscalca).getPreco(); //Soma o preco do produto ao valor total final
                            }
                            break;
            
                        default:
                            System.out.println("Opção Inválida!");
                            break;
                    }
                    
                    //Pede um protocolo para a venda (funciona como um identificador da venda)
                    clear();
                    System.out.println("Digite o protocolo da venda: ");
                    String protoc = Read.getString();
            
                    switch (selectprod) {
                        case 1: //Cria um novo objeto Venda no arraylist vendas com o cliente, funcionario, CAMISA, precototal e numero de protocolo inseridos anteriormente
                            vendas.add(new Venda(clientes.get(poscliente), camisas.get(poscamisa), funcionarios.get(posfunc), precototal, protoc));
                            break;
                            
                        case 2: //Cria um novo objeto Venda no arraylist vendas com o cliente, funcionario, CALCA, precototal e numero de protocolo inseridos anteriormente
                            vendas.add(new Venda(clientes.get(poscliente), calcas.get(poscalca), funcionarios.get(posfunc), precototal, protoc));
                            break;
            
                        default:
                            break;
                    }
                    break;

                case 2: //Opcao para pesquisa de uma venda registrada pelo seu numero de protocolo (funciona semelhante ao de cliente)
                    verpesq = 0;

                    clear();
                    System.out.println("Digite o numero de protocolo da venda: ");
                    String pesq = Read.getString();
                    pulaLinha(1);

                    for (Venda vendapesq : vendas) {
                        if(vendapesq.getProtocolo().equalsIgnoreCase(pesq)){
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

                case 3: //Opcao para vizualizar todas as vendas registradas (funciona semelhante ao de cliente)
                    for(int cout=0; cout<vendas.size(); cout++){
                        System.out.println(vendas.get(cout));
                        pulaLinha(1);
                    }

                    System.out.println("Digite qualquer tecla para voltar!");
                    tecla = Read.getChar();
                    break;

                case 4: //Sai do menu atual
                    loop = false;
                    break;
                
                default:
                    System.out.println("Opção Inválida!");
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
                + "1.Cadastrar Camisa\n"
                + "2.Editar Camisa\n"
                + "3.Pesquisar Camisa\n"
                + "4.Deletar Camisa\n" 
                + "5.Visualizar Camisas\n"
                + "6.Sair");

            int escolhacamisa = Read.getInt(); //Escolha do menu acima

            switch (escolhacamisa) {
                case 1: //Opcao para cadastrar uma nova camisa (funciona semelhante a de cliente)
                    Camisa novacamisa = new Camisa();
                    novacamisa.cadastrarcamisa();
                    camisas.add(novacamisa);
                    break;

                case 2: //Opcao para editar as infos de uma camisa cadastrada (funciona semelhante a de cliente)
                    int indexedit = 0;
                    int infoEdit;

                    clear();
                    System.out.println("Digite o Id da camisa a ser editada: ");
                    String posedit = Read.getString();
                    pulaLinha(1);

                    for (Camisa camisaedit : camisas) {
                        if(camisaedit.getId().equalsIgnoreCase(posedit)){
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
                                        +  "1)Id da Camisa" + "\n"
                                        +  "2)Nome da Camisa " + "\n"
                                        +  "3)Descrição" + "\n"
                                        +  "4)Genero" + "\n"
                                        +  "5)Tamanho" + "\n"
                                        +  "6)Marca"+ "\n"
                                        +  "7)Cor" + "\n"
                                        +  "8)Preço" + "\n"
                                        +  "9)Estoque");
                        infoEdit = Read.getInt(); //Escolha do menu acima
                        pulaLinha(1);

                        
                        camisas.get(indexedit).editarCamisa(infoEdit);
                    }
                   break;

                case 3: //Opcao de pesquisa de uma camisa cadastrada (funciona semelhante a de cliente)
                    verpesq = 0;

                    clear();
                    System.out.println("Digite o Id da camisa: ");
                    String pesq = Read.getString();
                    pulaLinha(1);

                    for (Camisa camisapesq : camisas) {
                        if(camisapesq.getId().equalsIgnoreCase(pesq)){
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

                case 4: //Opcao para deletar uma camisa cadastrada (funciona semelhante a de cliente)
                    int indexdel = 0;

                    clear();
                    System.out.println("Digite o Id da camisa a ser deletada: ");
                    String posedel = Read.getString();
                    pulaLinha(1);

                    for (Camisa camisaedit : camisas) {
                        if(camisaedit.getId().equalsIgnoreCase(posedel)){
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

                case 5: //Opcao para escrever na tela todas as camisas cadastradas (funciona semelhante a de cliente)
                    for(int cout=0; cout<camisas.size(); cout++){
                        System.out.println(camisas.get(cout));
                        pulaLinha(1);
                    }

                    System.out.println("Digite qualquer tecla para voltar!");
                    tecla = Read.getChar();
                    break;
                case 6: //Sai do menu atual
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
                + "1.Cadastrar Calça\n"
                + "2.Editar Informaçoes da Calça\n"
                + "3.Pesquisar Calça\n"
                + "4.Deletar Calça\n" 
                + "5.Visualizar Calças\n"
                + "6.Sair");

            int escolhacalca = Read.getInt(); //Escolha do menu acima

            switch (escolhacalca) {
                case 1: //Opcao para cadastrar uma nova calca (funciona semelhante a de cliente)
                    Calca novacalca = new Calca();
                    novacalca.cadastrarcalca();
                    calcas.add(novacalca);
                    break;

                case 2: //Opcao para editar as infos de uma calca cadastrada (funciona semelhante a de cliente)
                    int indexedit = 0;
                    int infoEdit;

                    clear();
                    System.out.println("Digite o Id da calça a ser editada: ");
                    String posedit = Read.getString();
                    pulaLinha(1);

                    for (Calca calcaedit : calcas) {
                        if(calcaedit.getId().equalsIgnoreCase(posedit)){
                            break;
                        }
                        indexedit++;
                    }
                    
                    if(indexedit >= calcas.size()){
                        System.out.println("Calça não encontrada !");
                        pulaLinha(1);
                        System.out.println("Digite qualquer tecla para voltar!");
                        tecla = Read.getChar();
                    }else{
                        System.out.println(calcas.get(indexedit));
                        pulaLinha(1);
                        System.out.println("Qual informação deseja alterar?: " + "\n"
                                        +  "1)Id da Calça" + "\n"
                                        +  "2)Nome da Calça " + "\n"
                                        +  "3)Descrição" + "\n"
                                        +  "4)Genero" + "\n"
                                        +  "5)Tamanho da Cintura" + "\n"
                                        +  "6)Marca"+ "\n"
                                        +  "7)Cor" + "\n"
                                        +  "8)Preço" + "\n"
                                        +  "9)Estoque");
                        infoEdit = Read.getInt();
                        pulaLinha(1);

                        calcas.get(indexedit).editarCalca(infoEdit);
                    }
                   break;

                case 3: //Opcao de pesquisa de uma calca cadastrada (funciona semelhante a de cliente)
                    verpesq = 0;

                    clear();
                    System.out.println("Digite o Id da calça: ");
                    String pesq = Read.getString();
                    pulaLinha(1);

                    for (Calca calcapesq : calcas) {
                        if(calcapesq.getId().equalsIgnoreCase(pesq)){
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

                case 4: //Opcao para deletar uma calca cadastrada (funciona semelhante a de cliente)
                    int indexdel = 0;

                    clear();
                    System.out.println("Digite o Id da calça: ");
                    String posedel = Read.getString();
                    pulaLinha(1);

                    for (Calca calcaedit : calcas) {
                        if(calcaedit.getId().equalsIgnoreCase(posedel)){
                            break;
                        }
                        indexdel++;
                    }

                    if(indexdel >= calcas.size()){
                        System.out.println("Calça não encontrada!");
                        pulaLinha(1);
                        System.out.println("Digite qualquer tecla para voltar!");
                        tecla = Read.getChar();
                    }else{
                        calcas.remove(indexdel);
                    }
                    break;

                case 5: //Opcao para escrever na tela todas as calcas cadastradas (funciona semelhante a de cliente)
                    for(int cout=0; cout<calcas.size(); cout++){
                        System.out.println(calcas.get(cout));
                        pulaLinha(1);
                    }

                    System.out.println("Digite qualquer tecla para voltar!");
                    tecla = Read.getChar();
                    break;
                case 6: //Sai do menu atual
                    loop = false;
                    break;
            }
        }
        clear();
        loop = true;
    }

}