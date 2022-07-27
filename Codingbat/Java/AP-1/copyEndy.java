public int[] copyEndy(int[] nums, int count) {
  int[] output = new int[count];
  int outputIdx = 0;
  
  for(int num : nums){
    if(isEndy(num)){
      output[outputIdx] = num;
      outputIdx++;
    }
    if(outputIdx == count) return output;
  }
  
  return output;
  
}

public boolean isEndy(int n){
  if(n >= 0 && n <= 10 || n >= 90 && n <= 100){
    return true;
  }
  return false;
}

