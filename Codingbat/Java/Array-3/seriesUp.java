public int[] seriesUp(int n) {
  int x = 0;
  int[] output = new int[n*(n+1)/2];
  for(int i=1; i<n+1; i++){
    for(int j=1; j<i+1; j++){
      output[x] = j;
      x++;
    }
  }
  return output;
}

