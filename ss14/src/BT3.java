import java.util.HashSet;
import java.util.Set;

public class BT3 {
    public static void main(String[] args) {
        Set<String> drugsComponent = new HashSet<>();

        drugsComponent.add("Paracetamol");
        drugsComponent.add("Caffeine");
        drugsComponent.add("Aspirin");

        Set<String> chatDiUng = new HashSet<>();
        chatDiUng.add("Penicillin");
        chatDiUng.add("Aspirin");

        Set<String> canhBao = new HashSet<>(drugsComponent);
        canhBao.retainAll(chatDiUng);

        Set<String> chatAnToan = new HashSet<>(drugsComponent);
        chatAnToan.removeAll(chatDiUng);

        System.out.println("Canh bao: " + canhBao);
        System.out.println("Chat an toan: " + chatAnToan);
    }
}