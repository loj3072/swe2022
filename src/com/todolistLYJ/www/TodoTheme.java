package com.todolistLYJ.www;

import java.io.Serializable;

public class TodoTheme implements Serializable { //enum을 적용할 수 있나보다?!
    public enum Colors {BLUE, RED, PURPLE, GREEN, SKY}
    public enum Images {MOUNTAIN, DESERT, ISLAND, AIRPLANE, CITY, NOTHING}

    TodoTheme(){
        Colors nowColor = Colors.BLUE;
        Images nowImage = Images.MOUNTAIN;
    }

    public void changeColor(){}

    public void changeImage(){}


}
