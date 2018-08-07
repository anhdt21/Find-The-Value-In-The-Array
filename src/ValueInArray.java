import java.util.Scanner;

public class ValueInArray {
    public static void main(String[] args) {
        String[] classJava = {"Tuan anh", "Tien", "Truong", "Long", "Dat", "Hau"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten sinh vien: ");
        String input_name = sc.nextLine();

        Boolean isExist = false;
        for (int i = 0; i < classJava.length; i++) {
            if (classJava[i].equals(input_name)) {
                System.out.println("Sinh vien " + input_name + " co so thu tu " + (i+1));
                isExist = true;
                break;
            }
        }
        if (!isExist)
            System.out.println("Khong co sinh vien " + input_name + " trong danh sach");

    }
}
