import java.util.*;
import java.io.*;

/**
 * KruskalAlgo
 */
public class KruskalAlgo {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of vertices : ");
        int v = Integer.parseInt(br.readLine());
        System.out.println("Enter number of Edges : ");
        int e = Integer.parseInt(br.readLine());

        int[][] edges = new int[e][3];

        System.out.println("Enter edges (src,nbr,wt) : ");
        for (int i = 0; i < e; i++) {
            String[] st = br.readLine().split(" ");
            edges[i][0] = Integer.parseInt(st[0]);
            edges[i][1] = Integer.parseInt(st[1]);
            edges[i][2] = Integer.parseInt(st[2]);
        }

        MST(v, edges);
    }

    static int[] parent;
    static int[] rank;

    public static class Pair implements Comparable<Pair> {
        int u;
        int v;
        int wt;

        Pair(int u, int v, int wt) {
            this.u = u;
            this.v = v;
            this.wt = wt;
        }

        @Override
        public int compareTo(Pair o) {
            return this.wt - o.wt;
        }
    }

    public static void MST(int n, int[][] pipes) {

        Pair[] arr = new Pair[pipes.length];
        for (int i = 0; i < pipes.length; i++) {
            arr[i] = new Pair(pipes[i][0], pipes[i][1], pipes[i][2]);
        }
        Arrays.sort(arr);
        parent = new int[n];
        rank = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 1;
        }
        int ans = 0;
        System.out.println("-- MST using Kruskal algo --");
        System.out.println("Edges\tWeight");
        for (int i = 0; i < arr.length; i++) {
            boolean flag = union(arr[i].u, arr[i].v);
            if (flag) {
                System.out.println(arr[i].u + "-" + arr[i].v + "\t" + arr[i].wt);
            }
        }

    }

    public static int find(int x) {
        if (parent[x] == x)
            return x;
        int temp = find(parent[x]);
        parent[x] = temp;
        return temp;
    }

    public static boolean union(int x, int y) {
        int lx = find(x);
        int ly = find(y);
        if (lx != ly) {
            if (rank[lx] > rank[ly]) {
                parent[ly] = lx;
            } else if (rank[lx] < rank[ly]) {
                parent[lx] = ly;
            } else {
                parent[lx] = ly;
                rank[ly]++;
            }
            return true;

        } else {
            return false;
        }
    }
}