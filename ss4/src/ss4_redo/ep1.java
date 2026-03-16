package ss4_redo;

public class ep1 {

    static String capitalizeWords(String str){
        String[] words = str.split(" ");

        StringBuilder res = new StringBuilder();

        for (String word : words){
            if (word.length() > 0){
                res.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1).toLowerCase())
                        .append(" ");
            }
        }

       return res.toString().trim();

    }

    public static void ep1Main(){
        String title = "     JAVA   fundamental       hello ";
        String author = "Henry something halo";
        String str3 = new String("     JAVA   fundamental       hello ");

//        StringBuilder str1 = new StringBuilder("Hello");
//
//        System.out.println(str1.append(" World"));




        String str1 = title.trim().replaceAll("\\s+", " ");
        String str2 = capitalizeWords(author);


        String result = str1.concat(" - Tác giả: ").concat(str2);


        System.out.println(result);
    }
}
