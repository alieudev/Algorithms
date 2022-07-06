public List<Integer> two2(List<Integer> nums) {
  nums = nums.stream()
    .map(num -> num * 2)
    .filter(num -> num  % 10 != 2)
    .collect(Collectors.toList());
    
  return nums;
}

