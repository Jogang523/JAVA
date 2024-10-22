public class TextualTypeExample {

    public static void main(String[] args) {
        // char 타입 변수 c1에 문자 'A' 저장
        char c1 = 'A';
        // char 타입 변수 c2에 탭 문자 저장
        char c2 = '\t';
        // char 타입 변수 c3에 유니코드 문자 '가' 저장
        char c3 = '\uAC00';
        // String 타입 변수 s1에 유니코드 문자열 "현수" 저장
        String s1 = "\uD604\uC218";
        // String 타입 변수 s2에 문자열 "dream" 저장
        String s2 = "dream";
        System.out.printf("%c,%c,%c,%s,%s", c1, c2, c3, s1, s2);
    }

}