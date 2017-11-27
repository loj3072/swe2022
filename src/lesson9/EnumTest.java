package lesson9;

public class EnumTest {
    public static class Tshirt{
        private final Size size; //final 선언!

        public enum Size {SMALL, MEDIUM, LARGE}

        public Tshirt(Size $size){ //인자에는 final을 못 붙인다 // enum을 쓰면 클래스의 인스턴스밖에 안들어옴
            final Size size = $size; //black list - 불안정
            this.size = size; // white list - 안정
        }
        /*public boolean isFit(Person target){
            final int base = target.height / 2
            switch(this.size){
                case SMALL: return base< 50; //enum을 쓰면 switch문에 직접 사용 가능!
                case MEDIUM: return base < 70;
            }
            //switch(this.size.ordinal()){
                //case 0: return target.height/2 < 50;

            target.height;
            */
        }
    }

