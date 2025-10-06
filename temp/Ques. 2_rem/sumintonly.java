public class sumintonly {
    public static void main(String[] args) {
        int sum = 0; 

        for (String arg : args) {
            try {
                int num = Integer.parseInt(arg);
                sum += num;
            } catch (NumberFormatException e) {
                System.out.println(e+"Invalid integer Argument : " + arg);
            }
        }

        System.out.println("Sum of integers: " + sum);
    }
}
