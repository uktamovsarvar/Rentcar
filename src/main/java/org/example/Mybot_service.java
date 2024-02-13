package org.example;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class Mybot_service {
    public SendMessage sendMessage(Long chatId) {

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Assalomu alaykum! Rentcarni rasmiy botiga xush kelibsiz 🙋‍♂️.\n" +
                "\n" +
                "Привет! Добро пожаловать в официальный бот Rentcar 🙋‍♂️" +
                "\n" +
                "Greetings! Welcome to the official Rentcar bot 🙋‍♂️ " +
                "\n" +
                "Ассалому алайкум! Ренткарни расми ботига хуш келибсиз 🙋‍♂️.");
        return sendMessage;

    }

    public SendMessage language(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("✅Tilni tanlang");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rows = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("\uD83C\uDDFA\uD83C\uDDFFO'zbek tili");
        row.add(button);
        rows.add(row);

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("\uD83C\uDDF7\uD83C\uDDFAРусский язык");
        row.add(button1);

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("\uD83C\uDDFA\uD83C\uDDF8English language");
        row.add(button2);

        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(rows);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;

    }

    public SendMessage shareContact(Long chatId) {

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setOneTimeKeyboard(true);
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        List<KeyboardRow> rows = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("Contact");
        button.setRequestContact(true);
        row.add(button);
        rows.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Menu");
        row1.add(button1);
        rows.add(row1);

        SendMessage sendMessage = new SendMessage();
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        sendMessage.setChatId(chatId);
        sendMessage.setText("Yuborildi😊");
        replyKeyboardMarkup.setKeyboard(rows);

        return sendMessage;

    }

    public SendMessage menu(Long chatId) {

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Avtoulovni markasini tanlang: ");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rows = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("Chevrolet");

        row.add(button);
        rows.add(row);

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("BYD");
        row.add(button1);

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Kia");
        row.add(button2);


        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("🔙Orqaga");
        row1.add(button3);
        rows.add(row1);

        replyKeyboardMarkup.setKeyboard(rows);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }

    public SendMessage asosiymenu(Long chatId) {

        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("Xush kelibsiz 🙋‍♂️" +
                "\n" +
                "Qanday xizmatlarimizdan foydalanmoqchisiz?");
        sendMessage.setChatId(chatId);

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rows = new ArrayList<>();

        KeyboardRow row1 = new KeyboardRow();
        KeyboardRow row2 = new KeyboardRow();
        KeyboardRow row3 = new KeyboardRow();
        KeyboardRow row4 = new KeyboardRow();


        KeyboardButton button1 = new KeyboardButton();
        KeyboardButton button2 = new KeyboardButton();
        KeyboardButton button3 = new KeyboardButton();
        KeyboardButton button4 = new KeyboardButton();


        button1.setText("Moshina markalari 🚘");
        button2.setText("ℹ️ Biz haqimizda");
        button3.setText("🏘 Barcha filiallar");
        button4.setText("To`y marosimlar uchun 🚘🚖");

        row3.add(button3);
        row1.add(button1);
        row4.add(button4);
        row2.add(button2);


        rows.add(row3);
        rows.add(row1);
        rows.add(row4);
        rows.add(row2);


        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(rows);

        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }

    public SendMessage Chevrolet(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Quydagilardan birini tanlang");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rows = new ArrayList<>();

        KeyboardRow row1 = new KeyboardRow();
        KeyboardRow row2 = new KeyboardRow();
        KeyboardRow row3 = new KeyboardRow();
        KeyboardRow row4 = new KeyboardRow();
        KeyboardRow row5 = new KeyboardRow();
        KeyboardRow row6 = new KeyboardRow();


        KeyboardButton button1 = new KeyboardButton();
        KeyboardButton button2 = new KeyboardButton();
        KeyboardButton button3 = new KeyboardButton();
        KeyboardButton button4 = new KeyboardButton();
        KeyboardButton button5 = new KeyboardButton();
        KeyboardButton button6 = new KeyboardButton();


        button1.setText("Malibu");
        button2.setText("Gentra");
        button3.setText("Nexia3");
        button4.setText("Monza");
        button5.setText("Tracker");
        button6.setText("Spark");


        row1.add(button1);
        row2.add(button2);
        row3.add(button3);
        row4.add(button4);
        row5.add(button5);
        row6.add(button6);

        rows.add(row1);
        rows.add(row2);
        rows.add(row3);
        rows.add(row4);
        rows.add(row5);
        rows.add(row6);


        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(rows);

        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;

    }

    public SendPhoto Malibu(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://rentcar.uz/uploads/hotel/images/24_1638513164mfNM.jpg"));
        sendPhoto.setCaption("Chevrolet Malibu 2 Turbo LT" +
                "\n" +
                " С кондиционером\n" +
                " Автоматическая трансмиссия\n" +
                " количество мест : 5\n" +
                " Двери : 4\n" +
                " Большая сумка : 2\n" +
                " Малая сумка : 4\n" +
                " Депозит сум : 5000000\n" +
                " В сутки предоставляется 200 км, все что свыше сум : 2000" +
                "\n" +
                "Narxi 1 000 000 сум\n" +
                "Цена за 1 сутки");
        return sendPhoto;

    }

    public SendPhoto Tracker(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://rentcar.uz/uploads/hotel/images/24_1667802841BzSS.JPG"));
        sendPhoto.setCaption("Chevrolet Traker 2" +
                " С кондиционером\n" +
                " Автоматическая трансмиссия\n" +
                " Депозит\n" +
                " количество мест : 5\n" +
                " Двери : 5\n" +
                " Большая сумка : 2\n" +
                " Малая сумка : 3\n" +
                " Депозит сум : 4000000\n" +
                " В сутки предоставляется 200 км, все что свыше сум : 2000" +
                "Narxi : 700 000 сум");
        return sendPhoto;

    }
    public SendPhoto Spark(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://rentcar.uz/uploads/hotel/images/24_1638768340A0vs.jpg"));
        sendPhoto.setCaption("Chevrolet Spark\n" +
                " С кондиционером\n" +
                " Автоматическая трансмиссия\n" +
                " количество мест : 4\n" +
                " Двери : 5\n" +
                " Большая сумка : 1\n" +
                " Малая сумка : 2\n" +
                " Депозит сум : 3000000\n" +
                " В сутки предоставляется 200 км, все что свыше сум : 1000" +
                "Narxi : 300 000 сум");
        return sendPhoto;

    }

    public SendPhoto Gentra(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://rentcar.uz/uploads/hotel/images/24_1636022369KI45.jpg"));
        sendPhoto.setCaption("Chevrolet Gentra\n" +
                " С кондиционером\n" +
                " Автоматическая трансмиссия\n" +
                " Депозит\n" +
                " количество мест : 5\n" +
                " Двери : 4\n" +
                " Большая сумка : 1\n" +
                " Малая сумка : 2\n" +
                " Депозит сум : 3000000\n" +
                " В сутки предоставляется 200 км, все что свыше сум : 1000" +
                "Narxi 400 000 so`m ");
        return sendPhoto;

    }

    public SendPhoto Nexia3 (Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://rentcar.uz/uploads/hotel/images/24_1656843551hrzv.jpg"));
        sendPhoto.setCaption("CHEVROLET NEXIA 3\n" +
                " С кондиционером\n" +
                " Автоматическая трансмиссия\n" +
                " количество мест : 5\n" +
                " Двери : 4\n" +
                " Большая сумка : 1\n" +
                " Малая сумка : 2\n" +
                " Депозит сум : 3000000\n" +
                " В сутки предоставляется 200 км, все что свыше сум : 1000" +
                "Narxi 325 000 so`m");
        return sendPhoto;

    }
    public SendPhoto Monza (Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://rentcar.uz/uploads/hotel/images/24_1702288045vW8x.jpg"));
        sendPhoto.setCaption("Chevrolet Monza\n" +
                " С кондиционером\n" +
                " Автоматическая трансмиссия\n" +
                " Депозит\n" +
                " количество мест : 5\n" +
                " Двери : 4\n" +
                " Большая сумка : 2\n" +
                " Малая сумка : 2\n" +
                " Депозит сум : 4000000\n" +
                " В сутки предоставляется 200 км, все что свыше сум : 2000\n" +
                " CarPlay : 1" +
                "Narxi 600 000");
        return sendPhoto;

    }
    public SendMessage BYD(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Quydagilardan birini tanlang");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rows = new ArrayList<>();

        KeyboardRow row1 = new KeyboardRow();
        KeyboardRow row2 = new KeyboardRow();
        KeyboardRow row3 = new KeyboardRow();
        KeyboardRow row4 = new KeyboardRow();
        KeyboardRow row5 = new KeyboardRow();


        KeyboardButton button1 = new KeyboardButton();
        KeyboardButton button2 = new KeyboardButton();
        KeyboardButton button3 = new KeyboardButton();
        KeyboardButton button4 = new KeyboardButton();
        KeyboardButton button5 = new KeyboardButton();



        button1.setText("Byd_sport");
        button2.setText("Byd_sonpilus");
        button3.setText("Byd_chazor");
        button4.setText("Byd_han");
        button5.setText("Ortga qaytish👈");

        row1.add(button1);
        row2.add(button2);
        row3.add(button3);
        row4.add(button4);
        row5.add(button5);

        rows.add(row1);
        rows.add(row2);
        rows.add(row3);
        rows.add(row4);
        rows.add(row5);


        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(rows);

        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;

    }

    public SendPhoto Byd_sport (Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://sc04.alicdn.com/kf/H3a04e183f6b54c9db351ce64618adbado.jpg"));
        sendPhoto.setCaption("BYD Sport\n" +
                " С кондиционером\n" +
                " Автоматическая трансмиссия\n" +
                " Депозит\n" +
                " количество мест : 5\n" +
                " Двери : 5\n" +
                " Большая сумка : 3\n" +
                " Малая сумка : 6\n" +
                " Депозит сум : 4000000\n" +
                " В сутки предоставляется 200 км, все что свыше сум : 2000\n" +
                " CarPlay : 1"+
                "Narxi 1000 000 so`m");
        return sendPhoto;

    }

    public SendPhoto Byd_sonpilus (Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.racer-house.com/photo/pl144819813-byd_song_plus_ev_2021_dm_i_110km_flagship_version_hybrid_compact_suv_e_cvt.jpg"));
        sendPhoto.setCaption("BYD Sonplas\n" +
                " С кондиционером\n" +
                " Автоматическая трансмиссия\n" +
                " Депозит\n" +
                " количество мест : 5\n" +
                " Двери : 5\n" +
                " Большая сумка : 3\n" +
                " Малая сумка : 6\n" +
                " Депозит сум : 4000000\n" +
                " В сутки предоставляется 200 км, все что свыше сум : 2000\n" +
                " CarPlay : 1"+
                "Narxi 1000 500 so`m");
        return sendPhoto;

    }

    public SendPhoto Byd_chazor (Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://rentcar.uz/uploads/hotel/images/24_1681303434FEks.jpg"));
        sendPhoto.setCaption("BYD Chazor\n" +
                " С кондиционером\n" +
                " Автоматическая трансмиссия\n" +
                " Депозит\n" +
                " количество мест : 5\n" +
                " Двери : 5\n" +
                " Большая сумка : 3\n" +
                " Малая сумка : 6\n" +
                " Депозит сум : 4000000\n" +
                " В сутки предоставляется 200 км, все что свыше сум : 2000\n" +
                " CarPlay : 1"+
                "Narxi 1000 550 so`m");
        return sendPhoto;

    }

    public SendPhoto Byd_han (Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://image.made-in-china.com/2f0j00kZdiACLlwHgS/Cheap-Price-Wholesale-China-Manufacturer-Byd-Han-EV-Brand-New-Electric-Cars.jpg"));
        sendPhoto.setCaption("BYD Han\n" +
                " С кондиционером\n" +
                " Автоматическая трансмиссия\n" +
                " Депозит\n" +
                " количество мест : 5\n" +
                " Двери : 5\n" +
                " Большая сумка : 3\n" +
                " Малая сумка : 6\n" +
                " Депозит сум : 4000000\n" +
                " В сутки предоставляется 200 км, все что свыше сум : 2000\n" +
                " CarPlay : 1"+
                "Narxi 1000 700 so`m");
        return sendPhoto;

    }

    public SendMessage Kia(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Quydagilardan birini tanlang");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rows = new ArrayList<>();

        KeyboardRow row1 = new KeyboardRow();
        KeyboardRow row2 = new KeyboardRow();
        KeyboardRow row3 = new KeyboardRow();
        KeyboardRow row4 = new KeyboardRow();
        KeyboardRow row5 = new KeyboardRow();


        KeyboardButton button1 = new KeyboardButton();
        KeyboardButton button2 = new KeyboardButton();
        KeyboardButton button3 = new KeyboardButton();
        KeyboardButton button4 = new KeyboardButton();
        KeyboardButton button5 = new KeyboardButton();



        button1.setText("Kia_K5");
        button2.setText("Kia_sorent");
        button3.setText("Kia_karneval");
        button4.setText("Kia_sport_tage ");
        button5.setText("Ortga qaytish👈");

        row1.add(button1);
        row2.add(button2);
        row3.add(button3);
        row4.add(button4);
        row5.add(button5);

        rows.add(row1);
        rows.add(row2);
        rows.add(row3);
        rows.add(row4);
        rows.add(row5);


        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(rows);

        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;

    }

    public SendPhoto Kia_K5 (Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://sc04.alicdn.com/kf/H3a04e183f6b54c9db351ce64618adbado.jpg"));
        sendPhoto.setCaption("BYD Sport\n" +
                " С кондиционером\n" +
                " Автоматическая трансмиссия\n" +
                " Депозит\n" +
                " количество мест : 5\n" +
                " Двери : 5\n" +
                " Большая сумка : 3\n" +
                " Малая сумка : 6\n" +
                " Депозит сум : 4000000\n" +
                " В сутки предоставляется 200 км, все что свыше сум : 2000\n" +
                " CarPlay : 1"+
                "Narxi 1000 000 so`m");
        return sendPhoto;

    }


    public SendMessage buyurtmaberish(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Buyurtma beramizmi 📲 ?");
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rows = new ArrayList<>();

        KeyboardRow row1 = new KeyboardRow();
        KeyboardRow row2 = new KeyboardRow();

        KeyboardButton button1 = new KeyboardButton();
        KeyboardButton button2 = new KeyboardButton();

        button1.setText("Buyurtma berish 📲");
        button2.setText("Ortga qaytish 👈");

        row1.add(button1);
        row2.add(button2);

        rows.add(row1);
        rows.add(row2);


        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(rows);

        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage next(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Qanday xizmat sizga qulay ?");
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rows = new ArrayList<>();

        KeyboardRow row1 = new KeyboardRow();
        KeyboardRow row2 = new KeyboardRow();
        KeyboardRow row3 = new KeyboardRow();

        KeyboardButton button1 = new KeyboardButton();
        KeyboardButton button2 = new KeyboardButton();
        KeyboardButton button3 = new KeyboardButton();


        button1.setText("Yetkazib berish 🚛");
        button2.setText("Olib ketish 🚗");
        button3.setText("Ortga qaytish 👈");

        row1.add(button1);
        row2.add(button2);
        row3.add(button3);

        rows.add(row1);
        rows.add(row2);
        rows.add(row3);


        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(rows);

        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }
}
