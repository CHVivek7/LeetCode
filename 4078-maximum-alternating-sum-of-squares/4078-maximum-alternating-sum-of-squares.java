class Solution {
    public long maxAlternatingSum(int[] arr) {
        int n = arr.length;
        long sum = 0;
        int x = n / 2;

        for (int i = 0; i < n; i++) {
            arr[i] = Math.abs(arr[i]);
        }

        Arrays.sort(arr);
        arr = reverse(arr);

        for (int i = 0; i < x; i++) {
            sum += (arr[i] * arr[i]);
        }

        if (n % 2 == 1) {
            sum += (arr[x] * arr[x]);
            ++x;
        } else {
            sum -= (arr[x] * arr[x]);
            ++x;
        }

        for (int i = x; i < n; i++) {
            sum -= (arr[i] * arr[i]);
        }

        return sum;
    }

    public static int[] reverse(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }
}