import java.util.Random;


public class Number {

    public static void main(String[] args){
        System.out.println(Math.max(1,5));
        System.out.println(Math.min(10,15));

        Random random = new Random();
        int rand = random.nextInt(10); //0~9 랜덤
        int rand2 = random.nextInt(4)+5; // 5~9 랜덤
        System.out.println(rand);
        System.out.println(rand2);

        int i = 4;
        if (i < 5) {
            System.out.println("참");
        } else if (i < 3) {
            System.out.println("거짓");
        }  else {
              System.out.println("나머지");
            }

        boolean isMarried = true;
        boolean isWoman = false;

        String str;

        str = isMarried? "결혼 했다" : "결혼 안했다";
        System.out.println(str);

        if (isMarried && isWoman) { // && = and, || = or
            str = "유부녀";
        } else {
            str = "그 외";
        }
        System.out.println(str);

    }
}
