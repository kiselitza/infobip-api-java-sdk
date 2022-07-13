
package io.github.infobip_community.client.channels.whatsapp.model.message.interactive.multiproduct;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public final class TextHeader extends Header {
    @NotEmpty
    @Size(max = 60)
    private final String text;

    /**
     * <p>
     * TextHeader.
     * </p>
     *
     * @param text Content of the multi-product message header.
     */
    public TextHeader(String text) {
        super(HeaderType.TEXT);
        this.text = text;
    }
}
