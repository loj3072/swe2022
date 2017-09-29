package lesson4;

import lesson4.network.Network;
import lesson4.network.Network2;

public class NetworkTest {
    static public void main(String[] arg){
        Network net1 = new Network();
        Network net2 = new Network();
        //Network.Member member1 = new Network.Member("fred");
        Network.Member fre = net1.enroll("fred"); //enroll의 this는 net1 / fre의 outer는 net1. 속성과 메소드를 내부에서 호출 가능. fre는 net1을 알고있음


        System.out.println(fre.belongsTo(net1));
        //Network.Member jane = new Network.Member("jane"); // outer를 지정하지 않고는 new 만들 수 없음
        Network.Member jane = net1.new Member("jane");
        Network.Member tom = net2.new Member("tom");

        Network2 n1 = new Network2();
        Network2 n2 = new Network2();
        Network2.Member a = n1.enroll("a");
        a.leave();
        Network2.Member b = new Network2.Member(n1, "b");
        Network2.Member c = new Network2.Member(n2, "c");
    }
}
