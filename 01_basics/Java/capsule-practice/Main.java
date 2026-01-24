class Main{
    public static void main(String[] args) {
        Capsule capsule = new Capsule("red", 300);

        // publicだからエラーにならない
        System.out.println(capsule.color);

        // privateだからエラーになる
        // System.out.println(capsule.price);

        // priceの値を取得できる
        System.out.println("price[" + capsule.getPrice() + "]");

        // priceの値を変更できる
        capsule.setPrice(500);
        System.out.println("price[" + capsule.getPrice() + "]");

        // 基本的には、フィールドは「private」に、メソッドは「public」に
        // という2点に沿っておけば、問題ない
    }
}