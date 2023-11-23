package br.com.infnet;



import java.util.logging.Logger;

public class App {

    private static final Logger LOGGER = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        int soma = somarNumeros(num1, num2);
        int subtracao = subtrairNumeros(num1, num2);

        LOGGER.info("A soma de " + num1 + " e " + num2 + " é: " + soma);
        LOGGER.info("A subtração de " + num1 + " por " + num2 + " é: " + subtracao);
    }

    private static int somarNumeros(int a, int b) {
        return a + b;
    }

    private static int subtrairNumeros(int a, int b) {
        return a - b;
    }
}

