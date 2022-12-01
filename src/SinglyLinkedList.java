public class SinglyLinkedList {

    public static int compareLists(SinglyLinkedListNode llist1, SinglyLinkedListNode llist2) {
        while (llist1 != null && llist2 != null) {
            if (llist1.data != llist2.data) {
                return 0;
            }
            llist1 = llist1.next;
            llist2 = llist2.next;
        }
        return (llist1 == null && llist2 == null) ? 1 : 0;
    }

    //It also can be done recursively
    /*
    public static int compareListsRecursively(SinglyLinkedListNode llist1,SinglyLinkedListNode llist2)
    {
        {
            if (llist1 == null && llist2 == null) return 1;
            else if (llist1 == null || llist2 == null) return 0;
            else if (llist1.data != llist2.data) return 0;
            else return compareLists(llist1.next, llist2.next);
        }
    }
    */
}
