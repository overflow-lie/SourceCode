package hoperun.proxyserver.service.httppage;
public class ClientBean {
	private String token;
	private long clientsend;
	private long serverReceive;
	private long serverCallback;
	private long clientReceive;
	private long total;
	private String error;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public long getClientsend() {
		return clientsend;
	}

	public void setClientsend(long clientsend) {
		this.clientsend = clientsend;
	}

	public long getServerReceive() {
		return serverReceive;
	}

	public void setServerReceive(long serverReceive) {
		this.serverReceive = serverReceive;
	}

	public long getServerCallback() {
		return serverCallback;
	}

	public void setServerCallback(long serverCallback) {
		this.serverCallback = serverCallback;
	}

	public long getClientReceive() {
		return clientReceive;
	}

	public void setClientReceive(long clientReceive) {
		this.clientReceive = clientReceive;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

}
