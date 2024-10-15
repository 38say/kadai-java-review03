
public class Review01 {

    public static void main(String[] args) {
        int num1 =1700;
        int num2 = 10;
        int result;
        result = sumMethod2(num1,num2);
        System.out.println ( num1 +"円の税込み価格は"+( num1 +result ) +"円（消費税は"+ result + "円)です。");




    }
    public static int sumMethod2(int num1 , int num2) {
        int num = num1 / num2;
                 return num;
    }

}
