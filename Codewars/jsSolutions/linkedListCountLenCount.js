function Node(data) {
  this.data = data;
  this.next = null;
}

function length(head) {
  // Your code goes here.
  let len = 0; 
  let curr = head
  while (curr !== null){
    len += 1; 
    curr = curr.next
  }
  return len;
}

function count(head, data) {
  // Your code goes here.
  let curr = head; 
  let counter = 0;
  while (curr !== null){
    if (curr.data === data){
      counter += 1;
    }
    curr = curr.next;
  }
  return counter;
}
