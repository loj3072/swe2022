package com.todolistLYJ.www;

public class TodoTheme { //enum을 적용할 수 있나보다?!
    String[] colors = {"blue", "red", "purple", "green", "sky"};
    String[] pictures = {"mountain", "desert", "island", "airplane", "city", "nothing"};
    String nowColor;
    String nowPicture;

    TodoTheme(){
        nowColor = colors[0];
        nowPicture = pictures[0];
    }

    public void changeColor(){}

    public void changePicture(){}

}
