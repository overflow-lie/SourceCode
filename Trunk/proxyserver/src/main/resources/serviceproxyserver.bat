rem #本脚本作为启动java程序的独立脚本使用
rem #
rem #Author: jnad, Date: 2014/10/16
rem #

echo off
set RUN_CLASS=hoperun.proxyserver.bin.ProxyServerBootstrap
set JAVA_HOME=C:\Program Files\Java\jre7
echo set _CP=%%_CP%%;%%1> cp.bat
set _CP=.;\classes;classes\;"%JAVA_HOME%\lib\dt.jar";"%JAVA_HOME%\lib\tools.jar"
for %%i in (lib\*.jar) do call cp.bat %%i
set CLASSPATH=%_CP%
del cp.bat
echo %CLASSPATH%
set JAVA_OPTION=-Dfile.encoding=GBK -Xms256m -Xmx256m -XX:MaxPermSize=64m
"%JAVA_HOME%\bin\java" %JAVA_OPTION% -classpath %CLASSPATH% %RUN_CLASS%  > log/runlog.log 2>&1 & "