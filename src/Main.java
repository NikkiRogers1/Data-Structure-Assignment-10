public class Main {
   public static void main(String[] args) {
       
    WeightedGraph<String> route = new WeightedGraph<>();
    route.addVertex("New York");
    route.addVertex("Chicago");
    route.addVertex("Denver");
    route.addVertex("Los Angeles");
    route.addVertex("Seattle");
    route.addVertex("Miami");

    route.addEdge("New York", "Chicago", 150);
    route.addEdge("Chicago", "Denver", 300);
    route.addEdge("Denver", "Los Angeles",250);
    route.addEdge("New York","Miami",400);

    System.out.println("Cities in route: "  + route.cities);

    for (int i = 0; i<6; i++ ){

        for ( int j = 0; j<6; j++) {
       System.out.print(route.adjMatrix[i][j] + " ");

    }

           System.out.println();
   }

   System.out.println("----Phase 2 Testing BFS ----");

   System.out.println("NewYork to Los Angeles: " + route.BFS("New York", "Los Angeles" ));
   System.out.println("Seattle to Miami: " + route.BFS("Seattle", "Miami"));

   System.out.println("---Phase 3 Testing DFS----");
   System.out.println("New York to Los Angeles: " + route.DFS("New York", "Los Angeles"));

   System.out.println("Seattle to Miami: " + route.DFS("Seattle", "Miami"));


   System.out.println("-----Phase 4 testing-----");

   System.out.println("--- Manual testing ----");
   System.out.println("Miami to Denver: " + route.BFS("Miami", "Denver"));
   System.out.println("Miami to Denver: " + route.DFS("Miami", "Denver"));

   System.out.println("----Edge Case testing----");

   System.out.println("Seattle to Los Angeles: " + route.BFS("Seattle", "Los Angeles"));
   System.err.println("Seattle to Los Angeles: " + route.DFS("Seattle", "Los Angeles"));


   WeightedGraph<String> otherRoute = new WeightedGraph<>();

   otherRoute.addVertex("New York");
   otherRoute.addVertex("Chicago");

   otherRoute.addEdge("New York", "Chicago", 150);


   System.out.println("Cities in new route: " + otherRoute.cities);
    System.out.println("New York to Chicago: " + otherRoute.BFS("New York", "Chicago"));
    System.out.println("New York to Chicago: " + otherRoute.DFS("New York", "Chicago"));

    WeightedGraph<String> testRoute = new WeightedGraph<>();

    testRoute.addVertex("New York");
    testRoute.addVertex("Chicago");
    testRoute.addVertex("Denver");
    testRoute.addVertex("Los Angeles");
    testRoute.addVertex("Miami");
   

    testRoute.addEdge("New York", "Chicago", 150);
    testRoute.addEdge("Chicago", "Miami", 300);
    testRoute.addEdge("New York", "Denver", 200);
    testRoute.addEdge("Denver", "Los Angeles", 250);
    testRoute.addEdge("Los Angeles", "Miami", 400);


    System.out.println("New York to Miami: " + testRoute.BFS("New York", "Miami"));
    System.out.println("New York to Miami: " + testRoute.DFS("New York", "Miami"));

}
}