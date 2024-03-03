import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");

        int numero = scanner.nextInt();

        verific(numero);

        scanner.close();
    }

    public static void verific(int num){
        if(num % 2 == 0){
            System.out.println("Par");
        }else{
            System.out.println("Impar");
        }
    }

}