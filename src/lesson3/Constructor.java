package lesson3;

import java.util.ArrayList;

public class Constructor {
    final String firstname; //접근제한자를 붙이지 않는 경우
    private String lastname;
    private String seperator;
    private String test = "123";
    private ArrayList<String> friends;

    {
        seperator = " "; //초기화블록
    }

    {
        friends = new ArrayList<>();
        friends.add("mike");
        friends.add("jane");
    } //초기화블록


    public Constructor() {
        this("john", "doe");
    }

    public Constructor(String fname) {
        this(fname, "m");
    }

    public Constructor(String fname, String lname) {
        this.firstname = fname; //전부 this.이 생략되어있음!
        this.lastname = lname;

    }

    //public Constructor(String firstname, String lname) {
    //    this.firstname = firstname; //this.이 없으면 인자와 구분이 안되니까
    //    this.lastname = lname;
//
    //}

    public String getName() {
        return firstname + seperator + lastname;
    }

    public String getFriend(int index) {
        return friends.get(index) + " is " + this.getName() + "'s friend.";

    }

}
