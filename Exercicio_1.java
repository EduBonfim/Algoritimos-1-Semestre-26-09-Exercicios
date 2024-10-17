import java.util.Scanner;
public class Exercicio_1 {
    public static void main (String[] args){

        Scanner dados = new Scanner(System.in);

        int resp;
        String nome;
        int idade;
        resp= 1;

        while (resp == 1) {
            System.out.println("Digite o seu nome");
             nome= dados.next();   
            System.out.println("Digite sua idade"); 
             idade= dados.nextInt();

            if(idade >= 18){
                System.out.println("Seu nome é: "+nome);
            }
                System.out.println("Deseja continuar? (1/0): ");
                resp = dados.nextInt();
        }
        dados.close();
    }
}