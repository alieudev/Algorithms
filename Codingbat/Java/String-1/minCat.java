public String minCat(String a, String b) {
  int len = Math.min(a.length(), b.length()); 
  
  if(a.length() == b.length()) return a + b; 
  
  else if (a.length() > b.length()) { 
    return a.substring(a.length()-len) + b;
  } else {
    return a + b.substring(b.length()-len);
  }
}

