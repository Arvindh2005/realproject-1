package com.arvindh.masschat.message;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MessageResponse {

    private Long id;
    private String content;
    private MessageType messageType;
    private MessageState messageState;
    private String senderId;
    private String receiverId;
    private LocalDateTime createdAt;
    private byte[] media;

}

