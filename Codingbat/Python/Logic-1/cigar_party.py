def cigar_party(cigars, is_weekend):
  if not is_weekend: 
    return cigars >= 40 and cigars <= 60 
  if is_weekend: 
    return cigars >= 40 
