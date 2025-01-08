import java.util.*;

public class WebPageNavigation {

    public static int minClicks(List<List<Integer>> graph, int startPage, int endPage) {

        boolean[] visited = new boolean[graph.size()];

        int[] distance = new int[graph.size()];
        Arrays.fill(distance, -1);


        Queue<Integer> queue = new LinkedList<>();
        queue.add(startPage);
        visited[startPage] = true;
        distance[startPage] = 0;

        while (!queue.isEmpty()) {
            int currentPage = queue.poll();


            for (int nextPage : graph.get(currentPage)) {
                if (!visited[nextPage]) {
                    queue.add(nextPage);
                    visited[nextPage] = true;
                    distance[nextPage] = distance[currentPage] + 1;
                }
            }
        }


        return distance[endPage];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int N = scanner.nextInt();


        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }


        for (int i = 1; i <= N; i++) {
            int linkedPagesCount = scanner.nextInt();
            for (int j = 0; j < linkedPagesCount; j++) {
                int linkedPage = scanner.nextInt();
                graph.get(i).add(linkedPage);
            }
        }


        int startPage = scanner.nextInt();
        int endPage = scanner.nextInt();


        System.out.println(minClicks(graph, startPage, endPage));

        scanner.close();
    }
}
