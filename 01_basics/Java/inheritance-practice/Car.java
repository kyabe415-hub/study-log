// サブクラスを定義する
// extendsを用いて「class サブクラス名 extends スーパークラス名」とする
class Car extends Vehicle {
    // スーパークラスにない独自のフィールドやメソッドを追加できる
    private int fuel = 50;

    // コンストラクタ
    Car(String name, String color) {
        // サブクラスでコンストラクを定義するときは、1つの決まりがある
        // 「コンストラクタの先頭でスーパークラスのコンストラクタを呼び出さなければならない」という決まり
        // super()を用いてスーパークラスのコンストラクタを呼び出す
        // superに引数を渡して呼び出す
        super(name, color);

    }

    public int getFuel() {
        return this.fuel;
    }

    // スーパークラスから継承したメソッドと同名のメソッドをサブクラスに定義すると、スーパークラスのメソッドの内容を上書きすることができる
    // これを「オーバーライド」という
    // サブクラスのインスタンスでメソッドを呼ぶと、まずはサブクラスのメソッドの中から探して、定義されていなければスーパークラスから呼び出す
    // この仕様から、実質上書きされたようになる
    public void printData() {
        // オーバーライドしたメソッド
        // スーパークラスのメソッドと重複があるから、superを用いる
        // 「super.メソッド名()」とすることでサブクラスのインスタンスメソッドから、スーパークラスのインスタンスメソッドを呼び出すことができる
        super.printData();
        System.out.println("ガソリン量：" + this.fuel + "L");
    }

    public void run(int distance) {
        System.out.println(distance + "km走ります");
        if (distance <= this.fuel) {
            this.distance += distance;
            this.fuel -= distance;
        } else {
            System.out.println("ガソリンが足りません");
        }
        System.out.println("走行距離：" + this.distance + "km");
        System.out.println("ガソリン量：" + this.fuel + "L");
    }

    public void charge(int litre) {
        System.out.println(litre + "L給油します");
        if (litre <= 0) {
            System.out.println("給油できません");
        } else if (litre + this.fuel >= 100) {
            System.out.println("満タンまで給油します");
            this.fuel = 100;
        } else {
            this.fuel += litre;
        }
        System.out.println("ガソリン量：" + this.fuel + "L");
    }
}