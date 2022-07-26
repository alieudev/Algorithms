def make_out_word(out, word):
  fh = out[:len(out)/2]
  lh = out[len(out)/2 :]
  return fh + word + lh
