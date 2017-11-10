package lesson8;

class Base { //package class
    int baseValue;

    public Base(int baseValue){
        this.baseValue = baseValue;
    }

    @Override
    protected Base clone() throws CloneNotSupportedException {//instance의 유일성을 보장하지 않으면 예외로.
        Base clone = (Base) super.clone(); //clone: 새로운 객체(복사본)를 리턴.한다는 약속(프로토콜) Object 규모에서 반환값은 공변을 지킨다. 공변: obj의 서브타입이 와도 공변을 지킨다
        return new Base(this.baseValue);
    }

    @Override
    public boolean equals(Object obj) { //메소드 인자는 공변을 인식하지 않음
        if(obj == null) return false; //**중요1    빼먹지 (null은 언어 차원에서 가장 먼저 배제해야 하기 때문에 첫 번째 줄에 쓴다) //쉴드 패턴
        if(!(obj instanceof Base)) return false;//**중요2    말기 (이제 Base의 instance라는 걸 알게 됨)
        if(obj.hashCode() == this.hashCode()) return true; //(메소드를 두 번 호출해야 함. Base 클래스를 확인. 위에서 먼저 배제하는 편이 더 가벼움- 메소드 면으로나 추상층 면으로나)
        return this.baseValue == ((Base)obj).baseValue; //obj를 형변환 하고서,
        // 쉴드 패턴으로 다 걸러냈기 때문에 마지막 로직에서는 더 이상 예외처리 등 경우의 수를 나누지 않음 << 유지 보수 편리

        //if가 세 번 이상 중첩되면 사람이 감당할 수 없다(optional if , mendatory else)
    }

    @Override
    public String toString() {
        return "base:" + this.hashCode() + ":value=" + this.baseValue ;
    }
}
