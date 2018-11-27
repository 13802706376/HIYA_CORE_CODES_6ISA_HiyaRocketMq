package com.hiya.rocketmq;

import com.alibaba.rocketmq.common.message.Message;

public class RocketMqProducerTest
{
    public static void main(String[] args)
    {
        String mqNameServer = "10.10.51.74:9876";
        String mqTopics = "MQ-HIYA-TOPICS-ORDER";
        String producerMqGroupName = "PRODUCER-MQ-GROUP";
        RocketMqProducer mqProducer = new RocketMqProducer(mqNameServer, producerMqGroupName, mqTopics);
        mqProducer.init();
        for (int i = 0; i < 5; i++)
        {
            Message message = new Message();
            message.setBody(("I send message to RocketMQ " + i).getBytes());
            mqProducer.send(message);
        }
    }
}