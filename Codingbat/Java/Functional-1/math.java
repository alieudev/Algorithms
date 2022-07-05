public List<Integer> math1(List<Integer> nums) {
  nums = nums.stream()
    .map(num -> (num + 1) * 10)
    .collect(Collectors.toList());
    
  return nums;
}

