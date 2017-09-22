package lesson3;

import java.util.ArrayList;

public class Constructor {
    private String firstname;
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
    }


    public Constructor() {
        this("john", "doe");
    }

    public Constructor(String fname) {
        this(fname, "m");
    }

    public Constructor(String fname, String lname) {
        firstname = fname;
        lastname = lname;

    }

    public String getName() {
        return firstname + seperator + lastname;
    }

    public String getFriend(int index) {
        return friends.get(index);

    }
}
