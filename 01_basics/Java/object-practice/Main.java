class Main{
    public static void main(String[] args) {
        // オブジェクト指向は、プログラムの世界に現実世界の「もの」に似たオブジェクトを作り出し、
        // そのオブジェクトを中心にプログラムを組み立てる

        // インスタンス：オブジェクトの別名・実体
        // クラス：インスタンスの設計図 → クラスをもとにインスタンスが作られる

        // インスタンスは、「情報（インスタンスフィールド）」と「振る舞い（インスタンスメソッド）」を持つ

        // クラスからインスタンスを生成
        Person person1 = new Person("Suzuki");
        // インスタンスフィールドへのアクセス
        // person1.name = "Suzuki";

        // Personクラスのコンストラクタに引数で値を渡す
        Person person2 = new Person("Tanaka");

        // Personクラスで定義したインスタンスメソッドを呼び出す
        person1.hello();
        person2.hello();

        // インスタンス生成回数の出力
        System.out.println("合計" + Person.count + "人です");
    }
}