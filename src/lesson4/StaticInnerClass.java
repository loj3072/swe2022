package lesson4;

import lesson4.sample.Imported;

public class StaticInnerClass {
    private static class Class1{ //정적중첩클래스 / static!!!! / private인 이유는 나만 알고 싶어서.
        static class Class1Class1{} //클래스 안에 클래스 안에 클래스... 계속 만들 수 있음
    }
    static class Class2{
        static class Class2Class2{}

    }
    static public void main(String[] arg){
        lesson4.StaticInnerClass.Class1 c = new StaticInnerClass.Class1(); //qualitified name
        System.out.println(Imported.getText());
    }
}
