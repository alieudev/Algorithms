public String[] wordsWithout(String[] words, String target) {
  ArrayList<String> list = new ArrayList<>();
  for(String word : words){
    if (!word.equals(target)) list.add(word);
  }
  String[] array = list.toArray(new String[list.size()]);
  return array;
}

