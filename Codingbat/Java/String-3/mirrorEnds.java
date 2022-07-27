public String mirrorEnds(String string) {
  
  if(string.length() == 1) return string; 
  if(string.length() == 0) return "";
  
  String output = ""; 
  int left  = 0; 
  int right = string.length(); 
  
  while (left != string.length()){
    if(!string.substring(left, left+1).equals(string.substring(right-1,right))) { 
      return output;
    } else {
      output += string.substring(left, left+1);
      left++; 
      right--;
    }
  }
  
  return output;
  
}

