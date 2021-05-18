class Node:
    def __init__(self ,data=None,next=None):
        self.data=data
        self.next=next

class LinkedList:
    def __init__(self):
        self.head=None
   
    #Inserting a node in linked list --> Big O : O(1)
    def insert_at_begining(self,data):
        node=Node(data,self.head)
        self.head=node
    #Inserting a node in linked list --> Big O : O(n)
    def insert_at_end(self,data):
        if self.head is None:
            self.node=Node(data,None)
            return
        iter =self.head
        while iter.next:
            iter=iter.next
        iter.next=Node(data,None)

    
    def print(self):
        if self.head is None:
            print("\nLinked List is empty ")
            return

        iter = self.head
        lListString =''

        while iter:
            lListString+=str(iter.data)+'---->' if iter.next else str(iter.data)
            iter=iter.next
        print(lListString)
    

    def get_len(self):
        count=0
        iter=self.head
        while iter:
            count+=1
            iter=iter.next
        return count

    #Removing a node in linked list --> Big O : O(1) 
    def remove_at_begining(self):
        if self.head != None:
            self.head=self.head.next
            return
        else: 
            return None
    #Removing a node in linked list --> Big O : O(n)
    def remove_at_end(self):
        newLast = self.head
        while (newLast.next.next):
            newLast=newLast.next 
        newLast.next=None
        return self.head
    #Removing a node in linked list --> Big O : O(n)
    def remove_at(self,index):
        if index<0 or index>=self.get_len():
            raise Exception("Invalid Index Sorry Bro :(")

        if index==0:
            self.head=self.head.next
            return

        count=0
        iter=self.head
        while iter:
            if count==index-1:
                iter.next=iter.next.next
                break
            iter=iter.next
            count+=1
    
    #Inserting a node in linked list --> Big O : O(n)
    def insert_at(self,index,data):
        if index<0 or index>self.get_len():
            raise Exception("Invalid Index Bro Sorry for about this")

        if index==0:
            self.insert_at_begining(data)
            return

        count=0
        iter=self.head
        while iter:
            if count == index-1:
                node = Node(data,iter.next)
                iter.next=node
                break

            iter=iter.next
            count+=1
    
    #Inserting a node in linked list --> Big O : O(n)
    def insert_at_middle(self,data):
        count =0
        iter=self.head
        while iter:
            if count==((self.get_len()/2)-1):
                node = Node(data,iter.next)
                iter.next=node
                break
            iter=iter.next
            count+=1

if __name__ == '__main__':
    
    print('Welcome to the LinkedList Example!\n')
    ll = LinkedList()
    
    ll.insert_at_begining(3)
    ll.insert_at_begining(35)
    ll.print()
    

    ll.insert_at_end(323)
    ll.insert_at_end(1)
    ll.print()

    print("Length of Linked List : ",ll.get_len())

    ll.remove_at(2)
    ll.print()

    ll.insert_at(3,55)
    ll.print()
    ll.insert_at(2,88)
    ll.print()

    ll.remove_at_begining()
    ll.print()

    ll.remove_at_end()
    ll.print()

    ll.insert_at_begining(2020)
    ll.print()
    ll.insert_at(2,15)
    ll.insert_at(3,12)
    ll.insert_at_middle(1996)
    ll.print()
                              

