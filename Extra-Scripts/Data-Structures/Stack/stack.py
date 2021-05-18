from collections import deque 

class Stack:
    def __init__(self):
        self.container = deque()

    def push(self,val):
        self.container.append(val)

    def pop(self):
        return self.container.pop()

    def peek(self):
        return self.container[-1]

    def is_empty(self):
        return len(self.container)==0

    def size(self):
        return len(self.container)
    
    def printStack(self):
        for i in range(self.size()-1,-1,-1):
            print(self.container[i])

    def reverse_string(self,text):
        for i in range(0,len(text)) :
            self.push(text[i])
        #self.printStack()
#Push/ Pop element : O(1)                                                          #Search element by value : O(n)

if __name__ == "__main__":

    s = Stack()
    s.push(5)
    s.push(11)
    s.push(33)
    s.push(3)
    print("Peek"+str(s.peek()))
    
    print("\n\nPrint Stack \n")
    s.printStack()
    
    print("\n\nDeleted Last Element")
    s.pop()
    s.printStack()
    print("\n\nSize of Stack : "+str(s.size()))
    print("\n\nIs Empty : "+str(s.is_empty()))
    
    print("\n\nDeleted All Element at Stack")
    s.pop()
    s.pop()
    s.pop()
    print("\n\nSize of Stack : "+str(s.size()))    
    print("\n\nIs Empty : "+str(s.is_empty()))

    s.reverse_string("Erdinç")
    s.printStack()
    #print("\n\n Erdinç : reverse_string('Erdinç'):"+str(s.printStack()))

