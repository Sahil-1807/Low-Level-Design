package Services;

import Entity.Order;

import java.util.concurrent.RejectedExecutionHandler;

public class ExchangeConnector {
    private ExchangeConnector(){};

    private static class Helper{
        private static final ExchangeConnector intance = new ExchangeConnector();
    }

    public static ExchangeConnector getInstance(){
        return Helper.intance;
    }

    public void sendOrderToExchange(String userId, Order order){
        System.out.println("order sent to exchange for execution.");
    }
}
