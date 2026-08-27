package org.gabriel.pessoal.lista01;

public class PlacaDeCarro {
    /**
     Validador de Placa de Carro
     Valide se uma String corresponde a um dos dois formatos de placa brasileira:
     - Formato antigo: AAA-9999 (3 letras, hífen, 4 dígitos)
     - Formato Mercosul: AAA9A99 (3 letras, 1 dígito, 1 letra, 2 dígitos)
     Teste com pelo menos 5 placas diferentes (algumas válidas, outras não) declaradas em um array de Strings, e imprima o resultado da validação de cada uma.
     Pesquise: métodos da classe Character que dizem se um char é letra ou dígito.
     Você vai precisar percorrer a String caractere por caractere — cuidado com o tamanho fixo esperado em cada posição.
     **/
    public void validadorPlacaCarro(String placa){
        char[] arrPlaca = new char[8];
        char[] arrMercosul = {'A','A','A','9','A','9','9'};
        char[] arrAntigo   = {'A','A','A','-','9','9','9','9'};
        boolean isValid = true;
        int i = 0;

        if (placa.length() < 7){
            // se não tiver o nº min de caracteres
            isValid = false;
        }
        try {
            // arrPlaca = placa.toCharArray();
            placa.getChars(0, placa.length(), arrPlaca,0);
            // caso tenha mais caracteres que o permitido
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Tamanho de caracteres excedido! Tente novamente");
        } catch (Exception e) {
            System.out.println("Unexpected error! Try Again");
        }
        if (isValid){
            if (arrPlaca[arrPlaca.length-1] == '\u0000') {
                // Formato Mercosul
                for (i = 0; i < arrMercosul.length - 1; i++) {
                    if (Character.isAlphabetic(arrPlaca[i]) &&
                        Character.isAlphabetic(arrMercosul[i]) ||
                        Character.isDigit(arrPlaca[i]) &&
                        Character.isDigit(arrMercosul[i])
                    ){
                        continue;
                    } else {
                        isValid = false;
                        break;
                    }
                }
            } else {
                if (arrPlaca[3] != '-') {
                    // se não possuir '-' já desconsideramos
                    isValid = false;
                } else {
                    for (i = 0; i < arrPlaca.length; i++) {
                        if (i == 3) {
                            continue;
                        } else if (Character.isAlphabetic(arrPlaca[i]) &&
                                    Character.isAlphabetic(arrAntigo[i]) ||
                                    Character.isDigit(arrPlaca[i]) &&
                                    Character.isDigit(arrAntigo[i])
                        ){
                            continue;
                        } else {
                            isValid = false;
                        }
                    }
                }
            }
        }
        if (isValid){
            System.out.println("Formato Válido!");
        } else {
            System.out.println("Formato Inválido!");
        }
    }
}
