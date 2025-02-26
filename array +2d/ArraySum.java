public class ArraySum {
    int arr[] = { 2, 5, 7, -1 };
    int x =9;

    for(
    int i = 0;i<=arr.length;i++)
    {
        for (int j = i + 1; j <= arr.length; j++) {
            if (arr[i] + arr[j] == x) {
                System.out.println(arr[i] + " " + arr[j]);
            }
        }
    }
}
