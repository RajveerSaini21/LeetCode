class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer , Integer> frequency = new HashMap<>(); 
        for(int num : arr){
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        Set<Integer> check = new HashSet<>(); 
        for(int i : frequency.values()){
            if (!check.add(i)) {
                return false; 
            } 
        }

        return true ; 
    }
}