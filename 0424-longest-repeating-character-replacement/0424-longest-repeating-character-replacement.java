class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26]; 
        int left = 0;  
        int maxcount = 0;  
        int maxlength = 0;  
        for (int right = 0; right < s.length(); right++) {
            freq[s.charAt(right) - 'A']++;
            maxcount = Math.max(maxcount, freq[s.charAt(right) - 'A']);
            if (right - left + 1 - maxcount > k) {
                freq[s.charAt(left) - 'A']--;
                left++; 
            }
            maxlength = Math.max(maxlength, right - left + 1);
        }
        return maxlength;
    }
}
