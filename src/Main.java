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

   System.out.println("----Phase 2 Testing----");

   System.out.println("NewYork to Los Angeles: " + route.BFS("New York", "Los Angeles" ));
   System.out.println("Seattle to Miami: " + route.BFS("Seattle", "Miami"));
}
}