from collections import deque

class Queue:

    def __init__(self):
        self.buffer=deque()

    def enqueue(self,val):
        self.buffer.appendleft(val)

    def dequeue(self):
        return self.buffer.pop()

    def is_empty(self):
        return len(self.buffer)==0

    def size(self):
        return len(self.buffer)

if __name__ == "__main__":
    
    print("HELLO \n")

    q = Queue()

    q.enqueue({
            'Name': 'Erdinç',
            'Age' : '24'
        })

    q.enqueue({                                                                                                                                                                                 'Name': 'Emre',                                                                                                                                                                    'Age' : '21'                                                                                                                                                                    })

    print("Size of Queue : "+str(q.size()))
    print("Is Empty : "+str(q.is_empty()))
    q.dequeue()
    print("Size of Queue : "+str(q.size()))
    q.dequeue()
    print("Is Empty : "+str(q.is_empty()))

