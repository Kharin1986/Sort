package lesson7;

public class Main {
    public static void main(String[] args) {
        Graph graph= new Graph(20);
        graph.addEdge(1,2);
        graph.addEdge(1,4);
        graph.addEdge(4,7);
        graph.addEdge(2,5);
        graph.addEdge(7,8);
        graph.addEdge(8,9);
        graph.addEdge(5,3);
        graph.addEdge(9,10);
        graph.addEdge(8,6);
        graph.addEdge(10,3);
        graph.addEdge(5,6);



//           Graph
//      1---------------2      3-----------------
//      |               |     /                 |
//      |               |   /                   |
//      |               | /                     |
//      4               5-------6               10
//      |                     /                /
//      |                   /                /
//      |                 /                /
//      7---------------8---------------9
//
//
//
//




        BreadthFirstPaths bfp = new BreadthFirstPaths(graph,2);

        System.out.println(bfp.hasPathTo(11));
        System.out.println(bfp.pathTo(3));
        System.out.println(bfp.hasPathTo(7));
        System.out.println(bfp.distTo(10)); // кратчайший путь от 2 (source) до 10

    }
}
