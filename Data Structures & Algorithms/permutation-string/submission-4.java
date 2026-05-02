public class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length())
            return false;
        
        int[] f1 = new int[26];
        int[] f2 = new int[26];

        for(int i = 0; i< s1.length(); i++){
            f1[s1.charAt(i) -'a']++;
            f2[s2.charAt(i) -'a']++;
        }
        int matches = 0;
        for(int k=0; k<26; k++){
            if(f1[k]==f2[k]) 
                matches++;
        }

        //slide window
        int l = 0;
        for( int r = s1.length(); r<s2.length(); r++){
            if(matches == 26)
                return true;

            //incoming character from right
            int index = s2.charAt(r)-'a';
            f2[index]++;
            if(f2[index] == f1[index])
                matches++;
            else if (f2[index] == f1[index]+1)
                matches --;

            //outgoing character from left
            index = s2.charAt(l) -'a';
            f2[index]--;
            if(f2[index]== f1[index])
                matches++;
            else if(f2[index] == f1[index]-1)
                matches--;
            l++;
        }
        return matches==26;
    
    }
}