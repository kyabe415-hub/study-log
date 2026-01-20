class Main{
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5};
        String animals[] = {"いぬ", "ねこ", "トラ", "うさぎ", "たぬき"};

        System.out.println("");
        System.out.println("配列の要素をインデックス番号で指定して出力する");
        System.out.println("-------------------");
        // 配列のインデックス番号は、0から
        // 出力結果：1
        System.out.println(numbers[0]);
        // 出力結果：3
        System.out.println(numbers[2]);

        System.out.println("");
        System.out.println("for文で配列の要素を順番に出力する");
        System.out.println("-------------------");
        // for文で配列の要素を順番に出力する
        // 出力結果
        // ：いぬ
        // 　ねこ
        // 　トラ
        // 　うさぎ
        // 　たぬき
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
        }
    }
}