package se.lexicon;


import java.time.LocalDate;

class Car { //template ,Blueprint
    // Fields or Attributes or Members
     private String id;
     private String brand;   // String has default value "null" always
     private String model;
     private String color;
     private Integer year;
    private double mileage; // String has default value "0.0" always

    // Methods
   public void start(){
    System.out.println("The car is Starting");
   }
   public String carInfo(){           // carInfo method to call from main method to get all info in one line
    return "Car: brand:" + brand + " Model: " + model + " color:" + color;
   }
   public void drive(double distance){         //Create method for calculate the mileage  and add =distance calculation.
       mileage += distance;
          }
   public double getMileage(){   // create method for get the mileage in the main.java
       return mileage;
          }
          // if we will make the encapsulation then we need to make set the get value here of our variables.
    public void setBrand(String brand){                       //set brand and return method
       if (brand== null) throw new IllegalArgumentException("Brand was null");
       this.brand= brand;
    }
    public String getBrand(){
       return brand;
    }
    public void setModel(String model){                     //set Model and return method
       if (model == null) throw new IllegalArgumentException ("Model Was null");
       this.model=model;
    }
    public String getModel()
    {
        return model;
    }
    public void setColor(String color){                  //set Color and return method
       if(color == null) this.color="blue";
       else this.color=color;
    }
    public String getColor(){
       return color;
    }
    public void setYear(Integer year){                    //set Year and return method
       if(year == null) this.year = LocalDate.now().getYear();
    }
    public Integer getYear(){
       return year;
    }
}

