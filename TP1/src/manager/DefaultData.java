package manager;

public class DefaultData {
    public static void setDefaultData(Client person[], Product product[]) { //Método para definir os 10 clientes e produtos padrão

        //Nome dos clientes
        person[0].name = "Joao";
        person[1].name = "Marcos";
        person[2].name = "Pedro";
        person[3].name = "Tiago";
        person[4].name = "Sara";
        person[5].name = "Luiz";
        person[6].name = "Fernanda";
        person[7].name = "Felipe";
        person[8].name = "Lucas";
        person[9].name = "Maria";

        //Endereço dos clientes
        person[0].address = "Rua Marajá";
        person[1].address = "Rua Alecrim";
        person[2].address = "Rua Araucárias";
        person[3].address = "Rua São Bernardo"; 
        person[4].address = "Rua 25 de Março";
        person[5].address = "Rua José Almeida";
        person[6].address = "Rua São Carlos"; 
        person[7].address = "Rua Ipiranga";
        person[8].address = "Rua Paraná";
        person[9].address = "Rua Santa Maria";

        //Telefone dos clientes
        person[0].tel = "987462432";
        person[1].tel = "932654872";
        person[2].tel = "968751325";
        person[3].tel = "986532158";
        person[4].tel = "987326548";
        person[5].tel = "976258463";
        person[6].tel = "934587136";
        person[7].tel = "931254877";
        person[8].tel = "988661875";
        person[9].tel = "933866751";

    //-----------PRODUTOS------------

        //Nome dos produtos
        product[0].name = "Carne";
        product[1].name = "Leite";
        product[2].name = "Sal";
        product[3].name = "Ovo";
        product[4].name = "Iogurte";
        product[5].name = "Banana";
        product[6].name = "Maçã";
        product[7].name = "Uva";
        product[8].name = "Suco";
        product[9].name = "Biscoito";
        
        //Descrição dos produtos
        product[0].descrip = "Carne Acém 1,5kg";
        product[1].descrip = "Leite desnatado piranjuba";
        product[2].descrip = "Sal de flor para churrasco";
        product[3].descrip = "Caixa ovo caipira 20un.";
        product[4].descrip = "Iogurte Batavo Morango";
        product[5].descrip = "Banana nanica";
        product[6].descrip = "Maçã gala comun";
        product[7].descrip = "Caixa uva thompson ";
        product[8].descrip = "Caixa suco DelValle";
        product[9].descrip = "Pacote biscoito Oreo";

        //Preço dos produtos
        product[0].price = 60;
        product[1].price = 7.49;
        product[2].price = 4.99;
        product[3].price = 10.99;
        product[4].price = 3.49;
        product[5].price = 4.99;
        product[6].price = 4.49;
        product[7].price = 6.49;
        product[8].price = 3.19;
        product[9].price = 2.99;

        //Lucro dos produtos
        product[0].profit = 12;
        product[1].profit = 20;
        product[2].profit = 25;
        product[3].profit = 15;
        product[4].profit = 20;
        product[5].profit = 30;
        product[6].profit = 22;
        product[7].profit = 24;
        product[8].profit = 19;
        product[9].profit = 18;

        //Qtd. em estoque dos produtos
        product[0].stock = 5;
        product[1].stock = 17;
        product[2].stock = 19;
        product[3].stock = 20;
        product[4].stock = 25;
        product[5].stock = 11;
        product[6].stock = 16;
        product[7].stock = 30;
        product[8].stock = 35;
        product[9].stock = 23;
    }
}
