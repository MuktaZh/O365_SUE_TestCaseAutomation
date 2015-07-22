package o365_sue.test;

import o365_sue.core.ConfigBuilder;

public class Test {
	
	public static void main(String[] args) {
		ConfigBuilder builder = new ConfigBuilder();
		System.out.println(Attempt.Attempt);
		System.getProperties().list(System.out);
		
		builder.Driver.get("http://www.baidu.com");
	}

}
