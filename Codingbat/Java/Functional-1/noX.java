public List<String> noX(List<String> strings) {
  strings = strings.stream()
    .map(str -> str.replaceAll("x", ""))
    .collect(Collectors.toList());
  return strings;

}

