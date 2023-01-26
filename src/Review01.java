
public class Review01 {

    public static void main(String[] args) {
        // 商品価格を入れるint型変数の宣言
        int withoutTax = 1500;
        // 消費税額を入れるdouble型変数の宣言
        double taxAmount;
        // taxメソッドの呼び出し
        taxAmount = tax(withoutTax);
        //税込価格を入れるint型変数の宣言、double型の消費税額をint型へ変換
        int withTax = withoutTax + (int) taxAmount;

        System.out.println(withoutTax + "円の商品の税込価格は" + withTax + "円（消費税は" + (int) taxAmount + "円）です。");

    }

//int型の商品価格を受け取り、消費税額を戻すtaxメソッド
    public static double tax(int withoutTax) {
        // double型変数taxAmountへ消費税額を代入
        double taxAmount = withoutTax * 0.1;
        return taxAmount;
    }

}
