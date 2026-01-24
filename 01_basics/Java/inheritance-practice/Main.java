import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Person person1 = new Person("Kate", "Jones", 27, 1.6, 50.0);
        Person person2 = new Person("John", "Christopher", "Smith", 65, 1.75, 80.0);

        Car car = new Car("フェラーリ", "赤");
        person1.buy(car);

        Bicycle bicycle = new Bicycle("ビアンキ", "緑");
        person2.buy(bicycle);

        System.out.println("【車の情報】");
        // サブクラスのインスタンスはスーパークラスのメソッドも呼び出せる
        // スーパークラスのインスタンスは、サブクラスのメソッドを呼ぶことはできない（継承は一方的である）
        // サブクラスのインスタンスでメソッドを呼ぶと、まずはサブクラスのメソッドの中から探して、定義されていなければスーパークラスから呼び出す
        car.printData();
        System.out.println("-----------------");
        System.out.println("【車の所有者の情報】");

        // car.getOwner()の戻り値は、ownerフィールドの値、すなわちPersonクラスのインスタンスとなっている
        // よって、その後に続けてPersonクラスのインスタンスメソッドであるprintDataを呼び出すことが可能
        car.getOwner().printData();

        System.out.println("-----------------");
        System.out.print("走る距離を入力してください：");
        int carDistance = scanner.nextInt();
        car.run(carDistance);

        System.out.println("-----------------");
        System.out.print("給油する量を入力してください：");
        int litre = scanner.nextInt();
        car.charge(litre);

        System.out.println("=================");
        System.out.println("【自転車の情報】");
        bicycle.printData();
        System.out.println("-----------------");
        System.out.println("【自転車の所有者の情報】");
        bicycle.getOwner().printData();

        System.out.println("-----------------");
        System.out.print("走る距離を入力してください：");
        int bicycleDistance = scanner.nextInt();
        bicycle.run(bicycleDistance);
    }
}