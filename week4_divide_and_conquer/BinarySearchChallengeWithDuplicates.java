package week4_divide_and_conquer;

public class BinarySearchChallengeWithDuplicates {


    //linear search internal
    static int binarySearch(int[] a, int x) {
        int left = 0, right = a.length-1;
        while (left<=right) {
            int mid= left + ((right - left)/2);
            if(a[mid] == x) {
                if (mid == 0) mid=mid;
                else {
                    while (a[mid-1] == x) mid= mid-1;
                }
                return mid;
            }
            else if (x<a[mid]) right= mid - 1;
            else left= mid+1;
        }
        return -1;

    }



//    static int linearSearch(int[] a, int x) {
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] == x) return i;
//        }
//        return -1;
//    }

    public static void main(String[] args) {
//        FastScanner scanner = new FastScanner(System.in);
//        //entering length of x array
//        int n = scanner.nextInt();
//        //entering x array
//        int[] a = new int[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = scanner.nextInt();
//        }
//        //entering length of q array
//        int m = scanner.nextInt();
//        //entering q array
//        int[] b = new int[m];
//        for (int i = 0; i < m; i++) {
//            b[i] = scanner.nextInt();
//        }
        int[] x= {2,4,4,4,7,7,9};
        int[] q= {9,4,5,2};
        for (int i = 0; i < q.length; i++) {
            //replace with the call to binarySearch when implemented
            System.out.print(binarySearch(x, q[i]) + " ");
        }
    }
//    static class FastScanner {
//        BufferedReader br;
//        StringTokenizer st;
//
//        FastScanner(InputStream stream) {
//            try {
//                br = new BufferedReader(new InputStreamReader(stream));
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//
//        String next() {
//            while (st == null || !st.hasMoreTokens()) {
//                try {
//                    st = new StringTokenizer(br.readLine());
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//            return st.nextToken();
//        }
//
//        int nextInt() {
//            return Integer.parseInt(next());
//        }
//    }
}
