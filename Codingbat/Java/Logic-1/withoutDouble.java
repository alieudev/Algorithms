public int withoutDoubles(int die1, int die2, boolean noDoubles) {
  if(noDoubles){
    if(die1 == die2){
      int sum = die1 + die2; 
      if (sum == 12) return 7; 
      else return sum + 1;
    }
  } 
  if (die1 == die2)
    return die1 + die2;
  return die1 + die2;
}

