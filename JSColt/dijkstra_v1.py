class PriorityQueue: 
    def __init__(self) -> None:
        self.values = []
    
    def enqueue(self, val, priority):
        self.values.append({val, priority})
        self.sort()
    
    def dequeue():
        return this.values.shift(0)
    
