class Solution {
    public int maximumSetSize(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<Integer>();
          Set<Integer> s2 = new HashSet<Integer>();
       int l1  = nums1.length/2;       
        int l2 = l1;                 
        for(int i=0; i<nums1.length;i++)
        {
          s1.add(nums1[i]);             
        }
         for(int i=0; i<nums2.length;i++)
        {
          s2.add(nums2[i]);             
        }
        s1.retainAll(s2);              

        for(int i=0; i<nums1.length;i++)   
        {
            if(!s1.contains(nums1[i]) && l1!=0 && s1.size()!=nums1.length)  
            {
                s1.add(nums1[i]);       
                l1--;
            }
        }
        for(int i=0; i<nums2.length;i++)        
        {
            if(!s1.contains(nums2[i]) && l2!=0 && s1.size()!=nums1.length) 
            {
                s1.add(nums2[i]);
                l2--;
            }
        }
        return s1.size();
    }
}