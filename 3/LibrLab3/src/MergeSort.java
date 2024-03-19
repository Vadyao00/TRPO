import java.util.Arrays;
class LibrLab3{
    public static void Merge(int[] a, int lo, int hi)
    {
        if (hi <= lo)
            return;
        int mid = lo + (hi - lo) / 2;
        Merge(a, lo, mid);
        Merge(a, mid + 1, hi);

        int[] buf = Arrays.copyOf(a, a.length);

        for (int k = lo; k <= hi; k++)
            buf[k] = a[k];

        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {

            if (i > mid) {
                a[k] = buf[j];
                j++;
            } else if (j > hi) {
                a[k] = buf[i];
                i++;
            } else if (buf[j] < buf[i]) {
                a[k] = buf[j];
                j++;
            } else {
                a[k] = buf[i];
                i++;
            }
        }
    }
}