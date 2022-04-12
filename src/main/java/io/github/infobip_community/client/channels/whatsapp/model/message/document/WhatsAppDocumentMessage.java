
package io.github.infobip_community.client.channels.whatsapp.model.message.document;

import io.github.infobip_community.client.channels.whatsapp.model.message.MessageContent;
import io.github.infobip_community.client.channels.whatsapp.model.message.WhatsAppMessage;

public final class WhatsAppDocumentMessage extends WhatsAppMessage<WhatsAppDocumentMessage> {
    /**
     * <p>
     * WhatsAppDocumentMessage.
     * </p>
     *
     * @see WhatsAppMessage#WhatsAppMessage(String, String, MessageContent)
     */
    public WhatsAppDocumentMessage(String from, String to, Content content) {
        super(from, to, content);
    }

    @Override
    public String toString() {
        return "WhatsAppDocumentMessage [from=" + from + ", to=" + to + ", messageId=" + messageId
                + ", content=" + content + ", callbackData=" + callbackData + ", notifyUrl="
                + notifyUrl + "]";
    }
}