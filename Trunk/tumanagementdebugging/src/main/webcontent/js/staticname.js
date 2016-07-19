/*服务名称*/
var getServiceName = function(serviceName){
	switch(serviceName){
	   case "Register": return "注册绑定";
	   case "Login" : return "登录";
	   case "Logout" : return "登出";
	   case "Relogin" : return "重新登录";
	   case "Hartbeat" : return "取消息心跳";
	   case "ReadConfig" : return "配置读取";
	   case "ConfigSet" : return "配置下发";
	   case "Upgrade" : return "版本升级";
	   case "Linkhold" : return "通讯保持";
	   default : return "未知服务";
	}
};

/*ResultCode*/
var getResultCode = function(resultCode){
	switch(resultCode){
	   case "1110000000": return "Vin错误, 找不到CRM信息";
	   case "1100010000" : return "T-Box已经注册";
	   case "1100001000" : return "预设密钥错误";
	   case "1100000100" : return "T-BoxSN错误";
	   case "1100000010" : return "IMSI错误";
	   case "1100000001" : return "ICCID错误";
	   case "2110000000" : return "bid错误,找不到CRM信息";
	   case "2100000010" : return "未注册";
	   case "2100000001" : return "T-BoxSN错误";
	   case "6300000010" : return "otaUpgradeAck错误";
	   case "6300000011" : return "otaUpgradeAck长度错误";
	   case "6600000010" : return "升级失败，升级版本与TBOX当前版本一致，不执行升级";
	   case "6600000001" : return "升级失败，执行升级过程异常";
	   case "6600000011" : return "升级失败，升级版本小于TBOX当前版本，不执行升级";
	   case "6600000100" : return "升级失败，回滚到默认初始版本成功";
	   case "6600000101" : return "升级失败，回滚到默认初始版本失败";
	   default : return "未知错误";
	}
};