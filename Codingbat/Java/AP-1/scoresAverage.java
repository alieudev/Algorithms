public int scoresAverage(int[] scores) {
  int j = scores.length-1;
  int left = 0; 
  int right = 0;
  int len = scores.length/2;
  for(int i=0; i<scores.length/2; i++){
    left += scores[i]; 
    right += scores[j]; 
    j--;
  }
  int rightAvg = right / len; 
  int leftAvg = left / len; 
  

  if (rightAvg > leftAvg) return rightAvg; 
  else return leftAvg;
}

