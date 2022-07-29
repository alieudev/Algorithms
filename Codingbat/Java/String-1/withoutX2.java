public String withoutX2(String str) {
  if(str.length() == 0 || str.length() == 1) return "";
  
  if(str.substring(0,1).equals("x") && str.substring(1,2).equals("x")) {
    return str.substring(2);
  } else if (str.substring(0,1).equals("x")) {
    return str.substring(1);
  } else if (str.substring(1,2).equals("x")){
    return str.substring(0,1) + str.substring(2);
  } else {
    return str;
  }
}

