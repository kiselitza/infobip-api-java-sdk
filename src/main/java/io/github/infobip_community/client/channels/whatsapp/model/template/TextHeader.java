
package io.github.infobip_community.client.channels.whatsapp.model.template;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public final class TextHeader extends Header {
    @NotEmpty
    @Size(max = 60)
    private final String text;

    /**
     * <p>
     * TextHeader.
     * </p>
     *
     * @param text Template header text. Can contain up to 60 characters, with one
     *     placeholder {{1}}.
     */
    public TextHeader(String text) {
        super(HeaderFormat.TEXT);
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((text == null) ? 0 : text.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        if (!(obj instanceof TextHeader)) {
            return false;
        }
        TextHeader other = (TextHeader) obj;
        if (text == null) {
            if (other.text != null) {
                return false;
            }
        } else if (!text.equals(other.text)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TextHeader [text=" + text + ", format=" + format + "]";
    }
}
