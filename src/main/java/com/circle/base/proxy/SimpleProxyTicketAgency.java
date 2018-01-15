package com.circle.base.proxy;

/**
 * 普通代理类
 */
public class SimpleProxyTicketAgency implements TicketAgency{

    private TicketAgency ticketAgency;

    public SimpleProxyTicketAgency(TicketAgency ticketAgency) {
        this.ticketAgency = ticketAgency;
    }

    @Override
    public void sold() {
        System.out.println("I am a proxy!");
        this.ticketAgency.sold();
    }

    public static void main(String[] args) {
        SimpleProxyTicketAgency simpleProxyTicketAgency = new SimpleProxyTicketAgency(new TrainStation());
        simpleProxyTicketAgency.sold();
    }
}
