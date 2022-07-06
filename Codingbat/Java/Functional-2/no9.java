public List<Integer> no9(List<Integer> nums) {
  nums = nums.stream()
    .filter( num -> num % 10 != 9)
    .collect(Collectors.toList());
  
  return nums;
}

