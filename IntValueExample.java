public class IntValueExample {

    public static void main(String[] args) {
        int decimalValue = 7;  // 10진수
        int binValue = 0b1000_0101;  // 2진수
        int octalValue = 077;  // 8진수
        int hexaValue = 0xfefe;  // 16진수
        System.out.println("10진수 7은:" + decimalValue);
        System.out.println("2진수 10000101:" + binValue);
        System.out.println("8진수 77은:" + octalValue);
        System.out.println("16진수 FEFE:" + hexaValue);
    }

}