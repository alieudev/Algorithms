public List<Integer> square56(List<Integer> nums) {
  nums = nums.stream()
    .map( num -> num * num + 10)
    .filter(num -> num % 10 != 6 && num % 10 != 5)
    .collect(Collectors.toList());
  
  return nums;
}

