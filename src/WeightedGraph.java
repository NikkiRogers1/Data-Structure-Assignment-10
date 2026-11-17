import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class WeightedGraph <T> {

    ArrayList<T> cities = new ArrayList<>();
    int [][] adjMatrix;

    public WeightedGraph() {

        adjMatrix = new int[6][6];

        for(int i = 0; i<6;i++) {

            for(int j = 0; j<6; j++) {

                adjMatrix[i][j] = -1;
            }
        }
    
    }
    public void addVertex(T city){
        cities.add(city);


    }
    public void addEdge(T city1, T city2, int fuel) {

        int index1 = cities.indexOf(city1);
        int index2 = cities.indexOf(city2);

        adjMatrix[index1][index2] = fuel;
        adjMatrix[index2][index1] = fuel;
    }

    public boolean BFS(T startVertex, T endVertex){
        int startIndex = cities.indexOf(startVertex);
        int endIndex = cities.indexOf(endVertex); 

        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(startIndex);

        boolean[] visited = new boolean[6];

        visited[startIndex] = true;

        while(!queue.isEmpty()){
            int current;
            current = queue.remove();

            if (current == endIndex){
                return true;
            }
            for(int j = 0; j < 6; j++) {
                if(adjMatrix[current][j] != -1 && visited[j] == false){
                    
                    queue.add(j);
                    visited[j] = true;
                }

            }
        }
        return false;
    }
}
