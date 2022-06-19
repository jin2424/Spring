import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Random random = new Random();
        // 3개의 값( 가위바위보) +1은 0이 아닌 1부터 시작하기위해..
        int cpu = random.nextInt(3)+1;
        System.out.println("cpu: "+cpu);

        System.out.println("가위(1), 바위(2), 보(3): ");
        Scanner sc = new Scanner(System.in);
        int user = sc.nextInt();

        if (cpu == user){
            System.out.println("비겼습니다");
        }else if (cpu > user) {
            System.out.print("졌습니다");
        } else {
            System.out.print("이겼습니다");
        }

    }

}


