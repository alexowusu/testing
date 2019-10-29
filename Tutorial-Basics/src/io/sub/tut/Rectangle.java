package io.sub.tut;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }


    //    public void setWidth(int w){
//        this.width = w;
//    }
//
//    public int getWidth(){
//        return this.width;
//    }
//
//    public void setHeight(int h){
//        this.height = h;
//    }
//
//    public int getHeight(){
//        return this.height;
//    }
//
    public int getArea(){
        return this.height * this.width;
    }
}
