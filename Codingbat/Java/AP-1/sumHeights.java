public int sumHeights(int[] heights, int start, int end) {
  
  int[] newHeights = Arrays.copyOfRange(heights, start, end+1); 
  
  int count = 0; 
  
  for(int i = 1; i < newHeights.length; i++){
    count += Math.abs(newHeights[i] - newHeights[i-1]);
  }
  
  return count;
}

