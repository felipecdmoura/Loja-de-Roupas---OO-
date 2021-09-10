package codigofonte;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    private static ArrayList <Cliente> clientes = new ArrayList<Cliente>();
    private static ArrayList <Funcionario> funcionarios = new ArrayList<Funcionario>();
    private static ArrayList <Venda> vendas = new ArrayList<Venda>();
    private static ArrayList <Camisa> camisas = new ArrayList<Camisa>();
    private static ArrayList <Calca> calcas = new ArrayList<Calca>();
    private static Loja loja;

    private static boolean loop = true;;
    public static void main(String[] args) {
        
        DadosAleatorios.setDefaultData(clientes, funcionarios, loja, vendas, calcas, camisas);

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
                + "1.Visualizar Loja\n"
                + "2.Editar Informaçoes da Loja\n"
                + "3.Sair");
                
            int escolhaloja = Read.getInt();

            switch (escolhaloja) {
                case 1:
                    System.out.println(loja);
                    pulaLinha(1);
                    
                    System.out.println("Digite qualquer tecla para voltar!");
                    tecla = Read.getChar();
                    break;

                case 2:
                    int infoEdit;
                    clear();
                    
                    System.out.println(loja);
                    pulaLinha(1);
                    System.out.println("Qual informação deseja alterar?: " + "\n"
                                    +  "1)Nome Filial" + "\n"
                                    +  "2)Endereço" + "\n"
                                    +  "3)CNPJ");
                    infoEdit = Read.getInt();
                    pulaLinha(1);
                        
                    loja.editarLoja(infoEdit);
                    break;

                case 3:
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
                + "2.Editar Informações do Funcionario\n"
                + "3.Pesquisar Funcionario\n"
                + "4.Deletar Funcionario\n" 
                + "5.Visualizar Funcionarios\n"
                + "6.Sair");

            int escolhafuncionario = Read.getInt();

            switch (escolhafuncionario) {
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
                                        +  "2)Email" + "\n"
                                        +  "3)CPF" + "\n"
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
                + "1.Registrar Venda\n"
                + "2.Pesquisar Venda\n"
                + "3.Visualizar Vendas\n"
                + "4.Sair");

            int escolhavenda = Read.getInt();

            switch (escolhavenda) {
                case 1:
                    int posfunc = 0;
                    int poscliente = 0;
                    int poscamisa = 0;
                    int poscalca = 0;
                    float precototal = 0;
            
                    clear();
                    System.out.println("Digite o CPF do funcionário responsável: ");
                    String pesqfunc = Read.getString();
                    pulaLinha(1);
            
                    for (Funcionario funcionarioindex : funcionarios) {
                        if(funcionarioindex.getCpf().equalsIgnoreCase(pesqfunc)){
                            break;
                        }
                        posfunc++;
                    }
            
                    if(posfunc >= funcionarios.size()){
                        System.out.println("Não encontrado!");
                        break;
                    }
            
                    clear();
                    System.out.println("Digite o nome do cliente: ");
                    String pesqcliente = Read.getString();
                    pulaLinha(1);
            
                    for (Cliente clienteindex : clientes) {
                        if(clienteindex.getNome().equalsIgnoreCase(pesqcliente)){
                            break;
                        }
                        poscliente++;
                    }
            
                    if(poscliente >= clientes.size()){
                        System.out.println("Cliente não registrado!");
                        break;
                    }
            
                    clear();
                    System.out.println("Selecione o tipo do produto vendido: \n"
                                    +   "1)Camisa\n"
                                    +   "2)Calça");
            
                    int selectprod = Read.getInt();
            
                    switch (selectprod) {
                        case 1:
                            clear();
                            System.out.println("Digite o Id do produto: ");
                            String pesqcamisa = Read.getString();
            
                            for (Camisa camisaindex : camisas) {
                                if(camisaindex.getId().equalsIgnoreCase(pesqcamisa)){
                                    break;
                                }
                                poscamisa++;
                            }
            
                            if(poscamisa >= camisas.size()){
                                System.out.println("Produto não registrado!");
                                break;
                            }
            
                            precototal += camisas.get(poscamisa).getPreco();
                            break;
                            
                        case 2:
                            clear();
                            System.out.println("Digite o Id do produto: ");
                            String pesqcalca = Read.getString();
            
                            for (Calca calcaindex : calcas) {
                                if(calcaindex.getId().equalsIgnoreCase(pesqcalca)){
                                    break;
                                }
                                poscalca++;
                            }
            
                            if(poscalca >= calcas.size()){
                                System.out.println("Produto não registrado!");
                                break;
                            }
            
                            precototal += calcas.get(poscalca).getPreco();
                            break;
            
                        default:
                            System.out.println("Opção Inválida!");
                            break;
                    }
                    
                    clear();
                    System.out.println("Digite o protocolo da venda: ");
                    String protoc = Read.getString();
            
                    switch (selectprod) {
                        case 1:
                            vendas.add(new Venda(clientes.get(poscliente), camisas.get(poscamisa), funcionarios.get(posfunc), precototal, protoc));
                            break;
                            
                        case 2:
                            vendas.add(new Venda(clientes.get(poscliente), calcas.get(poscalca), funcionarios.get(posfunc), precototal, protoc));
                            break;
            
                        default:
                            break;
                    }
                    break;

                case 2:
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

                case 3:
                    for(int cout=0; cout<vendas.size(); cout++){
                        System.out.println(vendas.get(cout));
                        pulaLinha(1);
                    }

                    System.out.println("Digite qualquer tecla para voltar!");
                    tecla = Read.getChar();
                    break;

                case 4:
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
                                        +  "1)Id da Camisa" + "\n"
                                        +  "2)Nome da Camisa " + "\n"
                                        +  "3)Descrição" + "\n"
                                        +  "4)Genero" + "\n"
                                        +  "5)preço" + "\n"
                                        +  "6)Marca"+ "\n"
                                        +  "7)Cor" + "\n"
                                        +  "8)Tamanho" + "\n"
                                        +  "9)Estoque");
                        infoEdit = Read.getInt();
                        pulaLinha(1);

                        
                        camisas.get(indexedit).editarCamisa(infoEdit);
                    }
                   break;

                case 3:
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

                case 4:
                    int indexdel = 0;

                    clear();
                    System.out.println("Digite o Id da camisa para editar as informações: ");
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
                                        +  "1)Id da Calça" + "\n"
                                        +  "2)Nome da Calça " + "\n"
                                        +  "3)Descrição" + "\n"
                                        +  "4)Genero" + "\n"
                                        +  "5)preço" + "\n"
                                        +  "6)Marca"+ "\n"
                                        +  "7)Cor" + "\n"
                                        +  "8)Tamanho" + "\n"
                                        +  "9)Estoque");
                        infoEdit = Read.getInt();
                        pulaLinha(1);

                        calcas.get(indexedit).editarCalca(infoEdit);
                    }
                   break;

                case 3:
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

                case 4:
                    int indexdel = 0;

                    clear();
                    System.out.println("Digite o Id da camisa para editar as informações: ");
                    String posedel = Read.getString();
                    pulaLinha(1);

                    for (Calca calcaedit : calcas) {
                        if(calcaedit.getId().equalsIgnoreCase(posedel)){
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