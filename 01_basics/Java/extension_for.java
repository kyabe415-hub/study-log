class Main{
    public static void main(String[] args) {
        String vehicles[] = {"自転車", "自動車", "飛行機", "セグウェイ", "ボート"};

        // 拡張for文で配列の要素を順番に出力する
        // 出力結果
        // ：自転車
        // 　自動車
        // 　飛行機
        // 　セグウェイ
        // 　ボート
        for (String vehicle: vehicles) {
            System.out.println(vehicle);
        }
    }
}