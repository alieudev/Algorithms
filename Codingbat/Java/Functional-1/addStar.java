public List<String> addStar(List<String> strings) {
  strings = strings.stream()
    .map(str -> str + "*")
    .collect(Collectors.toList());
    
  return strings;
}

