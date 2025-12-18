package com.example.contracts.orders;

public record OrderReply(int requestId, int orderId, OrderReplyStatus status, String errorCode) {

    public static OrderReply ok(int requestId, int orderId) {
        return new OrderReply(requestId, orderId, OrderReplyStatus.OK, null);
    }

    public static OrderReply error(int requestId, String errorCode) {
        return new OrderReply(requestId, 0, OrderReplyStatus.ERROR, errorCode);
    }
}
