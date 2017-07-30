public class quickFind{
  private int[] id;
  
  public quickFind(int N){
    id = new int[N];  // set of N objects ids
    for(int i = 0; i < N; i++)  // set id of each object to itself
      id[i] = i;
  }
  
  /** 
    check whether p and q are in the same component
  */
  public boolean connected(int p, int q)
  { return id[p] == id[q];}
  
  /**
    change all entries with id[p] to id[q] (at most 2N+2 array acceses)
  */
  public void union(int p, int q)
  {
    int pid
  }
}
