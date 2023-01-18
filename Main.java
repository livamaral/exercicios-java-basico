import java.util.Scanner;
public class Main {
    public static void idade_user(){
        System.out.println("Digite a sua idade:");
    }
    public static void main(String[] args) {
        
            Integer idade = 0;
            Scanner idade_usuario = new Scanner(System.in);

        idade_user();
        idade = idade_usuario.nextInt();

        if (idade>=18)
        System.out.println("voce é maior de idade");
        else System.out.println("voce é de menor");

    }
}


