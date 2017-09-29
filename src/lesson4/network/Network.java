package lesson4.network;

import java.util.ArrayList;

public class Network {
    public class Member{
        final private String name; // 이름을 한번 정하면 못바꿈
        private ArrayList<Member> friends;

        Member(String name){ //가시성이 없으므로 이 클래스 내에서만 생성가능
            this.name = name;
            friends = new ArrayList<>();
        }
        public void leave(){ //외부에서 개입해서 제거. 자기를 감싸고 있는 클래스의 인스턴스에 접근
            members.remove(this); //자기 클래스의 속성이 아닌데 어떻게 접근이 가능하지??
        }
    }
    //Network----------------------------------------------------------
    private ArrayList<Member> members = new ArrayList<>();

    public Member enroll(String name){ // enroll의 this는 new Network..(감싸고 있는 클래스의 인스턴스)인 상황에서 new Member를 하면 outer가 됨
        // this == new Network() == net1 == newMember.outer (newMember Fred의 outer는 net1)
        Member newMember = new Member(name);
        members.add(newMember);
        return newMember;
    }
    public void remove(Member member){ //자기 속성에서 내부를 제거
        members.remove(member);
    }
}
