public String startWord(String str, String word) {
  
  if (str.length() == 0) return ""; 
  
  if(word.length() > str.length()) return ""; 
  
  if (str.length() == 1) return str;
  
  int len = word.length(); 
  if(str.substring(1,len).equals(word.substring(1,len))) 
    return str.substring(0, len);
  
  
  return "";
}

