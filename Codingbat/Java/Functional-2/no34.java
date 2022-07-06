public List<String> no34(List<String> strings) {
  strings = strings.stream()
    .filter(str -> str.length() != 3 && str.length() != 4)
    .collect(Collectors.toList());
    
  return strings;
}

