// piece of data - val
//reference to next node - next

class Node{
    constructor(val){
        this.val = val;
        this.next = null;
    }
}

class SinglyLinkedList{
    constructor(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }
    push(val){
        let node = new Node(val);
        if (this.head == null){
           this.head = node; 
           this.tail = this.head;

        }
        else {
           this.tail.next = node;
           
        }
        this.length += 1;
        return this;
        
    }

    pop(val){
        let node = new Node(val); 
        if (head == null){
            return; 
        }
        else{ 
            
        }

    }

    shift(){

    }

    unshift(val){

    }

    get(val){

    }

    set(val){

    }

    insert(val){

    }

    remove(val){}

    reverse(){}
}

// var first = new Node("Hi")
// first.next = new Node("there")
// first.next.next = new Node("how")
// first.next.next.next = new Node("are")
// first.next.next.next.next = new Node("you")

var list = new SinglyLinkedList()
console.log(list)
list.push("HELLO")
console.log(list)
list.push("GOODBYE")
console.log(list)


