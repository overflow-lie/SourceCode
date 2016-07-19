package net.sirun.queue;

import net.sirun.bean.DSPTTaskBean;

public interface MsgTask {

	/**
	 * 创建一个任务
	 * 
	 * @return
	 */
	public DSPTTaskBean createTask();

	/**
	 * 发送任务到队列项目
	 * 
	 * @param dtb
	 * @return
	 */

	public DSPTTaskBean pushTask(DSPTTaskBean dtb);

	/**
	 * 同步回去结果,在没有结果发回前hold住
	 */
	public DSPTTaskBean getSyncResult(String key);

	/**
	 * 异步获取结果,在没有结果发回前hold住
	 */
	public DSPTTaskBean getAsyncResult(String key);

}
