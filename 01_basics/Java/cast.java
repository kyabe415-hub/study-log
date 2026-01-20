class Main{
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 2;

        // int型同士の計算では、出力結果もint型になる
        // 出力結果：2
        System.out.println(num1 / num2);

        // 片方でもdouble型にキャストすると、出力結果はdouble型になる
        // 出力結果：2.5
        System.out.println((double)num1 / num2);
    }
}