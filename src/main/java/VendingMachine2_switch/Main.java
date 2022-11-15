package VendingMachine2_switch;

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("무슨 커피? :");
        String coffee = scanner.next();

        int price = 0;
        switch(coffee) {
            case "에스프레소":
            case "카푸치노":
            case "카페라떼":
                price = 3500;
                break;
            case "아메리카노":
                price = 2000;
                break;

            default:
                System.out.println("메뉴에 없음");
        }
        if(price != 0) {
            System.out.println(coffee + "의 가격은 " + price + "원");
            scanner.close();
        }
    }
}