package lesson3;


public class ClassBase00 {
    static public void main(String[] arg){
        Parent parent = new Child(); //대체가능성

        System.out.println( parent.action());

        parent.mutator( "abc");
        System.out.println(parent.getName());)

        parent.mutator( "abc");
        System.out.println(parent.getName());)

        String a = "abcd";
        System.out.println( a.length());

        a = null;


    }
}
