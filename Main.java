public class Main {
    public static void main(String[] args) {
        final int one = 'A'/'A';

        final String ten = ".........."; // 10 
        
        int num = (ten.length() * ten.length());

        for (int i=one; i<=(num); i++) {
            System.out.println(i);
        }  
    }
}
