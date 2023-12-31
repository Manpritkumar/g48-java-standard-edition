package se.lexicon;

public class Person { //template ,Blueprint
    // Fields or Attributes or Members

    private String firstName;
    private String lastName;
    private String ssn;
    private int age;
    private boolean status;


    // Constructor
    // purpose special builder method
  //
    public Person ( String firstName , String lastName, String ssn,int age, boolean status) {
        this(firstName, lastName, ssn, age);
        this.status=status;

    }
    public Person ( String firstName , String lastName, String ssn,int age) {
        this(firstName, lastName, ssn);
        setAge(age);

    }
    public Person ( String firstName , String lastName, String ssn) {
        setFirstName(firstName);
        setLastName(lastName);
        setSsn(ssn);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if(firstName == null) throw new IllegalArgumentException("First name was null");
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(lastName == null) throw new IllegalArgumentException("Last name was null");
        this.lastName = lastName;
    }

    public String getSsn() {

        return ssn;
    }

    public void setSsn(String ssn) {
        if(ssn==null) throw new IllegalArgumentException("ssn was null");

        this.ssn = ssn;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isStatus(String yes) {
        return status;
    }

    public String getPersonInfo(){
        return "Person{Name: " + firstName + " " + lastName + " , SSN: " +ssn + " , Age: "
+ age + "}";}


}