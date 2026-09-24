package BaseTraning;

public class Main {
    public static void main(String[] args) {
        char[] chars = "J@va the be$t!123".toCharArray();
        String revers = ReverseLetter(chars);
        System.out.println(revers);
    }
    public static String ReverseLetter(char[] chars){
        int left = 0;
        int right = chars.length - 1;
        while(left < right){
            while(left < right && !Character.isLetter(chars[left])){
                left++;
                //Вот здесь допустим переделай
            }
            while(left < right && !Character.isLetter(chars[right])){
                right--;
            }
            char tmp = chars[left];
            chars[left] = chars[right];
            chars[right] = tmp;
            left++;
            right--;
        }
        return new String((chars));
    }
}
