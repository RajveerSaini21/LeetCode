class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer>set1 = new HashSet<>();
        Set<Integer>set2 = new HashSet<>(); 

        for(int num : nums1){
            set1.add(num); 
        }

        for(int num : nums2){
            set2.add(num); 
        }


        Set<Integer> onlyNum1 = new HashSet<>(set1); 
        Set<Integer> onlyNum2 = new HashSet<>(set2);

        onlyNum1.removeAll(set2);
        onlyNum2.removeAll(set1); 

        List<Integer> list1 = new ArrayList<>(onlyNum1);
        List<Integer> list2 = new ArrayList<>(onlyNum2);

        List<List<Integer>> lists = new ArrayList<>(); 
        lists.add(list1); 
        lists.add(list2); 

        return lists ; 

    }
}