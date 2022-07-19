public int[] fizzArray3(int start, int end) {
  int[] output = new int[end-start];
  int j = 0;
  for(int i=start; i<end; i++){
    output[j] = i;
    j++;
  }
  return output;
}

