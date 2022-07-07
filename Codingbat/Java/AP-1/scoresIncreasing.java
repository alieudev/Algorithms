public boolean scoresIncreasing(int[] scores) {
  for(int i=0; i<scores.length-1; i++){
    if(scores[i+1] < scores[i]){
      return false;
    }
  }
  return true;
}

