package principal;

import modelos.Banco;
import service.BrasilApiService;

import java.util.Scanner;

public class PrincipalBrasilApi {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BrasilApiService service = new BrasilApiService();

        while (true) {
            System.out.println("Digite o código do banco (ou 0 para sair):");
            String codigoBanco = scanner.nextLine();

            if (codigoBanco.equals("0")) {
                System.out.println("Encerrando aplicação...");
                break;
            }

            if (codigoBanco.isBlank()) {
                System.out.println("Código do banco não pode ser vazio.");
                continue; // volta para o início do loop
            }

            Banco banco = service.buscarBanco(codigoBanco);

            if (banco == null) {
                System.out.println("Banco inválido ou não encontrado.");
            } else {
                System.out.println(banco);
            }

            System.out.println();
        }


        scanner.close();
    }
}