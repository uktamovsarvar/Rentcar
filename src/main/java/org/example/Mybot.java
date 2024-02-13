package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Mybot extends TelegramLongPollingBot {
    private Mybot_service myBotService = new Mybot_service();

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            Long chatId = update.getMessage().getChatId();
            String text = update.getMessage().getText();
            if (text.equals("/start")) {
                try {
                    execute(myBotService.sendMessage(chatId));
                    execute(myBotService.language(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (text.equals("\uD83C\uDDFA\uD83C\uDDFFO'zbek tili")) {
                try {
                    execute(myBotService.shareContact(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Menu")) {
                try {
                    execute(myBotService.asosiymenu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Moshina markalari 🚘")) {
                try {
                    execute(myBotService.menu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Chevrolet")) {
                try {
                    execute(myBotService.Chevrolet(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Malibu")) {
                try {
                    execute(myBotService.Malibu(chatId));
                    execute(myBotService.buyurtmaberish(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Tracker")) {
                try {
                    execute(myBotService.Tracker(chatId));
                    execute(myBotService.buyurtmaberish(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Spark")) {
                try {
                    execute(myBotService.Spark(chatId));
                    execute(myBotService.buyurtmaberish(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }


            if (text.equals("Gentra")) {
                try {
                    execute(myBotService.Gentra(chatId));
                    execute(myBotService.buyurtmaberish(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Nexia3")) {
                try {
                    execute(myBotService.Nexia3(chatId));
                    execute(myBotService.buyurtmaberish(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Monza")) {
                try {
                    execute(myBotService.Monza(chatId));
                    execute(myBotService.buyurtmaberish(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("BYD")) {
                try {
                    execute(myBotService.BYD(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Byd_sport")) {
                try {
                    execute(myBotService.Byd_sport(chatId));
                    execute(myBotService.buyurtmaberish(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Byd_sonpilus")) {
                try {
                    execute(myBotService.Byd_sonpilus(chatId));
                    execute(myBotService.buyurtmaberish(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Byd_chazor")) {
                try {
                    execute(myBotService.Byd_chazor(chatId));
                    execute(myBotService.buyurtmaberish(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Byd_han")) {
                try {
                    execute(myBotService.Byd_han(chatId));
                    execute(myBotService.buyurtmaberish(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Kia")) {
                try {
                    execute(myBotService.Kia(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Kia_K5")) {
                try {
                    execute(myBotService.Kia_K5(chatId));
                    execute(myBotService.buyurtmaberish(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Buyurtma berish 📲")) {
                try {
                    execute(myBotService.next(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Ortga qaytish 👈")) {
                try {
                    execute(myBotService.BYD(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Ortga qaytish👈")) {
                try {
                    execute(myBotService.menu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("\uD83D\uDD19Orqaga")) {
                try {
                    execute(myBotService.asosiymenu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    @Override
    public String getBotUsername() {
        return "rentcar01_bot";
    }

    @Override
    public String getBotToken() {
        return "6874304444:AAGsB8fSo2nYhEd17hGt4hOs4ThTMGYYvvM";
    }
}
