public class activity_8 {

    public static void main(String[] args) {

        try {
            checkAge(16);
        } catch (CustomException e) {
            System.out.println("Exception caught : " + e.getMessage());
        }

    }
    
    static void checkAge(int age) throws CustomException {
        if (age < 18){
            throw new CustomException("Age must be 18 or above.");
        }
    }
}

