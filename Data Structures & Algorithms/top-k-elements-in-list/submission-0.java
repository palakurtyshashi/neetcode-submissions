class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> freqMap = new HashMap<>();

        for (int i : nums){
           freqMap.put(i, freqMap.getOrDefault(i,0)+1);
        }

        List<Integer>[] buckets = new List[nums.length+1];
        for (Map.Entry<Integer,Integer> entry : freqMap.entrySet()){
            Integer num = entry.getKey();
            Integer freq = entry.getValue();

            if(buckets[freq] == null){
                buckets[freq] = new ArrayList<>();
            }
            buckets[freq].add(num);
        }

        int[] result = new int[k];
        int index = 0;


        for(int j = buckets.length - 1; j>=0 && index<k; j--){

            if(buckets[j]!=null){
                for(Integer resNum: buckets[j]){
                    result[index++] = resNum;
                    if(index == k)
                        break;
                }


            }

        
        }

        return result;

        
    }
}
