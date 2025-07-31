class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        Set<Integer> res = new HashSet<>();
        Set<Integer> cur = new HashSet<>();
        for (int elem : arr){
            Set<Integer> next = new HashSet<>();
            next.add(elem);
            for (int data : cur){
                next.add(data | elem);
            }
            res.addAll(next);
            cur = next;
        }
        return res.size();
    }
}