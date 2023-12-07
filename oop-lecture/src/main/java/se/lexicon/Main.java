 package se.lexicon;


 public class Main {
    public static void main(String[] args)
    {
           //Instance of car = object
       /* Car volvo = new Car ();
        volvo.brand ="Volvo64";
        volvo.model= "V50";



        System.out.println("volvo.brand = " + volvo.brand );
        System.out.println("volvo.model = " + volvo.model );
        System.out.println("volvo.carInfo() = " + volvo.carInfo()); //this we can create the getinfor method to get the detail in one line of car.
        
      
      
        
        
        //Another brand car we creat
        
        Car maruti = new Car();
        maruti.model="x60";
        maruti.color="white";
        maruti.drive(250);

        

       System.out.println("maruti.brand = " + maruti.brand);
        System.out.println("maruti.model = " + maruti.model);
        System.out.println("maruti.color = " + maruti.color);

        System.out.println("maruti.carInfo() = " + maruti.carInfo());
        System.out.println("maruti.getMileage() = " + maruti.getMileage());
        */

        Car maruti = new Car();
        maruti.setYear(2017);
        maruti.setModel("VM17");
        maruti.setColor(null);
        maruti.setBrand("Nissan");


        System.out.println(maruti.getYear());
        System.out.println(maruti.getModel());
        System.out.println(maruti.getBrand());
        System.out.println(maruti.getColor());
        System.out.println(maruti.getMileage());

        Person erik =new Person();
        erik.setAge(25);
        erik.setFirstName("Erik");
        erik.setLastName("Svensson");
        erik.setSsn("1989");


        System.out.println("erik.getFirstName() = " + erik.getFirstName());
        System.out.println("erik.getLastName() = " + erik.getLastName());
        System.out.println("erik.getSsn() = " + erik.getSsn());
    //------------------------------------------------------------------------
        System.out.println("erik.getPersonInfo() = " + erik.getPersonInfo());



       
    }
}