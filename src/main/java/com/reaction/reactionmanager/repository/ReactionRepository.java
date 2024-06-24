package com.reaction.reactionmanager.repository;

import com.reaction.reactionmanager.entity.Reaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReactionRepository extends JpaRepository<Reaction, Long> {
}
