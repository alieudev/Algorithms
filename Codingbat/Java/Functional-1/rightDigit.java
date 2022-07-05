public List<Integer> rightDigit(List<Integer> nums) {
  nums = nums.stream()
    .map(n -> n % 10)
    .collect(Collectors.toList());
  
  return nums;
}

