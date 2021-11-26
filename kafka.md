<B>Strat Zookeeper server</B> <BR>
zookeeper-server-start.bat E:\kafka_2.13-2.8.1\config\zookeeper.properties<BR>

<B>Strat Kafka server</B><BR>
kafka-server-start.bat E:\kafka_2.13-2.8.1\config\server.properties<BR>

<B>Create Topic</B><BR>
kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 -topic mytopic<BR>

<B>List down all available topics</B><BR>
kafka-topics.bat --list --zookeeper localhost:2181<BR>

<B>Produce a message</B><BR>
kafka-console-producer.bat --broker-list localhost:9092 --topic mytopic<BR>

<B>Consume a message</B><BR>
kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic mytopic
