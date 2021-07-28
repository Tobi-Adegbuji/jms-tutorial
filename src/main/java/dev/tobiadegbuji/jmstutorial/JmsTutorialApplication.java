package dev.tobiadegbuji.jmstutorial;

import org.apache.activemq.artemis.core.config.impl.ConfigurationImpl;
import org.apache.activemq.artemis.core.server.ActiveMQServer;
import org.apache.activemq.artemis.core.server.ActiveMQServers;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JmsTutorialApplication {

    public static void main(String[] args) throws Exception {

        /*
        Setting up and embedded JMS server so that we can send and
        retrieve messages in the same application. Not normal practice!
        Just for learning purposes.
         */
        ActiveMQServer server = ActiveMQServers.newActiveMQServer(
                new ConfigurationImpl()
                .setPersistenceEnabled(false)
                .setJournalDirectory("target/data/journal")
                .setSecurityEnabled(false)
                .addAcceptorConfiguration("invm", "vm://0"));

                server.start();


        SpringApplication.run(JmsTutorialApplication.class, args);
    }

}
