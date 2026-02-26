public class ss4ep4 {
    public static final String LIBRARY_CODE_STRING = "^TV(\\d{4})([a-zA-Z0-9]{5})$";

    public static void ep4() {
        String[] testIds = {
                "TV1234ABCDE",
                "TV5678FGHIJ",
                "TV12A4KLMNO",
                "TX1234PQRST",
                "TV12345UVWX"
        };

        for (String id : testIds) {
            if (id.matches(LIBRARY_CODE_STRING)) {
                System.out.println(id + " la ma the thu vien hop le!");
            } else {
                System.out.println(id + " khong phai ma the thu vien hop le!");
            }
        }
    }
}
