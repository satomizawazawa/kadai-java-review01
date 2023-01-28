
public class Review01 {

    public static void main(String[] args) {
        // 商品価格を入れるint型変数の宣言
        int withoutTax = 1450;
        // taxメソッドの呼び出し
        int taxAmount = tax(withoutTax);
        //税込価格を入れるint型変数の宣言、double型の消費税額をint型へ変換
        int withTax = withoutTax + taxAmount;

        System.out.println(withoutTax + "円の商品の税込価格は" + withTax + "円（消費税は" + taxAmount + "円）です。");

    }

//int型の商品価格を受け取り、消費税額を戻すtaxメソッド
    public static int tax(int withoutTax) {
        // double型変数taxAmountへ消費税額を代入
        double taxAmount = withoutTax * 0.1;
        return (int)taxAmount;
    }

}
