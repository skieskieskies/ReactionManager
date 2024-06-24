package com.reaction.reactionmanager.service.impl;

import com.reaction.reactionmanager.entity.Reaction;
import com.reaction.reactionmanager.repository.ReactionRepository;
import com.reaction.reactionmanager.service.ReactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class ReactionServiceImpl implements ReactionService {
    private ReactionRepository reactionRepository;

    @Autowired
    public ReactionServiceImpl(ReactionRepository reactionRepository) {
        this.reactionRepository = reactionRepository;
    }

    @Override
    public Reaction createReaction(String title, boolean isCompleted) {
       Reaction reaction = new Reaction();
       reaction.setCompleted(isCompleted);
       reaction.setTitle(title);

        return reactionRepository.save(reaction);
    }
}
