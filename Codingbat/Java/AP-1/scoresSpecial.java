public int scoresSpecial(int[] a, int[] b) {
  return largest(a) + largest(b);
}

public int largest(int[] nums){
  int largest = 0;
  
  for(int num : nums){
    if(num % 10 == 0){
      largest = Math.max(num, largest);
    }
  }
  return largest;
}

