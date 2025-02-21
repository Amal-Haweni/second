class Calculatrice {
    public double addition(double a, double b) {
        return a + b;
    }
    public double soustraction(double a, double b) {
        return a - b;
    }
    public double multiplication(double a, double b) {
        return a * b;
    }
    public double division(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Erreur : Division par zéro !");
        }
        return a / b;
    }
}
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculatrice calculatrice = new Calculatrice();

        System.out.println("Bienvenue dans la calculatrice !");
        
        while (true) {
            System.out.println("\nChoisissez une opération : +, -, *, / (ou tapez 'exit' pour quitter)");
            String operation = scanner.next();

            if (operation.equalsIgnoreCase("exit")) {
                System.out.println("Merci d'avoir utilise la calculatrice !");
                break;
            }

            System.out.print("Entrez le premier nombre : ");
            double num1 = scanner.nextDouble();

            System.out.print("Entrez le deuxieme nombre : ");
            double num2 = scanner.nextDouble();

            try {
                double resultat = 0;
                switch (operation) {
                    case "+":
                        resultat = calculatrice.addition(num1, num2);
                        break;
                    case "-":
                        resultat = calculatrice.soustraction(num1, num2);
                        break;
                    case "*":
                        resultat = calculatrice.multiplication(num1, num2);
                        break;
                    case "/":
                        resultat = calculatrice.division(num1, num2);
                        break;
                    default:
                        System.out.println("Operation non valide !");
                        continue;
                }
                System.out.println("Resultat : " + resultat);
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }

        scanner.close();
    }
}
