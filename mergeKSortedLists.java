public static class Pair implements Comparable<Pair>{
        int li, di, val;
        
        Pair(int li, int di, int val){
             this.li = li;
             this.di = di;
             this.val = val;
        }
        
        public int compareTo(Pair o){
            //min on the basis of val.
            return this.val - o.val;
        }
    }
    
    
   public static ArrayList<Integer> mergeKSortedLists(ArrayList<ArrayList<Integer>> lists){
      ArrayList<Integer> rv = new ArrayList<>();
      
      PriorityQueue<Pair> pq = new PriorityQueue<>();
      
      for(int i=0; i<lists.size(); i++){
          pq.add(new Pair(i, 0, lists.get(i).get(0)));
      }
      
      while(pq.size()>0){
          Pair minPair = pq.remove();
          rv.add(minPair.val);
          
          if(minPair.di+1<lists.get(minPair.li).size()){
              
              minPair.di = minPair.di+1;
              minPair.val = lists.get(minPair.li).get(minPair.di);
              
              pq.add(minPair);
          }
      }

      return rv;
   }