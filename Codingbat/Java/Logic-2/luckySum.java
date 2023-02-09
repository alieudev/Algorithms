public int luckySum(int a, int b, int c) {
  int sum = 0; 
  sum += a + b + c; 
  
  if (a == 13){
    return 0; 
  } 
  if (b == 13 && a != 13){
    return a;
  } 
  if (c == 13 && a != 13 && b != 13){
    return a + b;
  }
  return sum;
}

