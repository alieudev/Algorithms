class Node():
    def __init__(self, val) -> None:
        self.val = val
        self.next = None

    def __repr__(self):
        return self.val

class LinkedList():
    def __init__(self) -> None:
        self.head = None
        self.tail = None
        self.length = 0

    def __repr__(self):
        node = self.head
        nodes = []
        while node is not None:
            nodes.append(node.val)
            node = node.next
        nodes.append("None")
        return " -> ".join(nodes)
    
    def push(self, val):
        newNode = Node(val)
        if self.head == None:
            self.head = newNode
            self.tail = newNode
        else:
            self.tail.next = newNode
            self.tail = newNode
        self.length += 1
        return self

a = LinkedList()
a.push("a")
a.push('b')
a.push("c")
print(a)
