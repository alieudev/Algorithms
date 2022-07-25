public String altPairs(String str) {
  String output = ""; 
  for(int i=0; i<str.length(); i+= 4){
    int end = i + 2;
    if (end > str.length()){
      end = str.length();
    }
    output += str.substring(i, end);
  }
  return output;
}

