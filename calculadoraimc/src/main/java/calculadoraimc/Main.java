package calculadoraimc;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // declara as variaveis e as mensagens que serão exibidas no programa
        String genero;
        float peso, altura;
        float imc;
        String abaixodoPeso = "Seu IMC é considerado abaixo do peso.";
        String baixoRisco = "Seu IMC é considerado de risco baixo.";
        String ideal = "Seu IMC é considerado ideal";
        String riscoModerado = "Seu IMC é considerado de risco moderado.";
        String riscoElevado = "Seu IMC é considerado de risco elevado.";

        // introduz 
        System.out.println("Calcule o seu IMC!");

        // inicia o scanner, pergunta o genero do usuário e armazena a resposta na variavel genero após deixar tudo em minusculo
        Scanner input = new Scanner(System.in);
        System.out.println("Você é homem ou mulher?");
        genero = input.nextLine();
        genero = genero.toLowerCase();

        // switch-case dependendo do genero do usuário
        switch(genero)
        {
            // se a resposta do usuario for homem:
            case "homem":
                // pergunta e armazena o peso e a altura do usuario
                System.out.println("Insira o seu peso (em kg): ");
                peso = input.nextFloat();
                System.out.println("Insira a sua altura (em m): ");
                altura = input.nextFloat();
                input.close();

                // realiza o calculo usando a fórmula do imc
                imc = peso/(altura*altura);

                // realiza a verificação condicional e exibe a mensagem armazenada na variavel no inicio do programa
                if (imc >= 17.9 && imc <= 18.9)
                {
                    System.out.println(baixoRisco);
                }
                else if (imc >= 19.0 && imc <= 24.9)
                {
                    System.out.println(ideal);
                }
                else if (imc >= 25.0 && imc <= 27.7)
                {
                    System.out.println(riscoModerado);
                }
                else if (imc < 17.9)
                {
                    System.out.println(abaixodoPeso);
                }
                else {
                    System.out.println(riscoElevado);
                }
                break;

            // se a resposta do usuario for mulher:
            case "mulher":

                // pergunta e armazena o peso e a altura do usuario
                System.out.println("Insira o seu peso (em kg): ");
                peso = input.nextFloat();
                System.out.println("Insira a sua altura (em m): ");
                altura = input.nextFloat();
                input.close();

                // realiza o calculo usando a fórmula do imc
                imc = peso/(altura*altura);

                // realiza a verificação condicional e exibe a mensagem armazenada na variavel no inicio do programa
                if (imc >= 15.0 && imc <= 17.9)
                {
                    System.out.println(baixoRisco);
                }
                else if (imc >= 18.0 && imc <= 24.4)
                {
                    System.out.println(ideal);
                }
                else if (imc >= 24.5 && imc <= 27.2)
                {
                    System.out.println(riscoModerado);
                }
                else if (imc < 15.0)
                {
                    System.out.println(abaixodoPeso);
                }
                else {
                    System.out.println(riscoElevado);
                }
                break;

            
            // caso a resposta do usuário seja algo que não está nos "cases"
            default:
                System.out.println("Gênero inválido.");
                break;


        }

    }
}