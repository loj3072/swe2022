package lesson7;

import java.util.Random;

public class LocalClassTest {
    static public void main(String[] arg){
        IntSequence seq = randomInts(3, 5);
        System.out.println(seq.next());
        System.out.println(seq.next());
        System.out.println(seq.next());
    }
    private static Random generator = new Random();
    public static IntSequence randomInts(int low, int high){
        return () -> low + generator.nextInt(high - low + 1); // 이 클래스 블록(11~16) 내에서 generator, high, low는 지역변수도 아니고 인자도 아님. 그런데 사용 => 자유변수(free value)
             // 메소드를 호출할 때마다 클래스가 만들어짐. 클래스가 만들어지는 시점에서 자유변수들을 캡처. 캡처되는 변수는 암묵적으로 final 상수로 처리.(변경금지!!)
        }
        //return new RandomSequence();// <- 이때 한 번 쓰고 다시는 안 쓰니까 이름 안 써도 되지 않을까
    }
}
