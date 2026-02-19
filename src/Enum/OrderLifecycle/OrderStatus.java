package Enum.OrderLifecycle;

public enum OrderStatus {
    CREATED(false),
    CONFIRMED(false),
    SHIPPED(false),
    DELIVERED(true ),
    CANCELLED(true );

    private final boolean isFinal;

    private OrderStatus[] allowedStatuses = new OrderStatus[0];

    OrderStatus(boolean isFinal){
        this.isFinal = isFinal;
    }

    static {
        CREATED.allowedStatuses = new OrderStatus[]{CONFIRMED, CANCELLED};
        CONFIRMED.allowedStatuses = new OrderStatus[]{SHIPPED, CANCELLED};
        SHIPPED.allowedStatuses = new OrderStatus[]{DELIVERED};
        DELIVERED.allowedStatuses = new OrderStatus[]{};
        CANCELLED.allowedStatuses = new OrderStatus[]{};
    }

    public boolean canTransitionTo(OrderStatus nextStatus){

        if (isFinal){
            return false;
        }
        for (OrderStatus allowed : allowedStatuses){
            if (allowed == nextStatus){
                return true;
            }
        }
        return false;
    }

    public void printTransitionResult(OrderStatus nextStatus){

        boolean result = canTransitionTo(nextStatus);

        System.out.println(this + " -> " + nextStatus + " = " + result);
    }

}