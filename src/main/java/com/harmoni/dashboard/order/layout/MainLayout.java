package com.harmoni.dashboard.order.layout;

import com.harmoni.dashboard.order.event.service.BroadcastMessageService;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.BeforeEnterObserver;

@CssImport("./styles/shared-styles.css")
public class MainLayout extends AppLayout implements BroadcastMessageService, BeforeEnterObserver {
    @Override
    public void beforeEnter(BeforeEnterEvent beforeEnterEvent) {

    }
}
