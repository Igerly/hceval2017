
public class Request {

	public int video;
	public int endpoint;
	public int count;
	
	public Request(int video, int endpoint, int count) {
		super();
		this.video = video;
		this.endpoint = endpoint;
		this.count = count;
	}

	@Override
	public String toString() {
		return "Request [video=" + video + ", endpoint=" + endpoint + ", count=" + count + "]";
	}

}
