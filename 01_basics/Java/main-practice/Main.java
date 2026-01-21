class Main{
    public static void main(String[] args) {
        // Mainクラスにある、mainメソッド（主に実行ファイル）から、Logicクラスのメソッドを呼び出している
        // Mainクラスにメソッドが多く存在することを解決する
        System.out.println(Logic.add(3, 5));
        System.out.println(Logic.concatenationString("Good", "morning"));

        // Javaは、ファイルではなくクラスを実行する
        // 実行時にmainメソッドが呼ばれるが、正確にはmainメソッドを持つクラスしか実行できない
        // また、クラス名に関わらず、実行時にはmainメソッドが呼ばれる
        // （Mainクラスだからmainメソッドが呼ばれる、というわけではない）
    }
}