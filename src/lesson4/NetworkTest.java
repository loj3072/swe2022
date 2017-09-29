package lesson4;

import lesson4.network.Network;

public class NetworkTest {
    static public void main(String[] arg){
        Network net1 = new Network();
        //Network.Member member1 = new Network.Member("fred");
        Network.Member fre = net1.enroll("fred"); //enroll의 this는 net1 / fre의 outer는 net1. 속성과 메소드를 내부에서 호출 가능. fre는 net1을 알고있음
    }
}
