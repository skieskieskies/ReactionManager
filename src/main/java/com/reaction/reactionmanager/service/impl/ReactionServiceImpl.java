package com.reaction.reactionmanager.service.impl;

import com.reaction.reactionmanager.dto.ReactionDto;
import com.reaction.reactionmanager.entity.Reaction;
import com.reaction.reactionmanager.repository.ReactionRepository;
import com.reaction.reactionmanager.service.ReactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReactionServiceImpl implements ReactionService {
    private final ReactionRepository reactionRepository;


    @Override
    public Reaction createReaction(ReactionDto reactionDto) {
       Reaction reaction = mapReaction(reactionDto);

        return reactionRepository.save(reaction);
    }

    @Override
    public Reaction updateReaction(ReactionDto reactionDto) {
        Reaction reaction = mapReaction(reactionDto);
        return reactionRepository.save(reaction);
    }

    @Override
    public Reaction getReactionRandomly(Long id) {
        return null;
    }

    private Reaction mapReaction(ReactionDto reactionDto) {
        Reaction reaction = new Reaction();
        reaction.setId(reactionDto.getId());
        reaction.setTitle(reactionDto.getTitle());
        reaction.setLink(reactionDto.getLink());
        reaction.setSource(reactionDto.getSource());
        reaction.setType(reactionDto.getType());
        return reaction;
    }
}
