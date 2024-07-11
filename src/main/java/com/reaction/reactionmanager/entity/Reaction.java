package com.reaction.reactionmanager.entity;


import com.reaction.reactionmanager.enums.Source;
import com.reaction.reactionmanager.enums.Type;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Reaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String link;
    private Source source;
    private Type type;
}
