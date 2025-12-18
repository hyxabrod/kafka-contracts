package com.example.contracts.orders;

public record OrderRequest(int requestId, int userId, int productId) {
}
