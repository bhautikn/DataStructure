import java.util.*;
public class GraphHashList{
	public static void main(String[] args) {
		Map<Integer, List<Integer>> graph = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("For Exit Enetr -1");
		System.out.print("Enetr pair: ");
		while(true){
			int u = sc.nextInt();
			if (u == -1) break;
			int v = sc.nextInt();
			if(!graph.containsKey(u))
				graph.put(u, new ArrayList<Integer>());
			graph.get(u).add(v);
			System.out.print("Enter Another Pair: ");
		}
		System.out.println(graph);
	}
}