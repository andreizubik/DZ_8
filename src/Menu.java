import java.util.Scanner;

class MenuCalcul implements  Result {
    //   int[] arr = new int[2];
    int count=-1;
    Integer [] arr = new Integer[2];
    Divide divide = new Divide();
    Multiply multiply = new Multiply();
    Substract substract = new Substract();
    Sum sum = new Sum();
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    Scanner scanner1 = new Scanner(System.in);

    public void calculator() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Введите математическую операцию");
        String c = scanner.nextLine();
        while (!c.equals("+") && !c.equals("/") && !c.equals("-") && !c.equals("+") && !c.equals("*")) {
            System.out.println("Данной операции не существует");
            c = scanner.nextLine();
        }
        int a = 0;
        do {
            System.out.println("Введите первое число");
            while (!scanner1.hasNextInt()) {
                System.out.println("Неверно!");
                scanner1.next();
            }
            a = scanner1.nextInt();
        } while (a <= 0);

        int b = 0;
        do {
            System.out.println("Введите второе число");
            while (!scanner1.hasNextInt()) {
                System.out.println("Неверно!");
                scanner1.next();
            }
            b = scanner1.nextInt();
        } while (b <= 0);
        switch (c) {
            case ("+"):
                System.out.println("Результат: ");
                System.out.println(sum.action(a, b));
                historyCreate(sum.action(a, b));
                break;
            case ("-"):
                System.out.println("Результат: ");
                System.out.println(substract.action(a, b));
                historyCreate(substract.action(a, b));
                break;
            case ("*"):
                System.out.println("Результат: ");
                System.out.println(multiply.action(a, b));
                historyCreate(multiply.action(a, b));
                break;
            case ("/"):
                System.out.println("Результат: ");
                System.out.println(divide.action(a, b));
                historyCreate(divide.action(a, b));
                break;
        }

    }

    public void calculatorMenu() {
        System.out.println("Нажмите 1, чтобы начать вычисление. Нажмите 0, чтобы выйти");
        int d = scanner.nextInt();
        while (d == 1) {
            calculator();
            System.out.println("Нажмите 1, чтобы начать вычисление. Нажмите 0, чтобы выйти");
            d = scanner.nextInt();
        }
        if (d == 0) {
        }
    }

    @Override
    public void historyCreate(int a) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                // if (arr[i] == 0) {
                arr[i] = a;
                break;
            } else if (arr[i] != null ) {
                for (int j = 0; j <= i; j++) {
                    if (arr[i] != a){
                        //   if (arr[i] != arr[j]) {
                        arr[j] = a;
                        break;
                    }
                }
            }
        }
    }
    @Override
    public void ptintArray() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+", ");
        }
    }
}
