class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    private double height;
    private double weight;

    Person(String firstName, String lastName, int age, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    Person(String firstName, String middleName, String lastName, int age, double height, double weight) {
        this(firstName, lastName, age, height, weight);
        this.middleName = middleName;
    }

    public String fullName() {
        if (this.middleName == null) {
            return this.firstName + " " + this.lastName;
        } else {
            return this.firstName + " " + this.middleName + " " + this.lastName;
        }
    }

    public void printData() {
        System.out.println("名前は" + this.fullName() + "です");
        System.out.println("年齢は" + this.age + "歳です");
        System.out.println("身長は" + this.height + "mです");
        System.out.println("体重は" + this.weight + "kgです");
        System.out.println("BMIは" + Math.round(this.bmi()) + "です");
    }

    public double bmi() {
        return this.weight / this.height / this.height;
    }

    // 引数が異なる同名のメソッドを定義（オーバーロード）
    // 引数に受け取ったインスタンスのセッターを用いて所有者を変更
    //public void buy(Car car) {
    //    car.setOwner(this);
    //}
    // 引数が異なる同名のメソッドを定義（オーバーロード）
    // 引数に受け取ったインスタンスのセッターを用いて所有者を変更
    //public void buy(Bicycle bicycle) {
    //    bicycle.setOwner(this);
    //}

    // 上記のbuyメソッドはほとんど同じコード
    // Vehicleクラスのサブクラスが増えるたびに、毎回引数の型が違う同名のメソッドを定義しなければならない
    // これを解決する方法はがある
    // 引数としてVehicle型のインスタンスを受け取るようにする
    // そうすることで、Carクラス・Bicycleクラスのインスタンス両方を受け取ることができる
    public void buy(Vehicle vehicle) {
        vehicle.setOwner(this);
    }
    // Carクラスは、Vehicleクラスを継承している
    // であるから、CarクラスのインスタンスはCar型の前にVehicle型でもある
    // この関係にあるとき、サブクラスのインスタンスを、スーパークラスのクラス型変数に代入することが可能になる
    // このような特徴を「多態性」という
    // Vehicle vehicle1 = new Car("フェラーリ", "赤");
}