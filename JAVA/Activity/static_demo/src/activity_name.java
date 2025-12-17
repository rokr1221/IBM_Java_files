public class activity_name  {
    public static void main(String[] args)  {
        Boy amit = new Boy();
        Boy rahul = new Boy();
        
        Girl neha = new Girl();
        Girl riya = new Girl();

        Robot terminator = new Robot();

        amit.identity();
        rahul.identity();

        neha.identity();
        riya.identity();

        terminator.identity();

        Human.noOfHumans();

    }
}
