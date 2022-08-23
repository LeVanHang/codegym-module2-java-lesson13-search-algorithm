package binary_search;


public class BinaryNotRecurssionTest {
    public static void main(String[] args) {
        System.out.println(BinaryNotRecursion.binarySearch(BinaryNotRecursion.list, 2));  /* 0 */
        System.out.println(BinaryNotRecursion.binarySearch(BinaryNotRecursion.list, 11)); /* 4 */
        System.out.println(BinaryNotRecursion.binarySearch(BinaryNotRecursion.list, 79)); /*12 */
        System.out.println(BinaryNotRecursion.binarySearch(BinaryNotRecursion.list, 1));  /*-1 */
        System.out.println(BinaryNotRecursion.binarySearch(BinaryNotRecursion.list, 5));  /*-1 */
        System.out.println(BinaryNotRecursion.binarySearch(BinaryNotRecursion.list, 80)); /*-1 */
    }
}