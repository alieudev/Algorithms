public int bigHeights(int[] heights, int start, int end) {
    int[] new_heights = Arrays.copyOfRange(heights, start, end+1); 
    int count = 0;
    for(int i=0; i<new_heights.length-1; i++){
      if(Math.abs(new_heights[i] - new_heights[i+1]) >= 5) count++;
    }
    return count;
}

