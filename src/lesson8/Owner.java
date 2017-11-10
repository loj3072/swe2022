package lesson8;
//반드시 필요한 게 아니라면 가시성을 낮추는 것이 좋음! 필요하면 공개한다. (공개와 상속은 다름. 공개를 최소화할수록 좋음)
//클래스도, 변수도(final). 클래스나 메소드에 final은 반대. 상속이나 오버라이드를 못하니까. >>점진적인 확장구현을 위해 // 디커플링(택배기사-interface(protocol), 사이트-interface와 내 번호 implement)
class Owner {
    private final int ownerValue;
    private final Base ownerBase;

    Owner(int ownerValue, Base ownerBase) {
        this.ownerValue = ownerValue;
        this.ownerBase = ownerBase;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //얕은 복사
        Owner result =  new Owner(this.ownerValue, this.ownerBase);
        //깊은 복사
        result = new Owner(this.ownerValue, this.ownerBase.clone()); //클론을 호출했더니 클론을 호출.  compositive pattern: 상위계층의 프로토콜이 하위구성요소에도 적용. 단일책임원칙
        return result;
    }

    public Base getBase() {
        return ownerBase;
    }
}
