package c0915;

public class ControlState {
    static public void main(String[] arg){
        boolean condition = true;
        System.out.println("point1");
        test1:{
            int a = 3;
            if(a>2) break test1;
            System.out.println("point2");
        }
        System.out.println("point3");
        switch();
    }
}
