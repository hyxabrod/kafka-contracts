package com.example.contracts.orders;

import java.util.UUID;

public record OrderRequest(UUID requestId, UUID userId, UUID productId) {
}
