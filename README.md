# spring cloud stream with kafka and rabbitMQ

1. Spring Cloud Stream is a framework built on top of Spring Boot and Spring Integration that helps in creating event-driven or message-driven microservices.

2. Microservices architecture follows the “smart endpoints and dumb pipes” principle. Communication between endpoints is driven by messaging-middleware parties like RabbitMQ or Apache Kafka. Services communicate by publishing domain events via these endpoints or channels.

3. The annotation @EnableBinding configures the application to bind the channels INPUT and OUTPUT defined within the interface Processor. Both channels are bindings that can be configured to use a concrete messaging-middleware or binder.

Let's take a look at the definition of all these concepts:

Bindings — a collection of interfaces that identify the input and output channels declaratively
Binder — messaging-middleware implementation such as Kafka or RabbitMQ
Channel — represents the communication pipe between messaging-middleware and the application
StreamListeners — message-handling methods in beans that will be automatically invoked on a message from the channel after the MessageConverter does the serialization/deserialization between middleware-specific events and domain object types / POJOs
Message Schemas — used for serialization and deserialization of messages, these schemas can be statically read from a location or loaded dynamically, supporting the evolution of domain object types

