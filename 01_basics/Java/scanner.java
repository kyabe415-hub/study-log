// Scannerライブラリを用いることで、コンソールから入力した値を取得することができる
// Scannerライブラリを読み込む
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        // Scannerを初期化してscannerという変数に代入
        // Scannerは初期化したものを代入した変数を用いてメソッドを呼び出す
        Scanner scanner = new Scanner(System.in);

        // System.out.print()は、改行をせずに値を出力する命令
        // scanner.next()でコンソールに入力された文字列を受け取る
        System.out.print("your name：");
        String name = scanner.next();

        // 一旦処理を中断し、値が入力されたら次の処理に進む
        System.out.println("your name is " + name + ".");

        // scanner.nextInt()で、整数を受け取る
        // 少数を入力すると、以下のエラーが吐き出される
        // Exception in thread "main" java.util.InputMismatchException
        //	at java.base/java.util.Scanner.throwFor(Scanner.java:939)
        //	at java.base/java.util.Scanner.next(Scanner.java:1594)
        //	at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
        //	at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
        //	at Main.main(scanner.java:20)
        // 文字列を入力すると、以下のエラーが吐き出される
        // Exception in thread "main" java.util.InputMismatchException
        //	at java.base/java.util.Scanner.throwFor(Scanner.java:939)
        //	at java.base/java.util.Scanner.next(Scanner.java:1594)
        //	at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
        //	at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
        //	at Main.main(scanner.java:28)
        System.out.print("int：");
        int age = scanner.nextInt();
        System.out.println(age);

        // scanner.nextDouble()で、少数を受け取る
        // 整数を入力すると、少数になって出力される
        // 例：8 → 8.0
        // 文字列を入力すると、以下のエラーが吐き出される
        // Exception in thread "main" java.util.InputMismatchException
        //	at java.base/java.util.Scanner.throwFor(Scanner.java:939)
        //	at java.base/java.util.Scanner.next(Scanner.java:1594)
        //	at java.base/java.util.Scanner.nextDouble(Scanner.java:2564)
        //	at Main.main(scanner.java:35)
        System.out.print("double：");
        double height = scanner.nextDouble();
        System.out.println(height);
    }
}