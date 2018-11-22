package prova;

import java.util.ArrayList;
import java.util.Scanner;

public class Proof {

    public static void startProof() {

        String escolha = null;
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n####### ESCOLHA UM TESTE #######");
        System.out.println("1 - Subconjunto da máxima soma");
        System.out.println("2 - Sequência de caracteres");
        System.out.println("0 - Sair");
        System.out.print(": ");

        while (escolha == null) {
            escolha = scanner.nextLine();

            switch (escolha) {
                case "1":
                    proofSubsetMaxSum();
                    break;

                case "2":
                    proofCharSequence();
                    break;

                case "0":
                    System.out.println("Até logo!");
                    break;

                default:
                    escolha = null;
                    System.out.print(": ");
                    break;
            }
        }
    }

    private static void proofSubsetMaxSum() {
        ArrayList<Integer> setNumber = new ArrayList<>();
        Integer num = 1;
        Scanner scanner = new Scanner(System.in);
        String input = "";

        System.out.println("\nDigite um número inteiro e tecle enter para o próximo");
        System.out.println("número ou somente enter para calcular..");

        while (num != null) {
            System.out.print(": ");
            input = scanner.nextLine();

            if (input.equals("")) {
                SubsetSum subSet = new SubsetSum(setNumber);
                System.out.println("R: " + subSet.subsetMaxSum());
                num = null;
            }else {
                try {
                    setNumber.add(Integer.valueOf(input));
                }catch (NumberFormatException e) {
                    System.out.println("Formato digitado inválido!");
                }
            }
        }
        startProof();
    }

    private static void proofCharSequence() {
        String word = "a";
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nDigite uma palavra e tecle enter para localizar a ");
        System.out.println("maior sequência ou apenas enter para sair..");

        while (!word.equals("")) {
            System.out.print(": ");
            word = scanner.nextLine();

            if (word.length() >= 2) {
                CharSequence charSeq = new CharSequence(word);
                System.out.println("R: " + charSeq.getBiggerSequence());
                word = "";
            }
        }
        startProof();
    }
}
