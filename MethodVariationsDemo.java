class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }
}

public class MethodVariationsDemo {

    // Method to pass an integer by value
    public static void passByValue(int num) {
        num = 42; 
    }

    // Method to pass an object (reference) by reference
    public static void passByReference(Person person) {
        person.name = "Dev";
    }

    // Method to return an integer value
    public static int returnByValue() {
        return 91;
    }

    // Method to return an object
    public static Person returnObject() {
        return new Person("Lol");
    }

    public static void main(String[] args) {
        // Pass by value
        int value = 59;
        passByValue(value);
        System.out.println("Value after passByValue: " + value); 

        // Pass by reference
        Person person = new Person("Chaplin");
        passByReference(person);
        System.out.println("Name after passByReference: " + person.name);

        // Return by value
        int returnedValue = returnByValue();
        System.out.println("Returned value: " + returnedValue); 

        // Return an object
        Person returnedPerson = returnObject();
        System.out.println("Returned object's name: " + returnedPerson.name); 
    }
}

