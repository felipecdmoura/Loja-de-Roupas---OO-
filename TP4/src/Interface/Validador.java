package Interface;

public class Validador {
    public boolean validaCpf(String cpf) {
        boolean valid;
        int dig1;
        int dig2;
        int multi;
        int soma;

        if (cpf.length() != 11 || 
            cpf == "00000000000" || 
            cpf == "11111111111" || 
            cpf == "22222222222" || 
            cpf == "33333333333" || 
            cpf == "44444444444" || 
            cpf == "55555555555" || 
            cpf == "66666666666" ||
            cpf == "77777777777" ||
            cpf == "88888888888" ||
            cpf == "99999999999") {
            
            valid = false;
        } else {
            multi = 10;
            soma = 0;
            for(int count=0; count < 9; count ++){
                soma += Integer.parseInt(String.valueOf(cpf.charAt(count))) * (multi - count); 
            }

            if((soma % 11) < 2){
                dig1 = 0;
            }else{
                dig1 = 11 - (soma % 11);
            }
            System.out.println(dig1);

            multi = 11;
            soma = 0;
            for(int count=0; count < 10; count ++){
                if (multi == 2) {
                    soma += dig1 * 2;
                }else{
                    soma += Integer.parseInt(String.valueOf(cpf.charAt(count))) * (multi - count); 
                }
            }

            if((soma % 11) < 2){
                dig2 = 0;
            }else{
                dig2 = 11 - (soma % 11);
            }

            System.out.println(dig2);

            if(dig1 == cpf.charAt(10) && dig2 == cpf.charAt(11)){
                valid = true;
            }else{
                valid = false;
            }
        }

        return valid;
    }

    public void validaCnpj(String cnpj) {
        
    }

    public void validaId(String id) {
        
    }

    public void validaProtoc(String protoc) {
        
    }
}
