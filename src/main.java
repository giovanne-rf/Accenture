import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void main(String[]args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<String> resultado = new ArrayList<>();
        String valor;
        Tradutor traduzir = new Tradutor();
        String resp;
        String delete = "";

        System.out.print("Digite:  ");
        do {
            System.out.println();
            valor = entrada.next();

            if (valor.equalsIgnoreCase("#")){ // solução para exclusão de registro errado.
                int size = resultado.size();
                resultado.remove(size-1);
            } else {
                resultado.add(traduzir.chamar(valor));
            }

            for (int x = 0; x < resultado.size(); x++) {
                System.out.print(resultado.get(x));
            }
        }
        while (!resultado.isEmpty());
        entrada.close();
    }
}
