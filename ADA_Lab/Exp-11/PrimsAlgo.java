import java.io.*;
import java.util.*;

public class PrimsAlgo {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter number of vertices :");
        int vtces = Integer.parseInt(br.readLine());
        ArrayList<Edge>[] graph = new ArrayList[vtces];
        for (int i = 0; i < vtces; i++) {
            graph[i] = new ArrayList<>();
        }
        System.out.println("Enter number of edges :");
        int edges = Integer.parseInt(br.readLine());

        System.out.println("Enter edges (src,nbr,wt) :");
        for (int i = 0; i < edges; i++) {
            String[] parts = br.readLine().split(" ");
            int v1 = Integer.parseInt(parts[0]);
            int v2 = Integer.parseInt(parts[1]);
            int wt = Integer.parseInt(parts[2]);
            graph[v1].add(new Edge(v1, v2, wt));
            graph[v2].add(new Edge(v2, v1, wt));
        }

        // write your code here
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        boolean visited[] = new boolean[vtces];
        pq.add(new Pair(0, -1, 0));
        System.out.println("-- MST using Prims algo --");
        System.out.println("Edges\tWeights");
        while (pq.size() > 0) {
            Pair rem = pq.remove();
            if (visited[rem.v] == true)
                continue;
            visited[rem.v] = true;
            if (rem.from != -1)
                System.out.println(rem.v + "-" + rem.from + "\t" + rem.wt);

            for (Edge e : graph[rem.v]) {
                if (visited[e.nbr] == false) {
                    pq.add(new Pair(e.nbr, rem.v, e.wt));
                }
            }

        }

    }

    static class Edge {
        int src;
        int nbr;
        int wt;

        Edge(int src, int nbr, int wt) {
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
        }
    }

    public static class Pair implements Comparable<Pair> {
        int v;
        int from;
        int wt;

        Pair(int v, int from, int wt) {
            this.v = v;
            this.from = from;
            this.wt = wt;
        }

        public int compareTo(Pair o) {
            return this.wt - o.wt;
        }
    }

}