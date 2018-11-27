package com.hiya.rocketmq;

public class RocketMqConsumerTest
{
    public static void main(String[] args)
    {
        String mqNameServer = "10.10.51.74:9876";
        String mqTopics = "MQ-HIYA-TOPICS-ORDER";

        String consumerMqGroupName = "CONSUMER-MQ-GROUP";
        RocketMqConsumerListener mqListener = new RocketMqConsumerListener();
        RocketMqConsumer mqConsumer = new RocketMqConsumer(mqListener, mqNameServer, consumerMqGroupName, mqTopics);
        mqConsumer.init();
        try
        {
            Thread.sleep(1000 * 60L);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}