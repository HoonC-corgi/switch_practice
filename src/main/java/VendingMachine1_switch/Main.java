package VendingMachine1_switch;

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("메뉴(아ㅏ, 라떼, 유자민트티, 에스프레소, 청포도, 종료) : ");
            String selectedMenu = scanner.next();
            if(selectedMenu.equals("종료")) {
                System.out.println("감사합니다.");
                break;
            }

            int price = -1;
            switch(selectedMenu) {
                case "유자민트티" :
                case "청포도" :
                    price = 5500;
                    break;
                case "라떼":
                    price = 4500;
                    break;
                case "아아":
                    price = 3500;
                    break;
                case "에스프레소":
                    price = 3000;
                    break;
                default:
                    System.out.println("메뉴를 잘못 선택하셨습니다.");
            }
            if(price != -1) {
                System.out.println(selectedMenu + "는 " + price + "원입니다.");
            }
        }
    }
}
