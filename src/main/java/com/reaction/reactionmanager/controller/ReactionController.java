package com.reaction.reactionmanager.controller;

import com.reaction.reactionmanager.dto.ReactionDto;
import com.reaction.reactionmanager.entity.Reaction;
import com.reaction.reactionmanager.service.ReactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reactions")
public class ReactionController {
    private ReactionService reactionService;

    @Autowired
    public ReactionController(ReactionService reactionService) {
        this.reactionService = reactionService;
    }

    @PostMapping
    public ResponseEntity<Reaction> createReaction(@RequestBody ReactionDto reactionDto) {
        Reaction reaction = reactionService.createReaction(reactionDto);
        return ResponseEntity.ok(reaction);
    }

    @PutMapping
    public Reaction updateReaction(@RequestBody ReactionDto reactionDto) {
        return reactionService.updateReaction(reactionDto);
    }
//    @GetMapping
//    public ResponseEntity<Reaction> getReaction() {
//        reactionService.getReactionRanomly
//    }

    public void deleteById() {

    }
}
