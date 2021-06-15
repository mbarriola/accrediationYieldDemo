package com.example.yieldstreet;

import com.example.yieldstreet.registration.EurekaServer;
import com.example.yieldstreet.rest.accreditation.AccreditationServer;
import com.example.yieldstreet.web.WebServer;

public class Main {
	public static void main(String[] args) {

		String serverName = "";

		switch (args.length) {
		case 2:
			System.setProperty("server.port", args[1]);
		case 1:
			serverName = args[0].toLowerCase();
			break;

		default:
			return;
		}

		if (serverName.equals("eureka")) {
			EurekaServer.main(args);
		} else if (serverName.equals("accreditation")) {
			AccreditationServer.main(args);
		}  else if (serverName.equals("web")) {
			WebServer.main(args);
		} else {
			System.out.println("Unknown server type: " + serverName);
		}
	}
}
