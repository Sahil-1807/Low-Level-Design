package Services;

import Entity.Order;
import Entity.UserInfo;
import Entity.User;
import Enum.TXN_TYPE;

public class OrderValidator {
    public boolean ValidateOrder(String userId, Order order){
        User user = UserInfo.getUser(userId);
        if(order.getTxnType() == TXN_TYPE.BUY){
            System.out.println("Check if the user has money to buy the stocks requested.");
        }
        else{
            System.out.println("Check user has stocks to sell or not.");
        }

        System.out.println("Assuming user made the valid request so validating the order");
        return true;
    }
}
