public class SList<T> {
    T data;
    SList<T> next;
    public SList(T data){
        this.data=data;
        next=null;
    }

    public SListIterator<T> iterator(){
        return new SListIterator<>(this);
    }

    public String toString(){
        SListIterator<T> iterator=this.iterator();
        StringBuilder st= new StringBuilder("[ ");
        while (iterator.hasNext()){
            st.append(iterator.next());
            if(iterator.hasNext())
                st.append(" -> ");
        }
        st.append(" -> null ]");
        return st.toString();
    }

}
