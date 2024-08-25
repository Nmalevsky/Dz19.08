import java.util.StringJoiner;

public class Task03 {
    public static void main(String[] args) {
        int a = 0;
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 10; i < 1000000; i++){
            int n1 = i % 10;
            int n2 = i / 10 % 10;
            int n3 = i / 100 % 10;
            int n4 = i / 1000 % 10;
            int n5 = i / 10000 % 10;
            int n6 = i / 100000 % 10;
            if (i == (n1*n1*n1) + (n2*n2*n2) + (n3*n3*n3) + (n4*n4*n4) + (n5*n5*n5) + (n6*n6*n6)){
                sj.add(String.valueOf(i));
                a++;
            }
        }
        System.out.println(sj);
    }
}
