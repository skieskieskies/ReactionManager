package com.reaction.reactionmanager.controller;

import com.reaction.reactionmanager.dto.ReactionDto;
import com.reaction.reactionmanager.entity.Reaction;
import com.reaction.reactionmanager.service.ReactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reactions")
public class ReactionController {
    private ReactionService reactionService;

    @Autowired
    public ReactionController(ReactionService reactionService) {
        this.reactionService = reactionService;
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Reaction> createReaction(@RequestBody ReactionDto reactionDto) {
        Reaction reaction = reactionService.createReaction(reactionDto.getTitle(), reactionDto.isCompleted());
        return ResponseEntity.ok(reaction);
    }


//    public ResponseEntity<Reaction> getReactionById(Long id) {
//
//    }
//
//    public void deleteById() {
//
//    }
}
