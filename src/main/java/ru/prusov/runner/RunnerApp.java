package ru.prusov.runner;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;
import ru.prusov.bots.MainBot;

public class RunnerApp {
    public static void main(String[] args) {
        TelegramBotsApi bot = null;
        try {
            bot = new TelegramBotsApi(DefaultBotSession.class);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
        MainBot mainBot = new MainBot();
        try {
            bot.registerBot(mainBot);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }
}
