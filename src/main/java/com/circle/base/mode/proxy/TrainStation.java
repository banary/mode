package com.circle.base.mode.proxy;

/**
 * 火车站
 */
public class TrainStation implements TicketAgency {

    @Override
    public void sold() {
        System.out.println("This is TrainStation to sold a ticket!");
    }
}
