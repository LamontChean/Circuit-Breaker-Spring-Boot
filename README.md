# Spring Boot Circuit Breaker Demo

This is a simple Spring Boot project demonstrating how to implement a **Circuit Breaker** pattern using **Resilience4j**.

## What is Circuit Breaker?

Circuit Breaker is a fault tolerance pattern that prevents an application from repeatedly trying to execute an operation that's likely to fail — for example, calling a failing remote service. It helps improve the stability and resilience of your system.

## Features

- Uses **Resilience4j** to implement circuit breaker.
- Configurable circuit breaker properties like failure rate threshold, sliding window size, wait duration.
- Fallback method support when the circuit breaker is open.
- Health indicator exposed via Spring Boot Actuator.
- Easy REST endpoint to test the circuit breaker behavior.

## Getting Started

### Prerequisites

- Java 17 or higher
- Maven or Gradle
- IntelliJ IDEA (recommended)
- Internet connection for dependencies
