import java.util.Scanner;
public class ImprimirIdade {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int idade,acumuladoridades=0;
        int cont;

        for(cont = 0; cont <5; cont++){
            System.out.println("Digite a sua idade");
            idade = entrada.nextInt();
            acumuladoridades += idade;
            
        }
        System.out.println("A soma das idades é "+acumuladoridades);
        entrada.close();
    }
    
}
