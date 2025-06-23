
     import java.util.Scanner;
     class myCalculator{ 
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        double x = sc.nextDouble();
        System.out.println("enter second number");
        double y = sc.nextDouble();
        System.out.println("enter an operator");
        char operator = sc.next().charAt(0);
        double result = 0;
        switch (operator) {
            case '+':
                result = x + y;
                break;
            case '-':
                result = x - y;
                break;
            case '*':
                result = x * y;
                break;
            case '/':
                if (y != 0)
                    result = x / y;
                else {
                    System.out.println("cannot divide by zero");
                    return;
                }
                break;

            default:
                System.out.println("invalid operator");
                break;
        }
        System.out.println("result :" + result);

    }

}
