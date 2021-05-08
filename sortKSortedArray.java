 public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      int[] arr = new int[n];

      for (int i = 0; i < n; i++) {
         arr[i] = Integer.parseInt(br.readLine());
      }

      int k = Integer.parseInt(br.readLine());
      // write your code here
      
      int a[] = sort(arr, k);
      
      for(int i=0; i<a.length; i++){
          System.out.println(a[i]);
      }
   }
   
   public static int[] sort (int arr[], int k){
       
       PriorityQueue<Integer> pq = new PriorityQueue<>();
       int temp =0;
       int res[] = new int[arr.length];
       
       for(int i=0; i<arr.length; i++){
           
           if(pq.size()<k+1){
               pq.add(arr[i]);
           }else{
               res[temp] = pq.remove();
               pq.add(arr[i]);
               temp++;
           }
       }
       
       while(pq.size()>0){
           res[temp] = pq.remove();
           temp++;
       }
       return res;
   }