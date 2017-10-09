public class Person implements Greeter {
    protected String firstName;
    protected String lastName;


    public Person(String firstName, String lastName) throws IllegalArgumentException {
        this.firstName = firstName;
        this.lastName = lastName;
        if(firstName.equals("") && lastName.equals("")){
            System.out.println("not valid");
        }
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String name) {
        this.lastName = name;
    }

    @Override
    public void sayHello() {
        System.out.println("Hello from " + firstName + lastName);
    }


}
