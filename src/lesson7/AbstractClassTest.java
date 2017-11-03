package lesson7;

public class AbstractClassTest { //Ch4. p.171

    static abstract class Person{ //중첩클래스 static
        private String name; //private 선언: 자식클래스도 이 필드를 사용할 수 없다.

        //public Person(){this.name = "";} //b. 인자 없는 생성자가 있기 때문에 에러가 나지 않음.
        //public Person(String name){this.name = name;} //c. 클래스에서 생성자를 쓰지 않으면 자동으로 인자 없는 생성자를 만들어준다

        public final String getName(){return name;} //아무도 private name에 접근하지 못하니까 바깥에 보여주기 위한 메소드. final 을 붙인 이유: override를 못하게 하려고!!

        public abstract int getid(); // abstract의 가시성! / 반드시 abstract 클래서에서만 선언 가능
    }

    static class Student extends Person{ //person을 상속받은 서브셋 student
        private int id;
        public Student(String name, int id){ //a. extend를 통해 상속받은, 슈퍼셋으로부터 서브셋을 만들면 서브셋의 생성자는 반드시 생성자에서 슈퍼셋의 생성자를 호출해야 한다
        //    super(name); //a. super는 반드시 제일 먼저 호출해야 한다!! // b. 생성하지 않으면 자동으로 인자 없는 생성자를 호출해준다
            this.id = id;
        }
        @Override
        public int getid() {
            return 0;
        }
    }
    static public void main(String[] arg){
        Person p = new Person(){ //익명 클래스
            @Override
            public int getid() { //메소드가 하나 =>함수형 인터페이스?!
                return 0;
            }
        };
        //Person p2 = ()->0; //abstract 클래스는 람다가 될 수 없다.
    }
}
