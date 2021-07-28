package dev.tobiadegbuji.jmstutorial.listener;

import dev.tobiadegbuji.jmstutorial.config.JmsConfig;
import dev.tobiadegbuji.jmstutorial.domain.Message;
import lombok.extern.log4j.Log4j2;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class MessageListener {

    @JmsListener(destination = JmsConfig.MY_QUEUE)
    public void listen(@Payload Message message, @Headers MessageHeaders messageHeaders,
                       javax.jms.Message jmsMessage){

        log.info("I retrieved this message: " + message.getMessage());

    }

}
