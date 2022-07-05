public List<String> moreY(List<String> strings) {
  strings = strings.stream()
    .map( str -> "y" + str + "y")
    .collect(Collectors.toList());
    
  return strings;
}

