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
    }
}
