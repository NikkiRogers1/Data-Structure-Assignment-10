# Journal
Phase 1- Building the Network
I chose an Adjacency Matrix because we only have six cities, so it is easier to keep track of the connections in a table. The matrix shows every possible connection between the cities, including the ones that aren't connected. We can use -1 to identify when two cities don't have a direct connection. An adjacency list only shows the connections that exist, so the matrix makes it easier for us to see all the possible connections in our small network.

Phase 2- Connectivity check - BFS
The use of a Queue allows the BFS algorithm to explore the network level-by-level because it uses First In, First Out (FIFO). BFS adds nearby cities to the Queue and explores the cities that are already waiting before moving farther away. This allows BFS to explore the network level-by-level. 

Phae 3- Path Exploration - DFS
The main difference between BFS and DFS is the data structures they use to explore the graph. BFS uses a Queue, which follows First In, First Out (FIFO). This allows it to explore the cities closest to the starting city first before moving farther through the network. DFS uses a Stack, which follows Last In, First Out (LIFO). This allows it to follow one path as far as it can before going back and trying another path if it doesn't find the destination. Both can find whether a path exists, but they explore the network in different ways.

