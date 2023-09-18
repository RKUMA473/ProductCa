package com.CaseStudy.ProductCatalogue.Service;

import org.springframework.kafka.core.KafkaTemplate;

public class Producer {

      KafkaTemplate<String,String> kafkaTemplate;

      public void sendMsgToTopic(String message){
          kafkaTemplate.send("Product_Catalogue", message);
      }
}
