import javax.swing.*;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        float length = 0;
        float width = 0;
        float height = 0;
        Scanner scanner  =new Scanner(System.in);
        System.out.println("Please enter object's length:");
        length = scanner.nextFloat();
        System.out.println("Please enter object's width:");
        width = scanner.nextFloat();
        System.out.println("Please enter object's height:");
        height = scanner.nextFloat();
        Box3 box3 = new Box3(length, width, height);
        Box5 box5 = new Box5(length, width, height);
        if (box3.validate()) //經由validate()方法確認是否可以放入Box3
            System.out.println("Box3");//若可以印出Box3
        else if (box5.validate())//若無法放入Box3, 再經由validate()方法確認是否可以放入Box5
            System.out.println("Box5");//若可以印出Box5
        else //若是都無法裝入的話，印出兩個箱子都無法使用
            System.out.println("You can't use both Box3 and Box5!!");
    }
}
