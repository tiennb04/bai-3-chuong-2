import java.util.Scanner;                                                  

public class XacDinhDoTuoiCua1Nguoi {
    public static void main (String [] args) {
        int age, year;                                                  
        String name, ageGroup;                                                  
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Nhập vào tên: ");
        name = scanner.nextLine ();                                                  
        System.out.println ("Nhập vào năm sinh: ");
        year = scanner.nextInt ();                                                  
        // Xác định độ tuổi tương ứng
        age = 2024 - year; // 2024 là năm hiện tại
        if (age < 16) {                                                  
            ageGroup = "vị thành niên.";
        } else if (age >= 16 && age < 18) {
            ageGroup = "trưởng thành.";
        } else {                                                  
            ageGroup = "đã già.";
        }
        System.out.println ("Bạn " + name + " ở độ tuổi " + ageGroup);
    }
}
