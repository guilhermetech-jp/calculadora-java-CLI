public class Calculate { // Abre a Classe

    public static void main(String[] args) { // Abre o Main
        // 1. Pega os valores (Ajustei os índices para você passar: operacao num1 num2)
        String operacao = args[0];
        int x = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        if (operacao.equals("multiplicar")) {
            multiplicar(x, y);
        } else if (operacao.equals("dividir")) {
            dividir(x, y);
        } else if (operacao.equals("somar")) {
            somar(x, y);
        } else if (operacao.equals("subtrair")) {
            subtrair(x, y);
        } else {
            System.out.println("Erro: Operação '" + operacao + "' não reconhecida!");
        }




    } // FECHA o Main aqui

    static void multiplicar(int x, int y) { // Abre o sum
        System.out.println(x * y);
    } // Fecha o sum

    static void somar(int x, int y) {
        System.out.println(x + y);
    }

    static void dividir(int x, int y) { // Abre o minus
        System.out.println(x / y);
    }

    static void subtrair(int x, int y) {
        System.out.println(x - y);
    }

}


