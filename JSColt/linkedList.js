class Node {
    constructor(val) {
        this.val = val; 
        this.next = null; 

    }
}

class SinglyLinkedList {

     constructor() {
        this.head = null; 
        this.tail = null; 
        this.height = 0;
    }

    push(val) {
        let newNode = new Node(val);
        if (!this.height) {
            this.head = newNode;
            this.tail = this.head; 
        } else {
            this.tail.next = newNode;
            this.tail = newNode; 
        }
        this.height++; 
        return this; 
    }
}

let list = new SinglyLinkedList()
console.log(list)
list.push('alieu')
list.push('baldeh')
list.push('emily')
list.push('sylva')
console.log('******************')
console.log('after adding 4 items to the list')
console.log(list.height)
console.log(list)
console.log('HEAD is: ')
console.log(list.head)
console.log('Tail is: ')
console.log(list.tail)
