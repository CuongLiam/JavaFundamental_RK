public class Main {
    public static void main(String[] args) {
        // Stack: book1 lưu 0x1 | Heap: 0x1 chứa "Java basic"
        String book1 = "Java basic";

        // Stack: book2 lưu 0x2 | Heap: 0x2 chứa "Python Intro"
        String book2 = "Python Intro";

        String temp;

        System.out.println("Trước khi hoán đổi: Book1 = "+book1+" ,Book2 = "+book2);

        // BƯỚC HOÁN ĐỔI:
        // 1. temp copy địa chỉ từ book1 (temp trỏ tới 0x1)
        temp = book1;

        // 2. book1 copy địa chỉ từ book2 (book1 trỏ tới 0x2)
        // Lưu ý: Đối tượng "Java basic" trên Heap vẫn ở 0x1, không mất đi.
        book1 = book2;

        // 3. book2 lấy địa chỉ từ temp (book2 trỏ tới 0x1)
        book2 = temp;

        // KẾT LUẬN:
        // Trên Stack: Các biến thay đổi địa chỉ mà chúng trỏ tới.
        // Trên Heap: Nội dung các chuỗi hoàn toàn giữ nguyên, không bị di chuyển hay thay đổi.
        System.out.println("Sau khi hoán đổi: Book1 = "+book1+" ,Book2 = "+book2);
    }
}