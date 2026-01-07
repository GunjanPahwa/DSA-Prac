//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));

    }
    static String longestCommonPrefix(String[] strs) {
        if(strs==null){
            return "";
        }
        if(strs.length==0){
            return "";
        }
        int n=strs.length;
        String Ref=strs[0];
        int Max_length=Ref.length()-1;
        for(int i=0;i<Ref.length();i++){
            char c=Ref.charAt(i);
            for(int j=1;j<strs.length;j++){
                if(i>=strs[j].length() || strs[j].charAt(i)!=c){
                    return Ref.substring(0,i);
                }


            }



        }
        return Ref;

    }
}