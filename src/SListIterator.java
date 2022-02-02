public class SListIterator<T> {
    SList<T> head;
    SList<T> tail;
    SList<T> curr;

    public SListIterator(SList<T> obj){
        this.head=obj;
        this.tail=obj;
        this.curr=obj;
    }

    public void insert(T data){
        SList<T> n=new SList<>(data);
        if(head==null){
            head=n;
            tail=n;
            curr=n;
        }
        else{
            tail.next=n;
            tail=n;
        }
    }

    public void remove(){
        if(head==null) {
            System.out.println("List empty");
        }
        else{
            System.out.println("Removed Element "+head.data);
            if(curr==head){
                curr=curr.next;
            }
            head=head.next;
        }
    }

    public boolean hasNext(){
        return curr!=null;
    }

    public T next(){
        T temp= curr.data;
        curr=curr.next;
        return temp;
    }

}
