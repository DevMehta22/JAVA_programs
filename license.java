class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class License1 {
    public void applyForLicense(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Not eligible for license.");
        }
        System.out.println("Eligible for license");
    }
}

public class license{
    public static void main(String[] args) {
        License1 li = new License1();
        int applicant1 = 21;
        int applicant2 = 12; 

        try {
            li.applyForLicense(applicant1);
            li.applyForLicense(applicant2);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}


