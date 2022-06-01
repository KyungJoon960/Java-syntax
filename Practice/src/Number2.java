public class Number2 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i == 6) {
                break; // i가 6일때까지만 하고 멈춘다
                //continue; i가 6일때만 반복문을 수행하지 않겠다
            }
        }
    }

}
