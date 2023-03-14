package objects;

public class Car {

    String model;
    String year;
    String color;
    String mileage;

    String prise;

    public void drive(){
        System.out.println(model + "is driving");

    }
    public void stop(){
        System.out.println( model+ "is stopping");
    }


     public void playMusic(){
         System.out.println( model +" is playing music" );

    }

    public static void main(String[] args) {
         Car car1 = new Car();

         car1.model = "Lexus";
         car1.year = "2023";
         car1.color = " white";
         car1.mileage = "50000" ;

         Car car2 = new Car();
         car2.model ="Toyota";
         car2.year="2015";
         car2.color="black";
         car2.mileage="2345";


         car1.drive();
         car2.drive();

         car1.stop();
         car2.stop();

         car1.playMusic();
         car2.playMusic();

    }
}