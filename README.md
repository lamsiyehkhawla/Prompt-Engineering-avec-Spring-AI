# 🤖 BDCC-AI — Spring Boot AI Integration Project

`bdcc-ai` is a Spring Boot application that demonstrates integration with OpenAI's GPT and DALL·E models using [Spring AI](https://docs.spring.io/spring-ai/reference/). It provides multiple REST endpoints for conversational AI, structured data extraction, image generation, multimodal (text + image) interactions, and real-time streaming.

---

## 📦 Features

- **Text Chat Interface (`/chat`)**
    - Sends questions to the OpenAI model and gets answers in uppercase.
    - Supports memory and simple logging using Spring AI advisors.

- **Structured Movie Agent (`/askAgent`)**
    - Returns a structured list of movie details in JSON format from a user's question.

- **Image Generation (`/generateImage`)**
    - Generates high-definition images using DALL·E 3 based on a prompt.

- **Multimodal Inputs (`/askImage`, `/describe`)**
    - Accepts image + text input to describe images or answer questions about them.

- **Streaming Responses (`/stream`)**
    - Streams response tokens as text for live feedback.

---

## 🚀 Getting Started

### Prerequisites

- Java 21
- Maven 3.8+
- OpenAI API Key

> ⚠️ Make sure to replace `spring.ai.openai.api-key=**************` in `application.properties` with your actual OpenAI API key.

---

### 🛠️ Build & Run

```bash
# Build the project
mvn clean install

# Run the application
mvn spring-boot:run
```
The application will start at:
http://localhost:8890

🧱 Project Structure

bdcc-ai

├── controllers/  # REST controllers for AI endpoints

├── outputs/             # Output data models (Movie, MovieList, CIN)

├── application.properties

├── pom.xml              # Maven dependencies and plugins


🧠 Technologies Used
- Spring Boot 3.5.4

- Spring AI 1.0.0

- OpenAI GPT-4o / DALL·E 3

- Spring Web

- Maven

- H2 (optional for persistence)

👤 Author
Khawla Lamsiyeh


📘 References
- Spring AI Documentation
- OpenAI API Reference
