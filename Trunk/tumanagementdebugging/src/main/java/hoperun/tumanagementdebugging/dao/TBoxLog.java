package hoperun.tumanagementdebugging.dao;

import java.util.Date;

/**
 * TBox模拟器消息日志封装类
 * 
 * @author jiaxin
 *
 */
public class TBoxLog {
	
	private Date createTime;

	private String logLevel;
	
	private int index;
	
	private String msg;
	
	private static boolean changed = true;

	public static boolean isChanged() {
		return changed;
	}

	public static void setChanged(boolean changed) {
		TBoxLog.changed = changed;
	}

	public TBoxLog() {
		super();
	}
	public TBoxLog(int index,Date createTime, String logLevel, String msg) {
		super();
	    this.index = index;
		this.createTime = createTime;
		this.logLevel = logLevel;
		this.msg = msg;
	}
	
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getLogLevel() {
		return logLevel;
	}
	public void setLogLevel(String logLevel) {
		this.logLevel = logLevel;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

}
