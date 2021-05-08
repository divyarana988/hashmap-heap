public static void main(String[] args) throws Exception {
    // write your code here
    
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int a[] = new int[n];
    
    for(int i=0; i<n; i++){
        a[i] = scn.nextInt();
    }
    
    HashMap<Integer, Boolean> hm = new HashMap<>();
    
    for(int val :a){
        hm.put(val, true);
    }
    
    for(Integer key: hm.keySet()){
        if(hm.containsKey(key - 1)){
            hm.put(key, false);
        }
    }
    
    int maxSeqSize = 0;
    int maxSP = -1;
    
    for(int i=0; i<a.length; i++){
        int key = a[i];
        
        if(hm.get(key)){
            int sp = key, size=1;
            
            while(hm.containsKey(sp+size)){
                size++;
            }
            
            if(size> maxSeqSize){
                maxSeqSize = size;
                maxSP = sp;
            }
        }
    }
    
    for(int i=maxSP; i<maxSP+maxSeqSize; i++){
        System.out.println(i);
    }
    
 }
