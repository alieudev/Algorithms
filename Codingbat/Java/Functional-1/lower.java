public List<String> lower(List<String> strings) {
  strings = strings.stream()
    .map(str -> str.toLowerCase())
    .collect(Collectors.toList());
  
  return strings;
}

