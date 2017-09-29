package lesson4.network;

import java.util.ArrayList;

public class Network2 {
    static public class Member{ // Static Nested Class
        private Network2 outer;
        private String name;
        private ArrayList<Member> friends = new ArrayList<>();

        public Member(Network2 outer, String name){ //outer class instance 필요
            this.outer = outer;
            this.name = name;
        }
        public boolean belongsTo(Network2 n){
            return outer == n;
        }
        public void leave(){
            outer.unenroll(this); //명시적인 outer 필요
        }
    }
    //network2--------------------------------------
    private ArrayList<Member> members = new ArrayList<>();

    public Member enroll(String name){
        Member newMember = new Member(this, name); //outer 필요
        members.add(newMember);
        return newMember;
    }
    public void unenroll(Member member){
        members.remove(member);
    }

}
