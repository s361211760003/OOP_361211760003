package Lab3;

import java.util.Scanner;

public class LoopDowhile {
    public static void main(String[] args) {
        // do-while -> ทำงานเช่นเดียว while แต่จะทำคำสั่งในลูปก่อน 1 ครั้งเสมอจึงทดสอบเงื่อนไข
        // คำนั้นจะหมายความว่า ไม่ว่าเงื่อนไขจะเป็นจริงหรือเท็จ คำสั่งในลูปจะถูกทำงานแล้วอย่างน้อง 1 ครั้ง

        // do {
        //      คำสั่งเงื่อนไขเป็นจริง;
        // }while(เงื่อนไข);
        Scanner sc = new Scanner(System.in);
        int x = 1;
        do {
            System.out.print("enter an number: ");
            x = sc.nextInt();
        }while (x !=0);

        System.out.println("Good bye.");
    }
}
