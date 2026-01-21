// Javaでは、他人が作ったクラスを利用することができ、そのようなクラスを外部ライブラリと呼ぶ
// 外部ライブラリを利用するためには、importを用いる
// class定義より上で、importをする（「java.lang」は、Mathクラスの場所を表している）
import java.lang.Math;

class Main{
    public static void main(String[] args) {
        // 外部から読み込んだMathクラス
        int max = Math.max(5, 8);
        System.out.println("最大値は" + max + "です");

        // 小数点以下を四捨五入するメソッド
        double round = Math.round(8.5);
        System.out.println(round);
    }

    // Mathクラスはよく利用されるため、importしなくても自動で組み込まれる
    // Mathクラス以外にも、「java.lang.クラス名」となる外部ライブラリはすべて自動で読み込まれる
}