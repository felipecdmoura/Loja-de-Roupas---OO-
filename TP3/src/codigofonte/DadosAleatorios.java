package codigofonte;

import java.util.ArrayList;

public class DadosAleatorios {
    public static void setDefaultData(ArrayList<Cliente> cliente, ArrayList<Funcionario> funcionarios, ArrayList<Venda> vendas, ArrayList<Calca> calcas, ArrayList<Camisa> camisas) { //Método para definir os 10 clientes e produtos padrão
        Telefone telefone;

        //DADOS PRE CARREGADOS
        
        //DADOS DE CLIENTES
        cliente.add(new Cliente("Felipe", "felipe@gmail.com", "02938374653", new Telefone(61, 987345643), "17//3/2002"));
        cliente.add(new Cliente("Marcos", "marcos@gmail.com", "20293847563", new Telefone(61, 982736454), "13/2/2000"));
        cliente.add(new Cliente("Julia", "julia@gmail.com", "10293837452", new Telefone(61, 981224000), "20/4/1999"));
        cliente.add(new Cliente("Renata", "renata@gmail.com", "20392827564", new Telefone(11, 982726345), "29/10/1995"));
        cliente.add(new Cliente("Pedro", "pedro@gmail.com", "1654789754", new Telefone(61, 995456874), "2/6/2001"));
        cliente.add(new Cliente("Lucas", "lucas@gmail.com", "12321456879", new Telefone(61, 999998754), "15/8/1980"));
        cliente.add(new Cliente("Fernanda", "fernanda@gmail.com", "32215465789", new Telefone(21, 978456555), "16/9/1970"));
        cliente.add(new Cliente("Maria", "maria@gmail.com", "12648975321", new Telefone(61, 988775321), "11/11/2000"));
        cliente.add(new Cliente("Livia", "livia@gmail.com", "31546879845", new Telefone(61, 998755654), "21/8/1988"));
        cliente.add(new Cliente("Tales", "tales@gmail.com", "21564897546", new Telefone(61, 986588745), "19/9/2002"));

        //DADOS DE FUNCIONARIOS
        funcionarios.add(new Funcionario("Roberto", "robertin@gmail.com", "21567797546", new Telefone(61, 981209235), "19/7/2000"));
        funcionarios.add(new Funcionario("Claudio", "Claudin@gmail.com", "25564897546", new Telefone(61, 981209235), "19/7/2000"));
       
        //DADOS DE CALCAS
        calcas.add(new Calca("01", "calça sportwear nike mid", "calça voltada para esportes ", 'M', 123, "nike", "preta", 54, 5));
        calcas.add(new Calca("02", "calça casual reserva mid", "calça voltada para o dia a dia ", 'F', 220, "reserva", "preta", 74, 4));
        calcas.add(new Calca("03", "calça confort adidas", "calça de moletom voltada para conforto ", 'M', 123, "adidas", "preta", 64, 6));
        calcas.add(new Calca("04", "calça street nike ", "calça voltada para streetwear ", 'M',223, "nike", "azul",44, 10));
        calcas.add(new Calca("05", "calça saruel mid", "calça sareul volta para moda ", 'F',153, "zara", "marrom",54, 3));

        //DADOS DE CAMISAS
        camisas.add(new Camisa("11", "camisa sportwear nike ", "camisa voltada para esportes ", 'F', 153, "nike", "preta", "G", 5));
        camisas.add(new Camisa("12", "camisa moda casual de luxo lacoste", "camisa voltada para moda", 'M', 223, "lacoste", "preta", "M", 6));
        camisas.add(new Camisa("13", "camisa manga longa pool ", "camisa voltada para conforto ", 'F', 85, "pool", "azul", "GG", 3));
        camisas.add(new Camisa("14", "camisa cavada scott", "camisa voltada para moda ", 'M', 192, "scott", "branca", "P", 7));
        camisas.add(new Camisa("15", "camisa streetwear adidas", "camisa voltada para streetwear ", 'F', 180, "adidas", "cinza", "PP", 2));


        
    }
}
