package io.sub.tut;

public class Main {

    public static void main(String[] args) {


//        rec.setWidth(4);
//        rec.setHeight(5);

    //    System.out.println(rec.getArea());

       // System.out.println(rec.getWidth()*rec.getHeight());
        //System.out.println(2*(rec.getWidth()+rec.getHeight()));


        Rectangle rec = new Rectangle(4, 5);
        Animal dog = new Animal("dog", "bark", rec);
        System.out.println("Name "+dog.getName() + " " + "\ncry "+ dog.getCry()+ "\nHome Size "+rec.getArea());


        Rectangle catrec = new Rectangle(4,9) ;

        Animal cat = new Animal("Cat","meow", catrec);
        System.out.println("Name "+ cat.getName() + "\nCry "+cat.getName() +"Home size "+ catrec.getArea() );
    }


}
