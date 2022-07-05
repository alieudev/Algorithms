public List<Integer> square(List<Integer> nums) {
  nums = nums.stream()
    .map(n -> n * n)
    .collect(Collectors.toList());
    
  return nums;
}

