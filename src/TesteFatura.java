

/*  Crie uma classe em Java chamada fatura. //EMCAPSULAMENTO : FATURA E UMA PARTIÇÃO DO QUE PODE
                                                               SER FUTURAMENTE, COMO UM ELEMENTO
                                                               DE "BANCO" POR EXEMPLO, POR ISSO
                                                               COMEÇAMOS A DIVIDIR O SERVIÇO DE 
                                                               CADA CLASSE.

    A classe deve conter 2 variáveis: // ABSTRAÇÃO : O QUE IMPORTA NA DEFINIÇÃO DE UMA FATURA.
        >a quantidade de faturas (int). 
        >o preço a ser pago (double). 
        //ATRIBUTOS SÃO O QUE CARACTERIZA UMA "FATURA" 

    A classe deve ter um construtor. //CONSTRUCT PODE INSTACIAR OS ATRIBUTOS NO MOMENTO QUE 
                                       A CLASSE É CRIADA ATRAVES DOS ARGUMENTOS.
    
    Um método get e set para cada variável de instância. //EMCAPSULAMENTO : CAMADA DE SEGURANÇA
                                                         esconder os detalhes internos   de uma 
                                                         classe  e   expor   apenas   o que   é 
                                                         necessário.                                                
    Se o valor não for positivo, ele deve ser 
    configurado como 0. Se o preço por item não for positivo, ele deve ser configurado como 0.0. 

    forneça um método chamado Calcular() que calcula o valor //EMCAPSULAMENTO : O CODIGO PODERÁ
                                                               SER USADO EM OUTRO LUGAR,  ASSIM
                                                               DIMINUINDO   AS LINHAS DE CODIGO.
    da fatura e depois retorna o valor como um double.

    Escreva um aplicativo de teste chamado TesteFatura (em outro arquivo) que demonstra 
    as capacidades da classe Fatura.  */

import java.util.Scanner;

public class TesteFatura {public static void main(String[] args){
 
    
    Scanner receba= new Scanner(System.in);
// MODO 1
System.out.println("modo 1\n");

        System.out.println("digite os valor1\n\n");
            double x1 = receba.nextDouble(); // ao digitar no console um float se usa ","

        System.out.println("digite os valor2\n\n");
            double x2 = receba.nextDouble(); // ao digitar no console um float se usa ","

            // instanciando valores pelo costrutor da classe
            Fatura conta = new Fatura(x1, x2);

            // teste getters
            System.out.println(conta.getQuant()+" "+conta.getPreco()); 

            // func calcular
            System.out.println(" calculo > \n"); 
            System.out.println("\n"+conta.Calcular());
            System.out.println("-----------------");
            
// MODO 2
System.out.println("modo 2\n");

            //teste setters
        conta.setQuant(5.3);
        conta.setPreco(2.3);
            System.out.println(conta.getQuant()+" "+conta.getPreco());

            // func calcular
            System.out.println(" calculo > \n"); 
            System.out.println("\n"+conta.Calcular());
            System.out.println("-----------------");

// MODO 3
System.out.println("modo 3\n");

            //teste setters com valores menores que 0
            System.out.println("valores menores que 0");
        conta.setQuant(-10);
        conta.setPreco(-10);
            System.out.println(conta.getQuant()+" "+conta.getPreco());

            // func calcular
            System.out.println(" calculo > \n"); 
            System.out.println("\n"+conta.Calcular());
            System.out.println("-----------------");

/*
 
O IMPORTANTE E ENTENDER OS ELEMENTOS QUE VOCÊ ESTÁ UTILIZANDO NO SEU CODIGO
E O POR QUE DELE ESTÁ SENDO USADO EM TAL MOMENTO
 
*/


















}
}
