public List<String> noLong(List<String> strings) {
  strings = strings.stream()
    .filter( str -> str.length() < 4)
    .collect(Collectors.toList());
    
  return strings;
}

