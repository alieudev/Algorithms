public List wordsWithoutList(String[] words, int len) {
  List<String> output = new ArrayList<String>();
  for(String word : words){
    if(word.length() != len) output.add(word);
  }
  return output;
}

