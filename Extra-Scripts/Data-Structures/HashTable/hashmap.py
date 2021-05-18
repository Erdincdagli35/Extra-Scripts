class HashTable:
    def __init__(self):
        self.max=10
        self.arr=[None for i in range(self.max)]
    
    #Creating hashing method
    def get_hash(self,key):
        h=0
        for char in key:
            h+=ord(char)
        return h% self.max
    
    def add(self,key,value):
        h = self.get_hash(key)
        self.arr[h]=value
    
        
    
if __name__ == "__main__":
    ht=HashTable()
    ht.add("Erdinc",96)#71
    ht.add("Emre",99)#3
    ht.add("Me",1)#7

    print(ht.arr)
