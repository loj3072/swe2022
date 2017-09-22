package lesson3;

public class Constructor {
    private String firstname;
    private String lastname;

    public Constructor(){
        this("john", "doe");
    }
    public Constructor(String fname){
        this(fname, "m");
    }

    public Constructor(String fname, String lname){
        firstname = fname;
        lastname = lname;

    }
    public String getName(){
        return firstname + " " + lastname;
}
