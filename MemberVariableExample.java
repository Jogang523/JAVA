public class MemberVariableExample {

    int a;
    static int b;

    public static void main(String[] args) {
        System.out.println(b);
//        System.out.println(a);
        MemberVariableExample obj = new MemberVariableExample();
        System.out.println(obj.a);
    }
}
