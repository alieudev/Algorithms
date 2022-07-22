public int fixTeen(int n){
  if(n == 15 || n == 16) return n; 
  else return 0;
}

public int noTeenSum(int a, int b, int c) {
  int total = 0; 
  int[] nums = new int[] {a, b, c}; 
  for( int num : nums){
    if( num >= 13 && num <= 19){
      total += fixTeen(num); 
    } else {
      total += num;
    }
  }
  return total;
}
