package Phase2.Week1.Week2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class ChatGPT {
    public static void main(String[] args) {
        try {
            // Set up the API endpoint URL
            URL url = new URL("https://chat.openai.com/");

            // Prepare the request payload
            String payload = "{\"messages\": [{\"role\": \"system\", \"content\": \"Initialize the conversation.\"}, {\"role\": \"user\", \"content\": \"Hello, I have a question.\"}, {\"role\": \"assistant\", \"content\": \"Sure, I'm here to help. What's your question?\"}]}";

            // Create the connection
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setDoOutput(true);

            // Send the request payload
            OutputStream outputStream = connection.getOutputStream();
            outputStream.write(payload.getBytes());
            outputStream.flush();

            // Get the response
            int responseCode = connection.getResponseCode();
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            // Handle the response
            if (responseCode == HttpURLConnection.HTTP_OK) {
                System.out.println("API request successful");
                System.out.println("Assistant's reply: " + response.toString());
                // Further processing of the assistant's reply
            } else {
                System.out.println("API request failed with response code: " + responseCode);
                // Handle error conditions
            }

            // Close the connection
            connection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

