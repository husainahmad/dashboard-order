package com.harmoni.dashboard.order;

import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.component.page.Push;
import com.vaadin.flow.shared.ui.Transport;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Push(transport = Transport.LONG_POLLING)
@SpringBootApplication
public class DashboardOrderApplication implements AppShellConfigurator  {

	public static void main(String[] args) {
		SpringApplication.run(DashboardOrderApplication.class, args);
	}

}
