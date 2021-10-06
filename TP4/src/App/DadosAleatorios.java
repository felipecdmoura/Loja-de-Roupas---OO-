package App;

import java.util.ArrayList;

import Objetos.*;

public class DadosAleatorios{ 
    public static void setDefaultData(ArrayList<Cliente> clientes, ArrayList<Funcionario> funcionarios, ArrayList<Venda> vendas, ArrayList<Calca> calcas, ArrayList<Camisa> camisas) { //Método para definir os 10 clientes e produtos padrão
        Telefone telefone;

        //DADOS PRE CARREGADOS
        
        //DADOS DE CLIENTES
        clientes.add(new Cliente("Felipe", "felipe@gmail.com", "34278101007", new Telefone(61, 987345643), "17/3/2002"));
        clientes.add(new Cliente("Marcos", "marcos@gmail.com", "93024529055", new Telefone(61, 982736454), "13/2/2000"));
        clientes.add(new Cliente("Julia", "julia@gmail.com", "83674497034", new Telefone(61, 981224000), "20/4/1999"));
        clientes.add(new Cliente("Renata", "renata@gmail.com", "26842584060", new Telefone(11, 982726345), "29/10/1995"));
        clientes.add(new Cliente("Pedro", "pedro@gmail.com", "13292927072", new Telefone(61, 995456874), "2/6/2001"));
        clientes.add(new Cliente("Lucas", "lucas@gmail.com", "42997703077", new Telefone(61, 999998754), "15/8/1980"));
        clientes.add(new Cliente("Fernanda", "fernanda@gmail.com", "81428330003", new Telefone(21, 978456555), "16/9/1970"));
        clientes.add(new Cliente("Maria", "maria@gmail.com", "42501125002", new Telefone(61, 988775321), "11/11/2000"));
        clientes.add(new Cliente("Livia", "livia@gmail.com", "78802659028", new Telefone(61, 998755654), "21/8/1988"));
        clientes.add(new Cliente("Tales", "tales@gmail.com", "57560444008", new Telefone(61, 986588745), "19/9/2002"));

        //DADOS DE FUNCIONARIOS
        funcionarios.add(new Funcionario("Roberto", "robertin@gmail.com", "43325858015", new Telefone(61, 981209235), "19/7/2000"));
        funcionarios.add(new Funcionario("Claudio", "Claudin@gmail.com", "42993212001", new Telefone(61, 981209235), "19/7/2000"));
       
        //DADOS DE CALCAS
        calcas.add(new Calca("006", "calça sportwear nike mid", "calça voltada para esportes ", 'M', 123, "nike", "preta", 54, 5));
        calcas.add(new Calca("007", "calça casual reserva mid", "calça voltada para o dia a dia ", 'F', 220, "reserva", "preta", 74, 4));
        calcas.add(new Calca("008", "calça confort adidas", "calça de moletom voltada para conforto ", 'M', 123, "adidas", "preta", 64, 6));
        calcas.add(new Calca("009", "calça street nike ", "calça voltada para streetwear ", 'M',223, "nike", "azul",44, 10));
        calcas.add(new Calca("010", "calça saruel mid", "calça sareul volta para moda ", 'F',153, "zara", "marrom",54, 3));

        //DADOS DE CAMISAS
        camisas.add(new Camisa("001", "camisa sportwear nike ", "camisa voltada para esportes ", 'F', 153, "nike", "preta", "G", 5));
        camisas.add(new Camisa("002", "camisa moda casual de luxo lacoste", "camisa voltada para moda", 'M', 223, "lacoste", "preta", "M", 6));
        camisas.add(new Camisa("003", "camisa manga longa pool ", "camisa voltada para conforto ", 'F', 85, "pool", "azul", "GG", 3));
        camisas.add(new Camisa("004", "camisa cavada scott", "camisa voltada para moda ", 'M', 192, "scott", "branca", "P", 7));
        camisas.add(new Camisa("005", "camisa streetwear adidas", "camisa voltada para streetwear ", 'F', 180, "adidas", "cinza", "PP", 2));
    }
}
