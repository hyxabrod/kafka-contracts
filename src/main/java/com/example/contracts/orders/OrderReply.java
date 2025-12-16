package com.example.contracts.orders;

import java.util.UUID;

public record OrderReply(UUID requestId, UUID orderId, OrderReplyStatus status, String errorCode) {

    public static OrderReply ok(UUID requestId, UUID orderId) {
        return new OrderReply(requestId, orderId, OrderReplyStatus.OK, null);
    }

    public static OrderReply error(UUID requestId, String errorCode) {
        return new OrderReply(requestId, null, OrderReplyStatus.ERROR, errorCode);
    }
}
