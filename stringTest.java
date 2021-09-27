
public class stringTest {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        String lower = str.toLowerCase();
        String formatted = "";
        for(int i = 0; i < lower.length(); i++) {
            char c = lower.charAt(i);
            if(c >= 'a' && c <= 'z' || c >= '0' && c <= '9') {
                formatted += c;
            }
        }
        System.out.println(formatted);
    }
}
