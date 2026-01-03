package principal;

import modelos.Banco;
import service.BrasilApiService;

import java.util.Scanner;

public class PrincipalBrasilApi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BrasilApiService service = new BrasilApiService();

        System.out.println("Boa tarde, qual o codigo do banco.");
        String codigoBanco = scanner.nextLine();

        if (codigoBanco.isBlank()) {
            System.out.println("Código do banco não pode ser vazio.");
            return;
        }

        Banco banco = service.buscarBanco(codigoBanco);

        if (banco == null) {
            System.out.println("Banco inválido ou não encontrado.");
        } else {
            System.out.println(banco);
        }

        scanner.close();
    }
}
