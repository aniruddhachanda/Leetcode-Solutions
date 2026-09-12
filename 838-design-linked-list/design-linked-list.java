class MyLinkedList {
    int data;
    MyLinkedList next;
    int size;
    public MyLinkedList() {
        this.next=null;
        this.size=0;
    }
    public MyLinkedList(int data1){
        this.data=data1;
        this.next=null;
    }
    
    public int get(int index) {
        if(index<0||index>=size){
            return -1;
        }
        MyLinkedList temp=this.next;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp.data;
    }
    
    public void addAtHead(int val) {
        MyLinkedList node=new MyLinkedList(val);
        node.next=this.next;
        this.next=node;

        size++;
    }
    
    public void addAtTail(int val) {
        MyLinkedList node=new MyLinkedList(val);
        MyLinkedList temp=this;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index<0||index>size){
            return;
        }
        MyLinkedList node=new MyLinkedList(val);
        MyLinkedList temp=this;
        for(int i=0;i<index;i++){
           temp=temp.next;
        }
        node.next=temp.next;
        temp.next=node;

        size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index<0||index>=size){
            return;
        }
       if(index==0){
        this.next=this.next.next;
        size--;
        return;
       }
       MyLinkedList temp=this.next;
       for(int i=0;i<index-1;i++){
        temp=temp.next;
       }
       temp.next=temp.next.next;
       size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */