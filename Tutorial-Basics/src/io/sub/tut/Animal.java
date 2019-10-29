package io.sub.tut;

public class Animal {
    private String name;
    private String cry;
    private Rectangle home;





    public Animal (String name, String cry, Rectangle home){
        this.name = name;
        this.cry = cry;
        this.home = home;
    }

    public Rectangle getHome(){
      return this.home;
    }

    public String getName(){
        return this.name;
    }

    public String getCry(){
        return this.cry;
    }
}
