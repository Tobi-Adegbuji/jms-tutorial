package dev.tobiadegbuji.jmstutorial.sender;

import dev.tobiadegbuji.jmstutorial.config.JmsConfig;
import dev.tobiadegbuji.jmstutorial.domain.Message;
import dev.tobiadegbuji.jmstutorial.utils.FakerUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Log4j2
@Component
@RequiredArgsConstructor
public class MessageSender {

    private final JmsTemplate jmsTemplate;

    @Scheduled(fixedRate = 2000)
    public void sendMessage(){

        Message message = Message.builder()
                .id(UUID.randomUUID())
                .message(FakerUtil.getRandomName() + " just signed up!")
                .build();

        jmsTemplate.convertAndSend(JmsConfig.MY_QUEUE, message);

       log.info("Message sent: " + message);

    }

}
