import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class GraphImpl{
	Map<Integer,Node> nodesLookUp = new HashMap<Integer,Node>();
	
	
	static class Node{
		int id;
		List<Node> adjacentNodes = new LinkedList<Node>();
		
		Node(int id){
			this.id = id;
		}
	}
	
	private Node getNode(int id) {
		return null;
	}
	
	public void addEdge(int source, int destination) {
		Node s= getNode(source);
		Node v=getNode(destination);
		s.adjacentNodes.add(v);
	}
	
	public void hasPathDFS(int source, int destination) {
		Node s= getNode(source);
		Node v=getNode(destination);
		HashSet<Integer> visited = new HashSet<Integer>();
		boolean hasPath = hasPathDFS(s,v,visited);
	}
	
	private boolean hasPathDFS(Node s, Node v, HashSet<Integer> visited) {
		if(visited.contains(s.id))
			return false;
		visited.add(s.id);
		if(s == v)
			return true;
		
		for(Node child : s.adjacentNodes) {
			if(hasPathDFS(child,v,visited)) {
				return true;
			}
		}
		return false;
	}
	
	private boolean hasPathBFS(Node source, Node destination) {
		LinkedList<Node> nextToVisit = new LinkedList<Node>();
		HashSet<Integer> visited = new HashSet<Integer>();
		nextToVisit.add(source);
		
		while(!nextToVisit.isEmpty()) {
			
			Node newNode = nextToVisit.remove();
			if(newNode == destination) {
				return true;
			}
			
			if(visited.contains(newNode.id)) {
				continue;
			}
			visited.add(newNode.id);
			for(Node child : newNode.adjacentNodes)
				nextToVisit.add(child);
			
			
		}
		return false;
	}
	
}
