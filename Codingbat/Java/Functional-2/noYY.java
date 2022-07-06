public List<String> noYY(List<String> strings) {
  strings = strings.stream()
    .map(str -> str + "y")
    .filter(str -> !str.contains("yy"))
    .collect(Collectors.toList());
    
  return strings;
}

