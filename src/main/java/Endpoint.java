import javaslang.collection.Array;
import javaslang.collection.HashMap;
import javaslang.collection.List;
import javaslang.collection.Map;

public class Endpoint {

	public int id;
	
	public int dcLatency;
	
	public Map<Cache, Integer> cacheLatencies = HashMap.empty();

	public Array<Request> requests = Array.empty();

	public Endpoint(int i) {
		id = i;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Endpoint endpoint = (Endpoint) o;

		return id == endpoint.id;
	}

	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public String toString() {
		return "#" + id + " dcLat: " + dcLatency + "; ";
	}
}
