    import java.util.Scanner;
       public class class1 {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("ingrese numero de caracteres:");
                int n = scanner.nextInt();
                for (int i = 0; i < n; i++) {
                    if (i % 2 == 0) {
                        System.out.print("+");
                    } else {
                        System.out.print("-");
                    }
                }
                scanner.close();
            }
        }
