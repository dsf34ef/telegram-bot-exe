package org.telegram.telegrambots.meta.api.objects.chatmember;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.telegram.telegrambots.meta.api.objects.User;

/**
 * @author Ruben Bermudez
 * @version 5.3
 *
 * Represents a chat member that owns the chat and has all administrator privileges.
 */
@JsonDeserialize
@EqualsAndHashCode(callSuper = false)
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ChatMemberOwner implements ChatMember {
    public static final String STATUS = "creator";

    private static final String STATUS_FIELD = "status";
    private static final String USER_FIELD = "user";
    private static final String CUSTOMTITLE_FIELD = "custom_title";
    private static final String ISANONYMOUS_FIELD = "is_anonymous";

    /**
     * The member's status in the chat, always “creator”
     */
    @JsonProperty(STATUS_FIELD)
    private final String status = STATUS;
    /**
     * Information about the user
     */
    @JsonProperty(USER_FIELD)
    private User user;
    /**
     * Custom title for this user
     */
    @JsonProperty(CUSTOMTITLE_FIELD)
    private String customTitle;
    /**
     * True, if the user's presence in the chat is hidden
     */
    @JsonProperty(ISANONYMOUS_FIELD)
    private Boolean isAnonymous;
}
