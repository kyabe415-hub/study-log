// サブクラスを定義する
// extendsを用いて「class サブクラス名 extends スーパークラス名」とする
class Bicycle extends Vehicle {
    Bicycle(String name, String color) {
        super(name, color);
    }

    public void run(int distance) {
        System.out.println(distance + "km走ります");
        this.distance += distance;
        System.out.println("走行距離：" + this.distance + "km");
    }
}
