package Interface;

import App.DadosAleatorios;
import App.TelaPrincipal;

/**
 * Verifica se informações utilizadas pelas outras classe estão corretas.
 * @author Felipe e João
 * @version  TP5
 */
public class Validador {

    /**
     * Verifica se o Cpf e valido calculando os digitos validadores e comparando-os com os inseridos, para ver se sao iguais ou nao.
     * @param String contendo o cpf cadastrado ou editado
     * @return  verdadeiro ou falso, baseado na veracidade do cpf, se este e valido ou nao.
     */
    public static boolean validaCpf(String cpf) {
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
            // Calcula o primeiro digito verificador
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
            
            // Calcula o segundo digito verificador
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

            // Compara os digitos calculados com os do cpf inseridos, e retorna o veredito.
            if(dig1 == Integer.parseInt(String.valueOf(cpf.charAt(9))) && dig2 == Integer.parseInt(String.valueOf(cpf.charAt(10)))){
                valid = true;
            }else{
                valid = false;
            }
        }

        return valid;
    }

    /**
     * Verifica se o id inserido para a roupa tem tres algarismos ou nao.
     * @param id da roupa cadastrada, ou a ser editada.
     * @return verdadeiro ou falso, baseado em se o id tem tamano de 3 caracteres.
     */
    public static boolean validaId(String id) {
        if (id.length() != 3) {
            return false;
        }else {
            return true;
        }
    }

    /**
     * Verifica se o genero inserido na para a roupa e valido ou nao (Unicos caracteres permitidos sao: 'F' e 'M').
     * @param caractere do genero da roupa a ser cadastrada ou editada.
     * @return verdadeiro ou falso, se o que foi inserido e igual a 'F', ou 'M'.
     */
    public static boolean validaGenero(char genero) {
        if (genero == 'F' || genero == 'M' ) {
            return true;
        }else{
            return false;
        }
    }

    /**
     * Verifica se o tamanho da camisa inserido se encaixa no padrao pre determinado (PP, P, M, G, GG).
     * @param tamanho inserido no cadastro ou edicao de uma camisa
     * @return verdadeiro ou falso, baseado em se o que foi inserido e igual a uma destas opcoes: PP, P, M, G, GG
     */
    public static boolean validaTamanho(String tamanho) {
        System.out.println(tamanho);
        if (tamanho.length() <= 2 || 
            tamanho == "PP" || 
            tamanho == "P" || 
            tamanho == "M" || 
            tamanho == "G" || 
            tamanho == "GG" ) {

            return true;
        }else{
            return false;
        }
    }
}
