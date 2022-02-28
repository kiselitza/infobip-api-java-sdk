
package com.infobip.client.channels.whatsapp.model.message.interactive.list;

import com.infobip.client.common.Serde;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class WhatsAppInteractiveListMessageTest {
    @Test
    void testWhatsAppInteractiveListMessageSerialization_withRequiredParameters() throws Exception {
        WhatsAppInteractiveListMessage whatsAppMessage =
                getWhatsAppInteractiveListMessageWithRequiredParameters();
        String json = Serde.INSTANCE.getObjectMapper().writeValueAsString(whatsAppMessage);
        System.out.println(whatsAppMessage);
        System.out.println(json + "\n");
    }

    @Test
    void testWhatsAppInteractiveListMessageSerialization_withAllParameters() throws Exception {
        WhatsAppInteractiveListMessage whatsAppMessage =
                getWhatsAppInteractiveListMessageWithAllParameters();
        String json = Serde.INSTANCE.getObjectMapper().writeValueAsString(whatsAppMessage);
        System.out.println(whatsAppMessage);
        System.out.println(json + "\n");
    }

    public static WhatsAppInteractiveListMessage
            getWhatsAppInteractiveListMessageWithRequiredParameters() {
        return new WhatsAppInteractiveListMessage("441134960000", "441134960001",
                new Content(new Body("Some text"), new Action("Choose one",
                        Arrays.asList(new Section(Arrays.asList(new Row("1", "row title")))))));
    }

    //@formatter:off
    public static WhatsAppInteractiveListMessage
            getWhatsAppInteractiveListMessageWithAllParameters() {
        return new WhatsAppInteractiveListMessage("441134960000", "441134960001",
                new Content(new Body("Some text"),
                        new Action("Choose one",
                                Arrays.asList(
                                        new Section(Arrays.asList(
                                                new Row("1", "first row title")
                                                        .description("first row description"),
                                                new Row("2", "second row title")
                                                        .description("second row description")))
                                                                .title("First section title"),
                                        new Section(Arrays.asList(new Row("3", "third row title")))
                                                .title("Second section title"))))
                                                        .header(new TextHeader("Header"))
                                                        .footer(new Footer("Footer"))).messageId(
                                                             "a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                                                                .callbackData("Callback data")
                                                                .notifyUrl(
                                                                        "https://www.example.com/whatsapp");
    }
    //@formatter:on
}