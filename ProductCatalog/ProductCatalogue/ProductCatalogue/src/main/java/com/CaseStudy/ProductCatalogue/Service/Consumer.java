package com.CaseStudy.ProductCatalogue.Service;

import org.springframework.kafka.annotation.KafkaListener;

public class Consumer {

    @KafkaListener(topics = "Product_Catalogue" , groupId ="Product Cataloge" )
    public void listenToTopic(String receivedMessage){
        System.out.println("The message received is " + receivedMessage);
    }
}
