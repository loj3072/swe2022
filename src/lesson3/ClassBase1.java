package lesson3;

public class ClassBase1 {
    static public void main(String[] arg){
        Constructor c = new Constructor();
        System.out.println(c.getName());
        Constructor c1 = new Constructor("a");
        System.out.println(c1.getName());
        System.out.println(c1.getFriend( 0));
        Constructor c2 = new Constructor("A", "b");
        System.out.println(c2.getName());

        final String a;
        a = "abc";
        //a = 'bb'; a가 이미 final 할당이라 새로 할당 못함

        NoConst no = new NoConst(); //기본생성자. 생성자를 따로 만들지 않았는데도 클래스 생성 가능.
    }
}
