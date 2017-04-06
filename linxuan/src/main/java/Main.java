/**
 * Created by linxuan on 5/21/16.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    static int readInt(){
        String line = readLine();
        return parseInt(line);
    }

    static int[] readInts(){
        String line = readLine();
        StringTokenizer tokenizer = new StringTokenizer(line);
        int a1 = parseInt(tokenizer.nextToken());
        int a2 = parseInt(tokenizer.nextToken());

        return new int[]{a1,a2};
    }

    static String readLine(){
        try {
            return reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    static int parseInt(String string){
        return Integer.parseInt(string);
    }

    static class Solution{
        int N;
        int M;

        List<Integer>[] adjEdges;

        int[] rank;

        int[] ans;

        public Solution(){
            int[] ints = readInts();
            N = ints[0];
            M = ints[1];

            adjEdges = (List<Integer>[])new List[N];
            for(int i=0;i<N;i++){
                adjEdges[i] = new ArrayList<Integer>();
            }

            rank = new int[N];
            ans = new int[N];
        }

        public void readMap(){
            for(int i=0;i<M;i++){
                int[] ints = readInts();
                int a = ints[0]-1;
                int b = ints[1]-1;

                rank[b] ++;
                adjEdges[a].add(b);
            }
        }

        public void top(){
            boolean[] inQueue = new boolean[N];
            int inQueueNum = 0;
            PriorityQueue<Integer> queue = new PriorityQueue<Integer>(100,new Comparator<Integer>() {
                public int compare(Integer o1, Integer o2) {
                    return o2 - o1;
                }
            });

            int inAnsNum = 0;

            for(int i=0;i<N;i++){
                if(!inQueue[i] && rank[i] == 0){
                    queue.add(i);
                    inQueue[i] = true;
                    inQueueNum ++;
                }
            }

            while(inQueueNum < N){
                // all in queue so find one
                int id = queue.poll();
                ans[inAnsNum] = id;
                inAnsNum++;

                // clear the edge
                for(int i=0;i<adjEdges[id].size();i++){
                    int nextId = adjEdges[id].get(i);
                    rank[nextId] --;

                    if(rank[nextId] == 0 && !inQueue[nextId]){
                        queue.add(nextId);
                        inQueue[nextId] = true;
                        inQueueNum ++;
                    }
                }
            }

            int size = queue.size();
            for(int i=0;i<size;i++){
                ans[inAnsNum] = queue.poll();
                inAnsNum++;
            }
        }

        public void sum(){
            long sum = 0;
//            System.out.println(Arrays.toString(ans));
            int minId = Integer.MAX_VALUE;
            for(int i=0;i<ans.length;i++){
                if(minId > ans[i]){
                    minId = ans[i];
                }

                sum += minId;
            }

            sum += ans.length;
            System.out.println(sum);
        }
    }

    public static void main(String[] args) {
        int T = readInt();
        for(int i=0;i<T;i++){
            Solution solution = new Solution();
            solution.readMap();
            solution.top();
            solution.sum();
        }
    }
}

