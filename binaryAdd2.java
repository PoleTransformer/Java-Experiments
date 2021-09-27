public class binaryAdd2 {
    public static void main(String[] args) {
        String a = "1001";
        String b = "11";
        String max = "";
        String min = "";
        if(a.length() > b.length()) {
            max = a;
            min = b;
        }
        else {
            max = b;
            min = a;
        }
        int i = max.length()-1;
        int limit = i - min.length();
        int remainder = 0;
        String result = "";
        while(i > 0) {
            if(i >= limit) {
                int sum = min.charAt(i) + max.charAt(i);
                if(sum > 1) {
                    remainder = 1;
                    result += "0";
                }
            }
        }
    }
}
