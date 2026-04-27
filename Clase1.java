import java.util.Scanner;
public class Clase1 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese el numero de digitos:");
            int n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                 if (i % 2 == 0) {
                    for (int j = 0; j < n; j++) {
                        System.out.print("+");
                    }
                    } else {
                                            for (int j = 0; j < n; j++) {
                        System.out.print("-");
                    }
             
                    }
            }
            System.out.println("Este es el cambio a realizar:");

scanner.close();
        }
}