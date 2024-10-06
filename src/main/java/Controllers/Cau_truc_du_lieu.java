/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author huynguyen21
 */
public class Cau_truc_du_lieu {

    public static void main(String[] args) {
        // ArrayList đây là một cấu trúc dữ liệu lưu trữ các phần tử có cùng kiểu dữ liệu
        // và có kích thước cố định. Các pt cũng đánh số theo index (0).
        ArrayList<String> alist = new ArrayList();
        alist.add("huy");
        alist.add("huong");

        System.out.println(alist.get(0));

        for (String item : alist) {
            System.out.println(item);
        }

        // LinkedList đây là danh sách liên kết, trong đó mỗi phần tử chứa một liên kết đến phần tử tiếp theo
        //head-pt1-pt2-pt3-tail
        LinkedList<String> llist = new LinkedList();
        llist.addFirst("first");
        llist.addLast("last");

        System.out.println(llist.get(0));

        //Stack: là cấu trúc dữ liệu hoạt động theo nguyên tắc LIFO (last in - first out)
        Stack<String> slist = new Stack();
        slist.push("huyguain");
        slist.push("huong");
        slist.pop();

        //Queue: cấu trúc dữ liệu hoạt động theo nguyên tắc FIFO (first in - first out)
        //thường được triển khai bằng LinkedList
        Queue<String> qlist = new LinkedList();
        qlist.add("kaka");
        qlist.poll();

        //HashMap một cấu trúc dữ liệu lưu trữ theo dạng key-value
        //key thì là duy nhất - value thì không
        HashMap<Integer, String> hlist = new HashMap<>();
        hlist.put(1, "huy");
        hlist.put(2, "huong");
        hlist.put(2, "hoa");

        System.out.println(hlist.get(2));
        
        //HashSet là cấu trúc dữ liệu chỉ lưu trữ giá trị duy nhất, không được phép trùng lặp
        HashSet<String> setList = new HashSet<>();
        setList.add("huy");
        setList.add("huong");
        setList.add("huong");
        
        System.out.println(setList);
        
        //Collection Framework
        //Thư viện cung cấp cấu trúc dữ liệu và thuạt toán được tích hợp sẵn
        //nhằm mục địch hỗ trợ ltv dễ dàng xử lí dữ liệu hơn.
        //Một số phương thức phổ biến: 
        //add(): thêm phần tử
        //remove(): Xóa phần tử
        //contains(): Kiểm tra xem bộ sưu tập có chứa phần tử cụ thể hay không - Boolean
        //size(): trả về số lượng phần tử trong bộ sưu tập
        //clear(): xóa toàn bộ phần tử trong bst
        //isEmpty(): Kiểm tra xem bst có rỗng hay ko
    }
}
