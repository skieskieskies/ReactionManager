package com.reaction.reactionmanager.dto;


import com.reaction.reactionmanager.enums.Source;
import com.reaction.reactionmanager.enums.Type;
import lombok.Data;

@Data
public class ReactionDto {
    private long id;
    private String title;
    private String link;
    private Source source;
    private Type type;
}
