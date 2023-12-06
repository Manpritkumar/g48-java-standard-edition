 package se.lexicon;



 public class Main {
    public static void main(String[] args)
    {
           //Instance of car
      /* Car volvoObj = new Car();
        volvoObj.brand= "Volvo" ;
        volvoObj.model="V60" ;
        volvoObj.color="blue";
       // System.out.println(volvoObj.brand+" " + volvoObj.model+" " + volvoObj.color );
        System.out.println(volvoObj.carinfo());
        System.out.println("---------------");



        Car Vwobj = new Car();
        Vwobj.brand= "Voxwagun";
        Vwobj.color="white" ;
        Vwobj.year= 2013 ;
        Vwobj.model= "VW" ;

        System.out.println(Vwobj.carinfo());

        Vwobj.drive(600);

        System.out.println("Mileage= " + Vwobj.getMileage()); */

        Car vwObj = new Car();

        vwObj.setBrand ("Volkswagen");
        vwObj.setColor (null);
        vwObj.setYear (null);
        vwObj.setModel("VM");

        System.out.println("Color: " + vwObj.getColor());
        System.out.println("Brand: " + vwObj.getBrand());
        System.out.println("Year: " + vwObj.getYear());
        System.out.println("Model: " + vwObj.getModel());
        System.out.println("vwObj.getMileage = " + vwObj.getMileage());

    }
}