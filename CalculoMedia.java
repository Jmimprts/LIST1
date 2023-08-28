/*Imprima a frase “Ola, Mundo!”
public class Main {
    public static void main(String[] args) {
        System.out.print("Olá Mundo :)");
    }
}

\*

/*Declare duas variáveis do tipo int e realize a soma entre elas. Imprima o resultado.
public class Main {
    public static void main(String[] args) {
        int numero1 = 23;
        int numero2 = 14;

        int resultado = numero1 + numero2;

        System.out.println("A soma é:" + resultado);
    }
}

 */

/*Declare uma variável do tipo double e atribua a ela o valor 5.67. Multiplique essa variável por 3 e imprima o resultado

public class Main
    public static void main(String[]args) {

    Double valor = 5.67;
    Double resultado = valor * 3;

        System.out.println("O resultado dessa operação é:"+resultado);
    }
}

 */
/*
Crie uma variável do tipo char e atribua a ela uma letra. Em seguida, imprima essa letra na tela.

public class Main {
    public static void main(String[] args) {

        char letra = 'J';

        System.out.println("Imprima a letra na tela:" + letra);

    }
}
 */
/*Declare uma variável do tipo boolean e atribua a ela o valor true. Em seguida, imprima o valor da variável
public class Main {
    public static void main(String[]args){
        boolean valorVerdadeiro = true;

        System.out.println("Imprima o valor da variavel t boolean:" + valorVerdadeiro);
    }
}
 */
/*Crie uma variável do tipo String e atribua a ela o seu nome. Concatene essa variável com a frase " é um aluno dedicado." e imprima o resultado.
public class Main {
    public static void main(String[] args) {
        String seuNome = "João Marcos";
        String frase = (seuNome + " É um aluno dedicado");

        System.out.println(frase);
    }
}
 */

/*Questão 7
public class Main {
    public static void main(String[] args) {
        boolean temCarteira = false;
        temCarteira = true;

        System.out.println("Voce tem carteira?" + temCarteira);
    }
}
 */

/*Questão 8
public class Main {
    public static void main(String[] args) {
        String atribuição = "Olá" + " Mundo ";

        System.out.println(atribuição);
    }
}
 */
 /*Questão 9 Obs"Queria conseguir botar um /n mais ainda não sei usar aqui para separar os resultados sem precisar criar
         outros prints"
public class Main {
    public static void main(String[] args) {
        int num1 = 14;
        int num2 = 5;

        int soma = num1 + num2;
        int subtracao = num1 - num2;
        int multiplicacao = num1 * num2;
        int divisao = num1 / num2;

        System.out.println(" A soma é = " +  soma + " A Subtração é = " +  subtracao + " A Multiplicação é = " +  multiplicacao + " A divisão é = " +  divisao);
    }
}
  */
/*Questão 10
public class Main {
    public static void main(String[] args) {
        Double valorSaldo = 500.50;
        Double valorDepositorealizado =  300.25;
        Double valordoSaque = 150.75;
        Double resultado = valorSaldo + valorDepositorealizado - valordoSaque;

        System.out.println("Saldo da conta pos saque = " + resultado);

    }
}
 */
/*Questão 11
public class Main {
    public static void main(String[] args) {
        String fruta1 = "Morango e ";
        String fruta2 = "Uva";
        String result = "Eu gosto de " + fruta1 + fruta2;
        System.out.println(result);
    }
}

 */
/*Questão 12
public class Main {
    public static void main(String[] args) {
        int idadeAnos = 19;
        int idadeMeses = idadeAnos * 12;

        System.out.println("Minha idade em Meses é " + idadeMeses);
    }
}


 */

import javax.swing.*;

/*
Quest 13
public class Main {
    public static void main(String[] args) {
        int numero = -2;
        if (numero >= 0 & numero <= 10) {
            System.out.println("O número está entre 0 e 10.");
        } else {
            System.out.println("O número não está entre 0 e 10.");
        }
    }
}
*/
/*Quest 14
public class Main {
    public static void main(String[] args) {
        int numero = 7;

        if (numero % 2 == 0) {
            System.out.println("O nmero é par");
        } else {
            System.out.println("O numero não é par");
        }
    }
}
 */
/* Quest 15
public class Main {
    public static void main(String[] args) {
        int numero = 17;
        if (numero % 1 != 0) {
            System.out.println("O número e ímpar");
        } else {
            System.out.println("O número não e ímpar");
        }
    }
}
 */
/*Quest 16
public class Main {
    public static void main(String[] args) {
        int numero = 17;
        if (numero % 3 == 0) {
            System.out.println("O número e múltiplo de 3");
        } else {
            System.out.println("O número não e múltiplo de 3");
        }
    }
}
 */
/*Quest 17
public class Main {
    public static void main(String[] args) {
        int numero = 10;
        if (numero % 5 == 0) {
            System.out.println("O número e múltiplo de 5");
        } else {
            System.out.println("O número não e múltiplo de 5");
        }
    }
}
 */

/*
Quest 18
public class Main {
    public static void main(String[] args) {
        int numero = 28;
        if (numero % 7 == 0) {
            System.out.println("O número e múltiplo de 7");
        } else {
            System.out.println("O número não e múltiplo de 7");
        }
    }
}
 */

/*//Questao 19
import java.util.Scanner;

public class CalculoMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        System.out.println("Digite a quarta nota: ");
        double nota4 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("A média das notas é: " + media);

        scanner.close();
    }
}
 */
/* Quest 20
import java.util.Scanner;

public class CalculoMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe quanto você ganha por hora: ");
        double salarioPorHora = scanner.nextDouble();

        System.out.println("Informe o número de horas trabalhadas no mês: ");
        int horasTrabalhadas = scanner.nextInt();

        double salarioBruto = salarioPorHora * horasTrabalhadas;
        double descontoIR = 0.10 * salarioBruto;
        double descontoINSS = 0.08 * salarioBruto;
        double descontoSindicato = 0.06 * salarioBruto;

        double salarioLiquido = salarioBruto - descontoIR - descontoINSS - descontoSindicato;

        System.out.println("Salário Bruto: R$" + salarioBruto);
        System.out.println("Desconto de IR (11%): R$" + descontoIR);
        System.out.println("Desconto de INSS (8%): R$" + descontoINSS);
        System.out.println("Desconto de Sindicato (5%): R$" + descontoSindicato);
        System.out.println("Salário Líquido: R$" + salarioLiquido);

        scanner.close();
    }
}
 */

