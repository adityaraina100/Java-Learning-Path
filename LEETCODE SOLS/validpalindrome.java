class Solution {
    public boolean isPalindrome(String s) {
    String str ="";
    for(int i=0; i<s.length(); i++){
    if( s.charAt(i) >= 'a' && s.charAt(i) <= 'z'|| s.charAt(i) >= '0' && s.charAt(i) <= '9'){
    str+=s.charAt(i);
    }else if( s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
    char ch =s.charAt(i);
    str+=Character.toLowerCase(ch);
    }
    }
    String ans ="";
    for(int i=str.length()-1; i>=0; i--){
    ans+=str.charAt(i);
    }
    if(str.equals(ans)){
    return true;
    }
    return false;
    }
    }