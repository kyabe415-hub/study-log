class Main{
    public static void main(String[] args) {
        hello();
        hello("kazuma");
    }

    // MainClassの中で、メソッドを作ることができる
    // voidは、戻り値を返さないメソッド
    public static void hello() {
        System.out.println("こんにちは！");
    }

    // ()の中に仮引数を宣言すると、呼び出し元から引数を受け取ることができる
    // 同名のメソッドは原則として定義できない（呼び出す時にどちらのメソッドかわからなくなるから）
    // しかし、引数の型や個数が異なるものであれば、別のメソッドとして定義することができる（オーバーロード）
    public static void hello(String name) {
        System.out.println(name + "さん。こんにちは！");
    }
}