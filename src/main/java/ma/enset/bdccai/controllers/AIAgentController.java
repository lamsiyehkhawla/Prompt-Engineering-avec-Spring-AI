package ma.enset.bdccai.controllers;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.MessageChatMemoryAdvisor;
import org.springframework.ai.chat.client.advisor.SimpleLoggerAdvisor;
import org.springframework.ai.chat.memory.ChatMemory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AIAgentController {
    private ChatClient chatClient;

    public AIAgentController(ChatClient.Builder builder, ChatMemory memory) {
        this.chatClient = builder
                .defaultAdvisors(new SimpleLoggerAdvisor())
                .defaultAdvisors(MessageChatMemoryAdvisor.builder(memory).build())
                .build();
    }
    @GetMapping("/chat")
    public String askLLM(@RequestParam String query) {
        try {
            return chatClient.prompt()
                    .system("repond toujours en majuscule")
                    .user(query).call().content();
        } catch (Exception e) {
            return "Erreur lors de l'appel à OpenAI : " + e.getMessage();
        }
    }


}

