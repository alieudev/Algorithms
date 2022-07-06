public List<Integer> noTeen(List<Integer> nums) {
  nums = nums.stream()
    .filter( num -> !(num >= 13 && num <= 19))
    .collect(Collectors.toList());
  
  return nums;
}



// or you can use a helper

// public boolean filterTeen(int num){
//   if (num >= 13 && num <= 19){
//     return true;
//   }
//   return false;
// }

