import java.util.Scanner;

public class Main {
    private static final int MAX_SIZE = 100;
    private static final String MSSV_REGEX = "^B\\d{7}$";
    
    private static String[] mssvArray = new String[MAX_SIZE];
    private static int currentSize = 0;
    private static Scanner scanner;
    
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        
        int choice;
        do {
            displayMenu();
            choice = getMenuChoice();
            
            switch (choice) {
                case 1:
                    displayAllMSSV();
                    break;
                case 2:
                    addNewMSSV();
                    break;
                case 3:
                    updateMSSV();
                    break;
                case 4:
                    deleteMSSV();
                    break;
                case 5:
                    searchMSSV();
                    break;
                case 6:
                    System.out.println("Cảm ơn bạn đã sử dụng chương trình!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại!");
            }
        } while (choice != 6);
        
        scanner.close();
    }
    
    // Hiển thị menu chính
    private static void displayMenu() {
        System.out.println("\n========== QUẢN LÝ MÃ SỐ SINH VIÊN ==========");
        System.out.println("1. Hiển thị danh sách MSSV");
        System.out.println("2. Thêm mới MSSV");
        System.out.println("3. Cập nhật MSSV");
        System.out.println("4. Xóa MSSV");
        System.out.println("5. Tìm kiếm MSSV");
        System.out.println("6. Thoát");
        System.out.println("============================================");
    }
    
    // Lấy lựa chọn từ menu
    private static int getMenuChoice() {
        System.out.print("Vui lòng chọn: ");
        try {
            int choice = Integer.parseInt(scanner.nextLine().trim());
            return choice;
        } catch (NumberFormatException e) {
            return -1;
        }
    }
    
    // Hiển thị tất cả MSSV
    private static void displayAllMSSV() {
        System.out.println("\n----- Danh sách MSSV -----");
        
        // Xử lý trường hợp mảy rỗng
        if (currentSize == 0) {
            System.out.println("Danh sách trống!");
            return;
        }
        
        // Duyệt mảng và hiển thị STT và giá trị
        for (int i = 0; i < currentSize; i++) {
            System.out.println((i + 1) + ". " + mssvArray[i]);
        }
    }
    
    // Thêm mới MSSV
    private static void addNewMSSV() {
        // Kiểm tra mảy đã đầy (100 phần tử)
        if (currentSize >= MAX_SIZE) {
            System.out.println("Mảng đã đầy! Không thể thêm MSSV mới.");
            return;
        }
        
        System.out.println("\n----- Thêm mới MSSV -----");
        String mssv;
        
        // Vòng lặp yêu cầu nhập đến khi hợp lệ
        do {
            System.out.print("Nhập MSSV (định dạng: B2101234): ");
            mssv = scanner.nextLine().trim();
            
            // Kiểm tra định dạng MSSV (bắt đầu bằng B, theo sau là 7 chữ số)
            if (!mssv.matches(MSSV_REGEX)) {
                System.out.println("MSSV không hợp lệ! Phải bắt đầu bằng 'B' và theo sau là 7 chữ số.");
                continue;
            }
            
            // Kiểm tra MSSV đã tồn tại
            if (isExists(mssv)) {
                System.out.println("MSSV này đã tồn tại! Vui lòng nhập MSSV khác.");
                continue;
            }
            
            break;
        } while (true);
        
        // Thêm MSSV vào mảy tại vị trí currentSize
        mssvArray[currentSize] = mssv;
        currentSize++;
        System.out.println("Thêm MSSV thành công!");
    }
    
    // Cập nhật MSSV
    private static void updateMSSV() {
        // Kiểm tra mảy có dữ liệu
        if (currentSize == 0) {
            System.out.println("Danh sách trống! Không có gì để cập nhật.");
            return;
        }
        
        System.out.println("\n----- Cập nhật MSSV -----");
        displayAllMSSV();
        
        // Yêu cầu nhập vị trí (index)
        System.out.print("Nhập vị trí cần sửa (1-" + currentSize + "): ");
        try {
            int index = Integer.parseInt(scanner.nextLine().trim());
            
            // Kiểm tra tính hợp lệ của index
            if (index < 1 || index > currentSize) {
                System.out.println("Vị trí không hợp lệ!");
                return;
            }
            
            index--; // Chuyển từ 1-based sang 0-based
            
            // Yêu cầu nhập MSSV mới (phải thỏa mãn Regex)
            String newMSSV;
            do {
                System.out.print("Nhập MSSV mới (định dạng: B2101234): ");
                newMSSV = scanner.nextLine().trim();
                
                // Kiểm tra định dạng MSSV
                if (!newMSSV.matches(MSSV_REGEX)) {
                    System.out.println("MSSV không hợp lệ! Phải bắt đầu bằng 'B' và theo sau là 7 chữ số.");
                    continue;
                }
                
                // Kiểm tra MSSV mới đã tồn tại (trừ vị trí hiện tại)
                if (isExistsExceptIndex(newMSSV, index)) {
                    System.out.println("MSSV này đã tồn tại! Vui lòng nhập MSSV khác.");
                    continue;
                }
                
                break;
            } while (true);
            
            mssvArray[index] = newMSSV;
            System.out.println("Cập nhật MSSV thành công!");
            
        } catch (NumberFormatException e) {
            System.out.println("Vị trí không hợp lệ!");
        }
    }
    
    // Xóa MSSV
    private static void deleteMSSV() {
        // Kiểm tra mảy có dữ liệu
        if (currentSize == 0) {
            System.out.println("Danh sách trống! Không có gì để xóa.");
            return;
        }
        
        System.out.println("\n----- Xóa MSSV -----");
        System.out.print("Nhập MSSV cần xóa: ");
        String mssvToDelete = scanner.nextLine().trim();
        
        // Tìm vị trí MSSV cần xóa
        int indexToDelete = -1;
        for (int i = 0; i < currentSize; i++) {
            if (mssvArray[i].equalsIgnoreCase(mssvToDelete)) {
                indexToDelete = i;
                break;
            }
        }
        
        // Nếu không tìm thấy
        if (indexToDelete == -1) {
            System.out.println("MSSV không tìm thấy!");
            return;
        }
        
        // Dồn mảy: dịch các phần tử phía sau lên để lấp chỗ trống
        for (int i = indexToDelete; i < currentSize - 1; i++) {
            mssvArray[i] = mssvArray[i + 1];
        }
        
        mssvArray[currentSize - 1] = null;
        currentSize--;
        
        System.out.println("Xóa MSSV thành công!");
    }
    
    // Tìm kiếm MSSV (không phân biệt hoa thường)
    private static void searchMSSV() {
        System.out.println("\n----- Tìm kiếm MSSV -----");
        System.out.print("Nhập chuỗi ký tự tìm kiếm: ");
        String searchStr = scanner.nextLine().trim().toLowerCase();
        
        // Xử lý chuỗi tìm kiếm rỗng
        if (searchStr.isEmpty()) {
            System.out.println("Vui lòng nhập chuỗi tìm kiếm!");
            return;
        }
        
        // Hiển thị tất cả MSSV chứa chuỗi tìm kiếm
        System.out.println("\nKết quả tìm kiếm:");
        int count = 0;
        for (int i = 0; i < currentSize; i++) {
            if (mssvArray[i].toLowerCase().contains(searchStr)) {
                System.out.println((count + 1) + ". " + mssvArray[i]);
                count++;
            }
        }
        
        // Xử lý trường hợp không tìm thấy
        if (count == 0) {
            System.out.println("Không tìm thấy kết quả phù hợp!");
        }
    }
    
    // Kiểm tra MSSV đã tồn tại trong danh sách
    private static boolean isExists(String mssv) {
        for (int i = 0; i < currentSize; i++) {
            if (mssvArray[i].equalsIgnoreCase(mssv)) {
                return true;
            }
        }
        return false;
    }
    
    // Kiểm tra MSSV đã tồn tại (trừ một index nhất định)
    private static boolean isExistsExceptIndex(String mssv, int excludeIndex) {
        for (int i = 0; i < currentSize; i++) {
            if (i != excludeIndex && mssvArray[i].equalsIgnoreCase(mssv)) {
                return true;
            }
        }
        return false;
    }
}