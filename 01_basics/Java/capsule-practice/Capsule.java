class Capsule{
    // カプセル化とは、他の人に使って欲しい機能は公開し、クラスの外で使って欲しくない機能を隠すこと
    // そうすることで、他の人はどの機能を使えばいいかがわかりやすく、また、安全にクラスを利用することができる
    // 具体的には、フィールドとメソッドのアクセスを制限すること

    // クラスの外部からアクセスできるようにするには「public」
    public String color;

    // アクセスできないようにするには「private」
    // privateでも、クラス内からはアクセス可能
    private int price;

    Capsule(String color, int price) {
        this.color = color;
        this.price = price;
    }

    // privateなフィールドの値を取得するために、フィールドの値を返すだけのメソッドを定義する
    // これを「ゲッター」と呼ぶ
    // ゲッターは、「getフィールド名」のようにするのが一般的
    public int getPrice() {
        return this.price;
    }

    // privateなフィールドは値をクラスの外から変更することもできなくなる
    // だから、フィールドの値を変更するためのメソッドを定義する
    // そのようなメソッドを特に「セッター」呼ぶ
    // セッターは「setフィールド名」のようにするのが一般的
    public void setPrice(int price) {
        this.price = price;
    }
}