public List<Integer> noNeg(List<Integer> nums) {
  nums = nums.stream()
    .filter(num -> num >= 0)
    .collect(Collectors.toList());
  
  return nums;
}

