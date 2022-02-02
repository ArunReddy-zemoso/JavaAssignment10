public class Main {
    public static void main(String[] args) {
        SList<Integer> linkedList=new SList<>(1);
        SListIterator<Integer> iterator=linkedList.iterator();
        iterator.insert(2);
        iterator.insert(3);
        iterator.insert(4);
        iterator.insert(5);
        System.out.println(linkedList.toString());

        iterator.remove();
        iterator.remove();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
