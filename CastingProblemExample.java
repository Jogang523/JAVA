public class CastingProblemExample {

    public static void main(String[] args) {
        int a = 1234567890;
        float b = a;  // 자동형변환
        System.out.println(b);

        double c = 3.6;
        int d = (int)c;
        System.out.println(d);

        int e = 1522;
        byte f = (byte)e;  // overflow
        System.out.println(f);
    }

}
