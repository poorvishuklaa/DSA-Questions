public class SkipAcharacter {
    //processed  p, unprocessed up
    public static void skip(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        if(ch=='a')
        skip(p,up.substring(1));
        else
        skip(p+ch,up.substring(1));
    }
    //return type
    public static String skipp(String str){
        if(str.isEmpty()){
            return "";
        }
        char ch=str.charAt(0);
        if(ch=='a')
        return skipp(str.substring(1));
        else
        return ch+skipp(str.substring(1));
    }
        public static void main(String[] args) {
        String str="abaccada";
        skip("",str);
        System.out.println(skipp(str));
        System.out.println(str.substring(1));
    }
    
}
