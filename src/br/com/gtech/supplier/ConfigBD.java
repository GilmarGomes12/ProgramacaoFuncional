package br.com.gtech.supplier;

public class ConfigBD {

	private String host;
	private String port;

	public ConfigBD(String host, String port) {
		super();
		this.host = host;
		this.port = port;
	}

	public ConfigBD(String host2, int i) {
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

}
