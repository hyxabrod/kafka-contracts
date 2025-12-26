# Kafka Contracts (Shared Library)

This project contains the shared Data Transfer Objects (DTOs) used across all microservices.

## Key Responsibilities:
1.  **Schema Consistency**: Ensures `product-microservice`, `user-microservice`, and `order-microservice` speak the exact same language.
2.  **POJOs**:
    *   `com.example.contracts.products.ProductEvent`: Carries product state.
    *   `com.example.contracts.orders.OrderRequest`: Request to create an order.
    *   `com.example.contracts.orders.OrderReply`: Result of order processing.

## How to use:
Run `mvn clean install` or `./gradlew publishToMavenLocal` to make this library available to other services locally.
