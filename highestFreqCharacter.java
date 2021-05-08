public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        String inp = scn.nextLine();
        
        HashMap<Character, Integer> hm = new HashMap<>();
        
        for(int idx=0; idx<inp.length(); idx++){
            char ch = inp.charAt(idx);
            
            if(hm.containsKey(ch)){
                hm.put(ch, hm.get(ch)+1);
            }else{
                hm.put(ch, 1);
            }
        }
        
        char maxFreqCh = ' ';
        int maxFreq = 0;
        
        for(Character key : hm.keySet()){
            int freq = hm.get(key);
            if(freq > maxFreq){
                maxFreq = freq;
                maxFreqCh = key;
            }
        }
        
        System.out.println(maxFreqCh);
    }
