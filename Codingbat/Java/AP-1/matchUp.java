public int matchUp(String[] a, String[] b) {
  int count = 0;
  if(a.length < 1 || b.length < 1) return 0;
  else {
    for(int i=0; i<a.length; i++){
      if(!(a[i]=="" || b[i]=="")){
        if(a[i].charAt(0) == b[i].charAt(0)){
        count += 1;
        }
      } 
    }
    return count;
  }
}

