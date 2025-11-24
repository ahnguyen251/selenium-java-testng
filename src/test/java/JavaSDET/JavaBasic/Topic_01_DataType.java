package JavaSDET.JavaBasic;

import org.openqa.selenium.By;

import java.util.ArrayList;

public class Topic_01_DataType {
    //-Kiểu dữ liệu nguyên thủy ( Primitive Type)
    //Kiểu kí tự
    char aChar = 'a';
    //Kiểu số nguyên- số không có phần thập phân
    int iNumber = 23;
    //Kiểu số thực - số có phần thập phân
    float fNumber = 32.12f;
    double dNumer = 32.12d;
    //Kiểu logic
    boolean man = true;

    //-Kiểu dữ liệu tham chiếu(Reference Type)
    //Kiểu chuỗi
    String studentAdress = "236 Dai Tu - Ha Noi" ;
    //By by = By.id;
    //Kiểu mảng
    String[] studentCity ={"Ha Noi","Da Nang"};
    int[] studentAge = {12,23,34,};
    //Kiểu class/interface
    Topic_01_DataType topic = new Topic_01_DataType();
    IWebDriver iWebDriver;

    //Collection/Object
    //List<String> address = new ArrayList<>(); //Kiểu chuỗi không cần khia báo giá trị cụ thể, có thể khai báo sau
    //Khai báo 1 biến

    //Accses Modifier: phạm vi truy cập
    //Private//Default//Public//Protected
    // Loại kiểu dữ liệu
    //Kiểu chuỗi: String
    //Giá trị của dữ liệu: Gán cho biến qua dấu =

    String studentName = "Ngoc Anh";

}
