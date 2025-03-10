package Algorithm;

import java.util.*;

public  class DijkstraAlgorithm {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addEdge("A", "B", 1);
        graph.addEdge("A", "C", 4);
        graph.addEdge("B", "C", 2);
        graph.addEdge("B", "D", 5);
        graph.addEdge("C", "D", 1);

        System.out.println(graph.dijkstra("A"));
        // {A=0, B=1, C=3, D=4}
    }
     static class   Graph {
        private final Map<String, List<Node>> nodes = new HashMap<>();

        public void addEdge(String src, String dest, int weight) {
            nodes.putIfAbsent(src, new ArrayList<>());
            nodes.putIfAbsent(dest, new ArrayList<>());
            nodes.get(src).add(new Node(dest, weight));
        }

        public Map<String, Integer> dijkstra(String start) {
            PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(n -> n.cost));
            pq.add(new Node(start, 0));
            Map<String, Integer> distances = new HashMap<>();
            distances.put(start, 0);

            while (!pq.isEmpty()) {
                Node current = pq.poll();
                if (!nodes.containsKey(current.name)) continue;

                for (Node neighbor : nodes.get(current.name)) {
                    int newDist = distances.get(current.name) + neighbor.cost;
                    if (newDist < distances.getOrDefault(neighbor.name, Integer.MAX_VALUE)) {
                        distances.put(neighbor.name, newDist);
                        pq.add(new Node(neighbor.name, newDist));
                    }
                }
            }
            return distances;
        }

        static class Node {
            String name;
            int cost;
            Node(String name, int cost) { this.name = name; this.cost = cost; }
        }
    }

}

