// 以下のコードはコンパイルエラー
// 変数を初期化しなくともコンパイルエラーにならない場合は、
// 変数がクラスフィールド、またはインスタンスフィールドのとき
// 上記の場合は明示的に初期化をしなくとも規定の値が初期値として入る
// つまりローカル変数の場合は明示的に初期化しないとコンパイルエラー

class Main{
    public static void main(String[] args) {
        // 変数の定義時に値を代入しなかった場合、デフォルトの値が変数に代入される
        // データ型によって、入る値が決まっている
        String str;
        int num;
        double dbl;
        boolean bool;

        // String   :null
        // int      :0
        // double   :0.0
        // boolean  :false
        if (str == null) {
            System.out.println("String : null");
        }

        if (num == 0) {
            System.out.println("int : 0");
        }

        if (dbl == 0.0) {
            System.out.println("double : 0.0");
        }

        if (bool == false) {
            System.out.println("boolean : false");
        }

        // System.out.println(str);
    }
}