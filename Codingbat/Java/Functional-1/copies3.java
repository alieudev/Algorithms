public List<String> copies3(List<String> strings) {
  strings.replaceAll( str -> str + str + str);
  return strings;
}


