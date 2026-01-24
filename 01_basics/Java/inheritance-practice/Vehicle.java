// 抽象メソッドを1つでも持つクラスは、「抽象クラス」と呼ばれ、クラス名の前にabstractをつける必要がある
// 抽象メソッドはインスタンスを生成できない
// 未完成のメソッドを持つということは、未完成のクラスであるということである
// そのような未完成のクラスからはインスタンスを生成できないような仕組みになっている
abstract class Vehicle {
    // あるクラスの内容を他のクラスが引き継ぐことができる機能を「継承」という
    // さらに独自のフィールドやメソッドを追加してカスタマイズも可能
    // 継承されるクラスを「スーパークラス」継承した新しいクラスを「サブクラス」と呼ぶ

    // CarクラスとBicycleクラスの重複部分を共通化

    // メソッドと同様にサブクラスといえど、スーパークラスのprivateフィールドには直接アクセスできない
    // 「protected」を用いることで、クラス内とサブクラスからのみアクセスを許すフィールドを作れる
    private String name;
    private String color;
    protected int distance = 0;

    // インスタンスフィールドにクラス型の変数を定義することで、フィールドにインスタンを持つことが可能
    private Person owner;

    Vehicle(String name, String color) {
        this.name = name;
        this.color = color;
    }



    public String getName() {
        return this.name;
    }
    public String getColor() {
        return this.color;
    }
    public int getDistance() {
        return this.distance;
    }

    // 戻り値の型がクラス型になる
    public Person getOwner() {
        return this.owner;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setColor(String color) {
        this.color = color;
    }

    // 仮引数の型がクラス型になる
    public void setOwner(Person person) {
        this.owner = person;
    }

    public void printData() {
        System.out.println("名前：" + this.name);
        System.out.println("色：" + this.color);
        System.out.println("走行距離：" + this.distance + "km");
    }

    // 乗り物はすべて「走行する」機能を持つ
    // つまり、プログラム上でもVehicleクラスを継承するすべてのクラスはrunメソッドを持っているべきである
    // しかし、乗り物ごとに走行方法が違うため、Vehicleクラスでは処理内容を定めることができない
    // そのため、処理が未定のメソッドを定義する必要がある
    // メソッドにabstractをつけることで、「抽象メソッド」を定義できる
    // 抽象メソッドは中身の処理を書かない
    // サブクラスが抽象メソッドをオーバーライドしていない場合、エラーになる
    // そうすることで、サブクラスがそのメソッドをオーバーライドし、処理内容を定義することを強制できる
    public abstract void run(int distance);
}