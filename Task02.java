public class Task02 {
    public static void main(String[] args) {
        for (int i = 2; i <= 100000; i++){
            boolean pr = true;

            for (int j = 2; j < i; j++){
                if (i % j == 0){
                    pr = false;
                    break;
                }
            }
            if (pr){
                System.out.println(i);
            }
        }
    }
}
