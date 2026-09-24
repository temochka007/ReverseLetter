package BaseTraning;

public class ReverseLetter {
    char[] text;
    public ReverseLetter(char[] text){
        this.text = text;
    }
    public String ReverseLetter(char[] chars){
        int left = 0;
        int right = chars.length - 1;
        while(left < right){
            while(left < right && !Character.isLetter(chars[left])){
                left++;
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
        return new String(chars);
    }
    @Override
    public String toString() {
        return "ReverseLetter{" +
                "text='" + text + '\'' +
                '}';
    }
}
