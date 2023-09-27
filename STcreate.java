public class STcreate {
    static int tree[];

    public static void init(int n){
        tree = new int[4*n];
    }

    public static int buildST(int arr[], int i, int start, int end){
        if(start==end){
            tree[i] = arr[start];
            return arr[start];
        }

        int mid = (start+end)/2;
        buildST(arr, 2*i+1, start, mid);
        buildST(arr, 2*i+2, mid+1, end);
        tree[i] = tree[2*i+1]+tree[2*i+2];
        return tree[i];
    }

    public static int getSumUtil(int i, int si, int sj, int qi, int qj){//O(lohn)
        //non overlap
        if(qj<=si || qi>=sj){
            return 0;
        }else if(si>=qi && sj<=qj){
            //complete overlap
            return tree[i];
        }else{//partial overlap
            int mid = (si+sj)/2;
            return (getSumUtil(2*i+1, si, mid, qi, qj)+getSumUtil(2*i+2, mid+1, sj, qi, qj));
        }
    }

    public static int getSum(int arr[], int qi, int qj){
        int n = arr.length;
        return getSumUtil(0, 0, n-1, qi, qj);
    }

    public static void updateUtil(int i, int si, int sj, int idx, int diff){//O(logn)
        if(idx<si || idx>sj){
            return;
        }

        tree[i]+=diff;
        if(si != sj){
            //non leaf update
            int mid = (si+sj)/2;
            updateUtil(2*i+1, si, mid, idx, diff);
            updateUtil(2*i+2, mid+1, sj, idx, diff);
        }
    }

    public static void update(int arr[], int idx, int newVal){
        int n = arr.length;
        int diff = newVal-arr[idx];
        arr[idx] = newVal;
        
        updateUtil(0, 0, n-1, idx, diff);//segment tree updation
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = arr.length;
        init(n);
        buildST(arr, 0, 0, n-1);

        // for(int i=0; i<tree.length; i++){
        //     System.out.print(tree[i]+" ");
        // }

        System.out.println(getSum(arr, 2, 5));//18
        update(arr, 2, 2);
        System.out.println(getSum(arr, 2, 5));//17
    }
}
