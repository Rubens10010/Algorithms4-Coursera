import java.util.*;
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
    int pid = id[p];
    int qid = id[q];
    for(int i = 0; i < id.length; i++)
      if (id[i] == pid) id[i] = qid;
  }
  
  public static void main(String[] args){
    
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    quickFind uf = new quickFind(N);
    while(scan.hasNextLine() && scan.hasNext()){
      int p = scan.nextInt();
      int q = scan.nextInt();
      if(!uf.connected(p,q)){
        uf.union(p,q);
        System.out.println(p + " " + q);
      }
    }
   
  }
}
