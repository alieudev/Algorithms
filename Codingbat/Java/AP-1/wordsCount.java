public int wordsCount(String[] words, int len) {
  int count = 0; 
  for(String str : words){
    if(str.length() == len) count++;
  }
  return count;
}
