package com.reaction.reactionmanager.service;

import com.reaction.reactionmanager.entity.Reaction;

public interface ReactionService {
    Reaction createReaction(String title, boolean isCompleted);

}
