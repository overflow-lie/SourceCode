package hoperun.proxyserver.bean;

/**
 * 记载文件及相关信息
 * 
 * @author jnad
 * 
 */
public class FileInfo {
	private String fileName;
	private String size;
	private String type;
	private byte[] content;

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public byte[] getContent() {
		return content;
	}

	public void setContent(byte[] content) {
		this.content = content;
	}



}
