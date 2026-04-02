import java.util.Scanner;

public class lista04 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.print("MENU DE ATIVIDADES\n");
        System.out.print("01 - Atividade 01\n");
        System.out.print("02 - Atividade 02\n");
        System.out.print("03 - Atividade 03\n");
        System.out.print("04 - Atividade 04\n");
        System.out.print("05 - Atividade 05\n");
        System.out.print("06 - Atividade 06\n");
        System.out.print("07 - Atividade 07\n");
        System.out.print("08 - Atividade 08\n");
        System.out.print("09 - Atividade 09\n");
        System.out.print("10 - Atividade 10\n");
        System.out.print("Selecione a atividade: ");
        int atividade = scanner.nextInt();

        switch(atividade) {
            
            //Atividade 01
            case 1:

                    System.out.print("Digite uma nota entre 0 e 10: ");
                double nota = scanner.nextDouble();

                do {
                    if (nota < 0 || nota > 10) {
                        System.out.print("Nota inválida. Digite uma nota entre 0 e 10: ");
                        nota = scanner.nextDouble();
                    }
                } while (nota < 0 || nota > 10); {
                    System.out.print("Nota valida, proximoooooo");
                }
            break;

            //Atividade 02
            case 2:
                
                    System.out.print("Digite o seu user: ");
                String user = scanner.next();
                System.out.print("Digite a sua senha: ");
                String senha = scanner.next();

                while (user.equals(senha)) {
                    System.out.print("A senha deve ser diferente do user. Digite a senha novamente: ");
                    senha = scanner.next();
                }
                    System.out.print("Senha válida, proximoooooo");
            break;

            //Atividade 03
            case 3:
                    System.out.print("Digite um nome: ");
                    String nome = scanner.next();
                    System.out.print("Digite sua idade: ");
                    int idade = scanner.nextInt();
                    System.out.print("Qual o seu salário?: ");
                    double salario = scanner.nextDouble();
                    System.out.print("Digite o sexo (M/F): ");
                    String sexo = scanner.next();
                    System.out.print("Digite o estado civil (S/C/V/D): ");
                    String estadoCivil = scanner.next();

                while (nome.length() < 3) {
                    System.out.print("O nome deve conter mais de 3 caracteres. Digite o nome novamente: ");
                    nome = scanner.next();
                }
                while (idade < 0 || idade > 150) {
                    System.out.print("A idade deve ser entre 0 e 150. Digite a idade novamente: ");
                    idade = scanner.nextInt();
                }
                while (salario <= 0) {
                    System.out.print("O salário deve ser maior que zero. Digite o salário novamente: ");
                    salario = scanner.nextDouble();
                }
                while (!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("F")) {
                    System.out.print("O sexo deve ser 'M' ou 'F'. Digite o sexo novamente: ");
                    sexo = scanner.next();
                }
                while (!estadoCivil.equalsIgnoreCase("S") && !estadoCivil.equalsIgnoreCase("C") && !estadoCivil.equalsIgnoreCase("V") && !estadoCivil.equalsIgnoreCase("D")) {
                    System.out.print("O estado civil deve ser 'S', 'C', 'V' ou 'D'. Digite o estado civil novamente: ");
                    estadoCivil = scanner.next();
                }
                System.out.print("Dados válidos, proximoooooo");
            break;

            //Atividade 04
            case 4:

                int paisA = 80000;
                int paisB = 200000;
                int anos = 0;

                while (paisA < paisB) {
                    paisA += paisA * 0.03; // Crescimento de 3% ao ano
                    paisB += paisB * 0.015; // Crescimento de 1.5% ao ano
                    anos++;
                }
                System.out.print("Serão necessários " + anos + " anos para que a população do país A ultrapasse ou iguale a população do país B.");
            break;

            //Atividade 05
            case 5:
            
                System.out.print("Digite a população do país A: ");
                int populacaoA = scanner.nextInt();
                System.out.print("Digite a taxa de crescimento anual do país A (em %): ");
                double taxaCrescimentoA = scanner.nextDouble();
                System.out.print("Digite a população do país B: ");
                int populacaoB = scanner.nextInt();
                System.out.print("Digite a taxa de crescimento anual do país B (em %): ");
                double taxaCrescimentoB = scanner.nextDouble();
                int anosB = 0;

                while (populacaoA < populacaoB) {
                    populacaoA += populacaoA * taxaCrescimentoA / 100;
                    populacaoB += populacaoB * taxaCrescimentoB / 100;
                    anosB++;
                }
                    System.out.print("Serão necessários " + anosB + " anos para que a população do país A ultrapasse ou iguale a população do país B.");
            break;

            //Atividade 06
            case 6:
            
                for (int i = 1; i <= 20; i++) {
                    System.out.print(i + " ");
                }
                break;

            //atividade 07
            case 7:

                    System.out.print ("Digite 5 numeros: ");
                int num1 = scanner.nextInt();
                int num2 = scanner.nextInt();
                int num3 = scanner.nextInt();
                int num4 = scanner.nextInt();
                int num5 = scanner.nextInt();

                int maior = Math.max(num1, Math.max(num2, Math.max(num3, Math.max(num4, num5))));
                    System.out.print("O maior número é: " + maior);
                    
            break;

            //Atividade 08
            case 8:

                    System.out.print("Digit 5 numeros: ");
                int numero1 = scanner.nextInt();
                int numero2 = scanner.nextInt();
                int numero3 = scanner.nextInt();
                int numero4 = scanner.nextInt();
                int numero5 = scanner.nextInt();

                int soma = numero1 + numero2 + numero3 + numero4 + numero5;
                    System.out.print("A soma dos números é: " + soma);
                double media = soma / 5.0;
                    System.out.print("A média dos números é: " + media);
            break;
            

            //Atividade 09
            case 9:
                
                for (int i = 1; i <= 50; i++) {
                    if (i % 2 == 0) {
                        System.out.print(i + " ");
                    }
                }
                break;

            //Atividade 10
            case 10:
                    System.out.print("Digite dois numeros inteiros: ");
                int numeroA = scanner.nextInt();
                int numeroB = scanner.nextInt();
                int intervalo = Math.abs(numeroA - numeroB);
                    System.out.print("O intervalo entre " + numeroA + " e " + numeroB + " é: " + intervalo);
            break;
        }
        scanner.close();
        
    }
}