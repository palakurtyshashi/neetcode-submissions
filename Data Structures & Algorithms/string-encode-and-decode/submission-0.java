class Solution {

    public String encode(List<String> strs) {

        StringBuilder strb = new StringBuilder();
        for(String str: strs){
            
            strb.append( str.length());
            strb.append("#");
            strb.append(str);
        }
        return strb.toString();

    }

    public List<String> decode(String str) {

        List<String> result = new ArrayList<>();
        int i = 0;
        int n = str.length();
        while(i< n) {
            int len = 0;
            while(str.charAt(i)!='#'){
                len = len*10 + (str.charAt(i) - '0');
                i++;
            }
            i++; //skip #
            result.add(str.substring(i,i+len));
            i = i + len;
        }
        return result;
    }
}
