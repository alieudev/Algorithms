public String[] mergeTwo(String[] a, String[] b, int n) {
  String[] output = new String[n];
  int indexA = 0; 
  int indexB = 0;
  
  for(int index=0; index<n; index++){
    if(a[indexA].compareTo(b[indexB]) < 0 ){
      output[index] = a[indexA]; 
      indexA++;
    } else if (a[indexA].compareTo(b[indexB]) > 0 ){
      output[index] = b[indexB]; 
      indexB++;
    } else {
      output[index] = a[indexA];
      indexA++; 
      indexB++;
    }
  }
  
  return output;
}

