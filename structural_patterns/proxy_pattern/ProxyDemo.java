package proxy_pattern;

public class ProxyDemo {
	public static void main(String[]args)
	{
		CommandExecutorProxy proxy = new CommandExecutorProxy("admin","admin");
		proxy.run("rm --");
	}
}
