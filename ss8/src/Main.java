import java.util.Scanner;

/**
 * Lớp StudentManagement quản lý danh sách sinh viên.
 * Chứa các chức năng thêm, sửa, xóa, tìm kiếm sinh viên.
 */
public class Main {
    // Mảng lưu trữ tối đa 100 sinh viên
    private static Student[] students = new Student[100];
    // Biến đếm số lượng sinh viên hiện có
    private static int currentCount = 0;
    // Scanner để nhập dữ liệu từ bàn phím
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        
        // Vòng lặp menu chính
        do {
            displayMenu();
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Xử lý trôi lệnh sau nextInt()
            
            switch (choice) {
                case 1:
                    displayAllStudents();
                    break;
                case 2:
                    addStudent();
                    break;
                case 3:
                    editStudent();
                    break;
                case 4:
                    searchByName();
                    break;
                case 5:
                    deleteStudent();
                    break;
                case 6:
                    System.out.println("Cảm ơn bạn đã sử dụng chương trình!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại!");
            }
            System.out.println();
        } while (choice != 6);
        
        scanner.close();
    }

    /**
     * Hiển thị menu chính của chương trình
     */
    private static void displayMenu() {
        System.out.println("========== MENU QUẢN LÝ SINH VIÊN ==========");
        System.out.println("1. Hiển thị danh sách tất cả sinh viên");
        System.out.println("2. Thêm mới sinh viên");
        System.out.println("3. Sửa thông tin sinh viên theo ID");
        System.out.println("4. Tìm kiếm sinh viên theo tên");
        System.out.println("5. Xóa sinh viên theo ID");
        System.out.println("6. Thoát");
        System.out.println("===========================================");
    }

    /**
     * Hiển thị danh sách tất cả sinh viên
     */
    private static void displayAllStudents() {
        if (currentCount == 0) {
            System.out.println("Danh sách sinh viên trống!");
            return;
        }
        
        System.out.println("\n========== DANH SÁCH SINH VIÊN ==========");
        for (int i = 0; i < currentCount; i++) {
            System.out.print((i + 1) + ". ");
            students[i].displayData();
        }
        System.out.println("=========================================");
    }

    /**
     * Thêm mới sinh viên vào danh sách
     */
    private static void addStudent() {
        // Kiểm tra xem mảng đã đầy chưa
        if (currentCount >= 100) {
            System.out.println("Danh sách sinh viên đã đầy!");
            return;
        }
        
        System.out.println("\n========== THÊM MỚI SINH VIÊN ==========");
        
        // Nhập ID sinh viên
        System.out.print("Nhập ID sinh viên: ");
        String studentId = scanner.nextLine();
        
        // Kiểm tra ID đã tồn tại chưa
        if (findStudentById(studentId) != -1) {
            System.out.println("ID này đã tồn tại!");
            return;
        }
        
        // Nhập các thông tin còn lại
        System.out.print("Nhập tên sinh viên: ");
        String studentName = scanner.nextLine();
        
        System.out.print("Nhập tuổi: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Xử lý trôi lệnh
        
        System.out.print("Nhập giới tính: ");
        String sex = scanner.nextLine();
        
        System.out.print("Nhập điểm số: ");
        double mark = scanner.nextDouble();
        scanner.nextLine(); // Xử lý trôi lệnh
        
        // Tạo đối tượng Student mới và thêm vào mảng
        students[currentCount] = new Student(studentId, studentName, age, sex, mark);
        currentCount++;
        
        System.out.println("Thêm sinh viên thành công!");
        System.out.println("=========================================");
    }

    /**
     * Sửa thông tin sinh viên theo ID
     */
    private static void editStudent() {
        System.out.println("\n========== SỬA THÔNG TIN SINH VIÊN ==========");
        
        // Nhập ID sinh viên cần sửa
        System.out.print("Nhập ID sinh viên cần sửa: ");
        String studentId = scanner.nextLine();
        
        // Tìm kiếm sinh viên theo ID
        int index = findStudentById(studentId);
        if (index == -1) {
            System.out.println("Không tìm thấy sinh viên với ID: " + studentId);
            return;
        }
        
        // Hiển thị thông tin hiện tại
        System.out.println("Thông tin sinh viên hiện tại:");
        students[index].displayData();
        
        // Cho phép sửa các thông tin
        System.out.println("Nhập thông tin mới (bỏ qua để giữ nguyên):");
        
        System.out.print("Nhập tên mới: ");
        String newName = scanner.nextLine();
        if (!newName.isEmpty()) {
            students[index].setStudentName(newName);
        }
        
        System.out.print("Nhập tuổi mới: ");
        String ageStr = scanner.nextLine();
        if (!ageStr.isEmpty()) {
            students[index].setAge(Integer.parseInt(ageStr));
        }
        
        System.out.print("Nhập giới tính mới: ");
        String newSex = scanner.nextLine();
        if (!newSex.isEmpty()) {
            students[index].setSex(newSex);
        }
        
        System.out.print("Nhập điểm mới: ");
        String markStr = scanner.nextLine();
        if (!markStr.isEmpty()) {
            students[index].setMark(Double.parseDouble(markStr));
        }
        
        System.out.println("Sửa thông tin thành công!");
        System.out.println("Thông tin sinh viên sau khi sửa:");
        students[index].displayData();
        System.out.println("============================================");
    }

    /**
     * Tìm kiếm sinh viên theo tên
     */
    private static void searchByName() {
        System.out.println("\n========== TÌM KIẾM SINH VIÊN ==========");
        
        System.out.print("Nhập chuỗi tìm kiếm (tên hoặc một phần tên): ");
        String keyword = scanner.nextLine().toLowerCase();
        
        System.out.println("Kết quả tìm kiếm:");
        int count = 0;
        
        // Duyệt mảng và tìm các sinh viên có tên chứa chuỗi tìm kiếm
        for (int i = 0; i < currentCount; i++) {
            if (students[i].getStudentName().toLowerCase().contains(keyword)) {
                System.out.print((count + 1) + ". ");
                students[i].displayData();
                count++;
            }
        }
        
        if (count == 0) {
            System.out.println("Không tìm thấy sinh viên nào với tiêu chí tìm kiếm!");
        } else {
            System.out.println("Tìm thấy " + count + " sinh viên!");
        }
        System.out.println("=====================================");
    }

    /**
     * Xóa sinh viên theo ID
     */
    private static void deleteStudent() {
        System.out.println("\n========== XÓA SINH VIÊN ==========");
        
        System.out.print("Nhập ID sinh viên cần xóa: ");
        String studentId = scanner.nextLine();
        
        // Tìm kiếm sinh viên theo ID
        int index = findStudentById(studentId);
        if (index == -1) {
            System.out.println("Không tìm thấy sinh viên với ID: " + studentId);
            return;
        }
        
        // Hiển thị thông tin sinh viên sắp bị xóa
        System.out.println("Sinh viên sắp bị xóa:");
        students[index].displayData();
        
        // Xác nhận xóa
        System.out.print("Bạn chắc chắn muốn xóa? (Y/N): ");
        String confirm = scanner.nextLine();
        
        if (confirm.equalsIgnoreCase("Y")) {
            // Dồn mảng: di chuyển tất cả phần tử sau vị trí index lên một vị trí
            for (int i = index; i < currentCount - 1; i++) {
                students[i] = students[i + 1];
            }
            // Gán null cho phần tử cuối cùng
            students[currentCount - 1] = null;
            currentCount--;
            
            System.out.println("Xóa sinh viên thành công!");
        } else {
            System.out.println("Hủy xóa sinh viên!");
        }
        System.out.println("==================================");
    }

    /**
     * Tìm kiếm vị trí (index) của sinh viên theo ID
     * @param studentId ID của sinh viên cần tìm
     * @return Vị trí trong mảng nếu tìm thấy, -1 nếu không tìm thấy
     */
    private static int findStudentById(String studentId) {
        for (int i = 0; i < currentCount; i++) {
            if (students[i].getStudentId().equals(studentId)) {
                return i;
            }
        }
        return -1;
    }
}