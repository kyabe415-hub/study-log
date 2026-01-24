class Person{
    // Personクラス（インスタンスの設計図）

    // クラスフィールドの定義/初期化
    public static int count = 0;    // インスタンスの生成回数

    // インスタンスフィールドを定義
    // クラスに定義するが、実際には各インスタンスにコピーされる
    public String firstName;
    public String lastName;

    // コンストラクタ：newを使ってインスタンスを生成した後に、自動で呼び出される特別なメソッド
    // コンストラクタを定義
    // 定義方法
    // 1.コンストラクタ名はクラス名と同じにする
    // 2.戻り値を書いてはいけない（voidも書かない）
    // 「new クラス名()」の()には引数を渡すことができ、コンストラクタに受け渡される
    Person(String firstName) {
        // インスタンスフィールドへの値のセットを楽にする
        // クラスフィールドへのアクセス
        Person.count++;
        this.firstName = firstName;
    }

    // コンストラクタのオーバーロード
    // インスタンスフィールドのlastNameを持たない人はインスタンス生成の際、エラー発生
    // 2つコンストラクタを定義すれば、自動で適切な方を自動で呼び出してくれる
    Person(String firstName, String lastName) {
        Person.count++;
        // もう1つのコンストラクタと中身が重複している
        // 修正などが大変になるよくないコード
        // this.firstName  = firstName;
        // this()とすると、コンストラクタから他のコンストラクタを呼び出すことができる
        // ()に引数を渡すことができる
        // コンストラクタの先頭でしか呼び出せない
        this(firstName, lastName);
        this.lastName   = lastName;
    }

    // インスタンスメソッドを定義
    // クラスに定義するが、実際には各インスタンスに属する
    public void hello() {
        // thisはクラス内のメソッドの定義の中でのみ使用できる
        // thisを用いることでメソッド内でインスタンスフィールドにアクセスできる
        // メソッドが呼ばれた際に、thisはそのメソッドを呼び出しているインスタンスに置き換えられる
        System.out.println("こんにちは、私は" + this.name + "です");
    }

    // クラスメソッドを定義
    // クラスメソッドにはstaticをつける
    // クラスメソッドはインスタンスを生成しない状態でも呼び出すことができる
    public static void printCount() {
        // クラスフィールドcountを用いる
        Sytem.out.println("合計" + Person.count + "人です");
    }
}