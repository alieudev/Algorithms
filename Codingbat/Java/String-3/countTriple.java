public int countTriple(String str) {
  
  int count = 0; 
  
  if(str.length() < 3) return 0; 
  
  for(int i = 0; i < str.length()-3; i++){
    
    if(str.substring(i, i+1).equals(str.substring(i+1, i+2)) && 
    str.substring(i+1, i+2).equals(str.substring(i+2, i+3)))
    
      count++; 
    
  }
  
  int len = str.length(); 
  
  if( str.substring(len-1, len).equals(str.substring(len-2,len-1)) 
    && str.substring(len-2,len-1).equals(str.substring(len-3,len-2)) ) 
      count++;
  
  return count;
  
}

