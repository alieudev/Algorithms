// non functional 

// public List<Integer> doubling(List<Integer> nums) {
//   ArrayList<Integer> list = new ArrayList<>();
//   for(int num : nums){
//     list.add(num*2);
//   }
//   return list;
// }

public List<Integer> doubling(List<Integer> nums) {
  nums = nums.stream()
      .map(n -> n * 2)
      .collect(Collectors.toList());
  
  return nums;
}


