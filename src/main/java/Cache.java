import javaslang.collection.HashMap;
import javaslang.collection.HashSet;
import javaslang.collection.Map;
import javaslang.collection.Set;

public class Cache {

	public int id;
	
	public int load;
	
	public Map<Endpoint, Integer> endpointLatencies = HashMap.empty();
	
	public Set<Integer> videos = HashSet.empty();

	public java.util.Map<Endpoint, Integer> jlat = new java.util.HashMap<>();

	public Cache(int i) {
		id = i;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Cache cache = (Cache) o;

		return id == cache.id;
	}

	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public String toString() {
		return "#" + id + " load: " + load + "; ";
	}

	
}
