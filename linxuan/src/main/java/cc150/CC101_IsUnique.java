package cc150;

public class CC101_IsUnique{

    // assume character set is extended ASCII
    // if str is null or blank or not character, return false
    boolean isUnique(String str){
        if(str == null || str == "") return false;
        if(str.length() > 256) return false;

        boolean[] arr = new boolean[256];
        for(int i = 0; i < str.length(); i++){
            int var = str.charAt(i);
            if(arr[var]) return false;
            arr[var] = true;
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(new CC101_IsUnique().isUnique("helo"));
    }
}