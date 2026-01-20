class Main{
    public static void main(String[] args) {
        int minit = 1;
        int seconds = 60;
        String minitsUnit = "分";
        String secondsUnit = "秒";

        // int型とString型を+でつなぐと、文字列として連結することができる
        // 出力結果：1分は60秒です
        System.out.println(minit + minitsUnit + "は" + seconds + secondsUnit + "です");
    }
}