public class addBinary {
    public static void main(String[] args) {
        String b = "110111101100010011000101110110100000011101000101011001000011011000001100011110011010010011000000000";
        System.out.println(intToBinary(9223372036854775807L));
    }

    static String intToBinary(long num) {
        String result = "";
        while(num > 0) {
            long remainder = num % 2L;
            result += remainder;
            num /= 2L;
        }
        return result;
    }

    static long binaryToInt(String binary) {
        long result = 0;
        int j = 0;
        for(int i = binary.length()-1; i >= 0; i--) {
            if(binary.charAt(i) == '1') {
                result += Math.pow(2, j);
            }
            j++;
        }
        return result;
    }
}
