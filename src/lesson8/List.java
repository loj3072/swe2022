package lesson8;

import java.util.ArrayList;

public class List {
    static private ArrayList<String> names = new ArrayList<>();

    private String name;
    public List(String name) throws Exception {
        if(names.contains(name)) throw new Exception();
        this.name = name;
        names.add(this.name);
    }
    public void setName(String name) throws Exception{ //unique인 데다가 mutatable한 경우
        if(name == this.name) return; // 이름이 같으면 그냥 같은 이름 사용한다고 하니까 ok. 바꾼 이름이 다른 데에 존재하는가를 확인
        if(names.contains(name)) throw new Exception(); //이 안에 있으면 사용할 수 있는 이름
        names.remove(this.name); //기존 이름을 제거하고
        this.name = name; //새 이름으로 바꾸고
        names.add(this.name); //다른 애가 사용 못하게 추가.
    }
    //List도 setName도 코드의 중복이 있음 -> 묶어서 메소드로 뺀 다음 호출하는 식으로 변경
}
