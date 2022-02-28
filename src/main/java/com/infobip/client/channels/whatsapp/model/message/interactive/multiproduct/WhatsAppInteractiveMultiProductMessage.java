
package com.infobip.client.channels.whatsapp.model.message.interactive.multiproduct;

import com.infobip.client.channels.whatsapp.model.message.MessageContent;
import com.infobip.client.channels.whatsapp.model.message.WhatsAppMessage;

public final class WhatsAppInteractiveMultiProductMessage
        extends WhatsAppMessage<WhatsAppInteractiveMultiProductMessage> {
    /**
     * <p>
     * WhatsAppInteractiveMultiProductMessage.
     * </p>
     *
     * @see WhatsAppMessage#WhatsAppMessage(String, String, MessageContent)
     */
    public WhatsAppInteractiveMultiProductMessage(String from, String to,
            Content content) {
        super(from, to, content);
    }

    @Override
    public String toString() {
        return "WhatsAppInteractiveMultiProductMessage [from=" + from + ", to=" + to
                + ", messageId=" + messageId + ", content=" + content + ", callbackData="
                + callbackData + ", notifyUrl=" + notifyUrl + "]";
    }
}
