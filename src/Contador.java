import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws ParametrosInvalidosException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 2 numeros inteiros");
        int num1 = 0;
        int num2 = 0;
        try{
            num1 = scanner.nextInt();
            num2 = scanner.nextInt();
            if (num1 >= num2 ){
                throw new ParametrosInvalidosException();
            }
        } catch (ParametrosInvalidosException e) {
            throw new ParametrosInvalidosException();

        }
        for (int i = num1; i <= num2 ; i++) {
            System.out.println("imprimindo o numero " + i);
        }
    }
}
