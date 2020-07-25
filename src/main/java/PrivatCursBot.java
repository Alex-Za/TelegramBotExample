import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class PrivatCursBot extends TelegramLongPollingBot {

    public void onUpdateReceived(Update update) {

        update.getUpdateId();
        String chatId = String.valueOf(update.getMessage().getChatId());

        SendMessage message = new SendMessage().setChatId(chatId);

        if (update.getMessage().getText().toLowerCase().equals("привет")) {
            message.setText("Здарова");
        } else {
            message.setText("Ну ты и лох");
        }


        try {
            execute(message);
        } catch (TelegramApiException ex) {
            ex.printStackTrace();
        }
    }

    public String getBotUsername() {
        return "PrivatCurs1111Bot";
    }

    public String getBotToken() {
        return "1370016265:AAEBjYjaMVotn68h2udeLar2ANrKryTp0dw";
    }
}
