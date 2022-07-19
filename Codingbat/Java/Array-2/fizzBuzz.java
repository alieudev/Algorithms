public String[] fizzBuzz(int start, int end) {
  String[] output = new String[end-start];
  int j = 0;
  for(int i = start; i<end; i++){
    if(i % 3 == 0 && i % 5 == 0) {
      output[j] = "FizzBuzz";
      j++;
    } else if( i % 3 == 0 && i % 5 != 0){
      output[j] = "Fizz";
      j++;
    } else if( i % 3 != 0 && i % 5 == 0){
      output[j] = "Buzz";
      j++;
    } else {
      output[j] = String.valueOf(i);
      j++;
    }
  }
  return output;
}

