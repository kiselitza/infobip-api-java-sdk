
package com.infobip.client.channels.whatsapp.model.message.video;

import com.infobip.client.channels.whatsapp.model.message.MessageContent;

public final class Content extends MessageContent {
    private final String mediaUrl;
    private String caption;

    /**
     * <p>
     * Content.
     * </p>
     *
     * @see MessageContent#MessageContent()
     *
     * @param mediaUrl URL of a video sent in a WhatsApp message. Must be a valid
     *     URL starting with https:// or http://. Supported video types are MP4,
     *     3GPP. Maximum video size is 16MB.
     */
    public Content(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    /**
     * Caption of the video.
     */
    public Content caption(String caption) {
        this.caption = caption;
        return this;
    }

    public String getMediaUrl() {
        return mediaUrl;
    }

    public String getCaption() {
        return caption;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((caption == null) ? 0 : caption.hashCode());
        result = prime * result + ((mediaUrl == null) ? 0 : mediaUrl.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Content)) {
            return false;
        }
        Content other = (Content) obj;
        if (caption == null) {
            if (other.caption != null) {
                return false;
            }
        } else if (!caption.equals(other.caption)) {
            return false;
        }
        if (mediaUrl == null) {
            if (other.mediaUrl != null) {
                return false;
            }
        } else if (!mediaUrl.equals(other.mediaUrl)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Content [mediaUrl=" + mediaUrl + ", caption=" + caption + "]";
    }
}
