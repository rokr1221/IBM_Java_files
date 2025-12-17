public class Human {
    
    static int count = 0;
    Human(){
        count++;
    }

    public static void noOfHumans(){
        System.out.println("No. of Human : " + count);
    }

}

