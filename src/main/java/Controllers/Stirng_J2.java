/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

/**
 *
 * @author huynguyen21
 */
public class Stirng_J2 {
    public static void main(String[] args) {
        String a = "Huyguain";
        
        String b = new String("Hello");
        
        char[] c = {'h', 'u', 'y'};
        String d = new String(c);
        
        //Các phương thức làm việc với String
        d.length(); //trả về độ dài của cuỗi (int)
        d.charAt(0); //trả về ký tự tại vị trí index
        String e = d.substring(0, 3); //trả về chuỗi con
        //số thứ nhất sẽ là beginIndex - số thứ 2 sẽ là end index
        //Lưu ý: substring sẽ từ begin index - endIndex-1 (ko bao gồm end)
        System.out.println(e);
        //concat(): sử dụng để nối chuỗi, cách dùng như (+)
        //StringBuilder: cũng sử dụng để nối chuỗi
        String f = d.concat(e);
        
        String thu_nhat = " an com";
        String thu_hai = "Huy";
        
        String result = thu_hai.concat(thu_nhat);
        
        //"u".indexOf(thu_hai); //Tim vị tri dau tien của chuỗi con
        //"com".lastIndexOf(thu_nhat); //Tìm vị trí cuối cùng của chuỗi con
        System.out.println(thu_hai.indexOf("u"));
        System.out.println(thu_hai.lastIndexOf("o"));
        
        d.equals(thu_hai); //so sánh hai chuỗi
        d.equalsIgnoreCase(thu_hai); //so sánh hai chuỗi không tính viết hoa
        String aEqua = "Vuduc";
        String bEqua = "vuduc";
        System.out.println(aEqua.equals(bEqua));
        System.out.println(aEqua.equalsIgnoreCase(bEqua));
        
        d.compareTo(a); //so sánh chuỗi theo kí tự từ điển ASC
        
        d.trim(); //bỏ toàn bộ khoảng trắng
        d.toLowerCase(); //sử dụng để biến chuỗi thành chữ thường
        d.toUpperCase(); //sử dụng để biến chuỗi thành chữ in hoa
        
        d.replace('A', 'b'); //thay thế ký tự (char old, char new)
        
        d.startsWith(a); //Chuỗi có bắt đầu bằng chuỗi con không - boolean
        d.endsWith(a); //Chuỗi có kết thúc bằng chuỗi con không
        String[] strSplit =  d.split(""); //Tách chuỗi thành mảng dựa trên biểu thức chính quy
        String chuoi = "Dung,Khai,Huong,Huy";
        String[] mang = chuoi.split("\\W");
        
        for (String str : mang) {
            System.out.println(str);
        }
        
        //StringBuilder (hoặc StringBuffer) nối chuỗi
        //đây là các lớp cho phép tạo các chuỗi có thể thay đổi đc
        //các chuỗi có thể thay đổi được là chuỗi biến thiên
        //Lưu ý: Đối với concat(+): nó sẽ tạo ra nhiều String trong quá trình nối chuoix
        //trình nối chuỗi -> tạo ra bấy nhiêu String. có thể lấy ra chuỗi khi chưa nối hết
        //StringBuilder: thì chỉ có 1 bản gốc, và bản gốc đó sẽ thay đổi trong quá trình nối chuỗi
        
        //{a,b,c,d}
        //abcd -> String a = "a, String b = "ab", String c = "abc" (đối với concat)
        //Đối với StringBuilder: String sb = "a" -> sb = "ab" -> sb = "abc"
        
        StringBuilder sb = new StringBuilder();
        
        sb.append(b).append(c).append(d); //Phương thức nối chuỗi của StringBuilder
        
        String resultS = sb.toString(); 
        
        d.isEmpty(); //Ktra xem chuỗi có rỗng hay không - boolean
        String.valueOf(sb); //Chuyển đổi giá trị bất kỳ thành chuỗi
        d.contains(sb); //Tìm xem chuỗi có giá trị này không
        
        d = "Vuduc";
        boolean t = d.contains("ui");
        System.out.println(t);
                
//        Tạo lớp Student có các thuộc tính: int id, String name, int age, String major
//        ->id phải duy nhất, private static int count; -> biến tĩnh
//        Trong constructor khi khởi tạo id = count++
//        Tạo lớp StudentManager bao gồm các Student
//        Tạo menu Switch/case gồm các tác vụ
//        1. Xem danh sách học sinh
//        2. Thêm học sinh
//        3. Xóa học sinh
//        4. Sửa học sinh: -> ng dùng nhập id rồi sửa, ko sửa id
//        5. Tìm theo tên
//        6. Thoát
    }
}
