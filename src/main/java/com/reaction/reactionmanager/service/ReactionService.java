package com.reaction.reactionmanager.service;

import com.reaction.reactionmanager.dto.ReactionDto;
import com.reaction.reactionmanager.entity.Reaction;


public interface ReactionService {
    Reaction createReaction(ReactionDto reactionDto);
    Reaction updateReaction(ReactionDto reactionDto);

    Reaction getReactionRandomly(Long id);

}
