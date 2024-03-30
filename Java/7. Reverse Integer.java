class Solution {
    public int reverse(int x) {
       String s = String.valueOf(x);
       String rs="";
       char ch;
       int ans;
       for(int i=0;i<s.length();i++){
        ch = s.charAt(i);
        rs = ch+rs;
       }
       if(rs.contains(String.valueOf('-'))){
        rs = rs.substring(0,rs.length()-1);
       try{
        return -1*Integer.parseInt(rs);}
        catch(Throwable t){
            return 0;
        }

       }
      try{
       return Integer.parseInt(rs);}
       catch(Throwable t){
        return 0;
       }
    }
}
