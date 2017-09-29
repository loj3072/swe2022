package lesson4.network;

import java.util.ArrayList;

public class Network {
    public class Member{ //Member: Network에 소속되어 있으며 자기 고유의 이름을 가지고 친구들을 가지고 있는 클래스,
        final private String name; // 이름을 한번 정하면 못바꿈
        private ArrayList<Member> friends;

        public Member(String name){ //가시성이 없으므로 이 클래스 내에서만 생성가능
            this.name = name;
            friends = new ArrayList<>();
        }
        public void leave(){ //개인이 네트워크를 떠나는 것은 타당./ 외부에서 개입해서 제거. 자기를 감싸고 있는 클래스의 인스턴스에 접근
            //Network.this.members.remove(this); //*잘못된 코드. 자기 클래스의 속성이 아닌데 어떻게 접근이 가능해??(은닉, 캡슐화가 깨짐)
            unenroll(this); //(outer 는 명시적으로 못 씀) 캡슐화된 메소드를 호출하는 것은 타당.
        }
        public boolean belongsTo(Network n){
            return Network.this == n; // 부모클래스의 인스턴스를 생략하지 않는 경우도 있음
        }
    }
    //Network----------------------------------------------------------
    private ArrayList<Member> members = new ArrayList<>();

    public Member enroll(String name){ // enroll의 this는 new Network..(감싸고 있는 클래스의 인스턴스)인 상황에서 new Member를 하면 outer가 됨
        // this == new Network() == net1 == newMember.outer (newMember Fred의 outer는 net1)
        Member newMember = this.new Member(name); //this. : Member의 outer임을 명시적으로 표현. 생략가능
        members.add(newMember);
        return newMember;
    }
    public void unenroll(Member member){ //자기 속성에서 내부를 제거
        members.remove(member);
    }
}
