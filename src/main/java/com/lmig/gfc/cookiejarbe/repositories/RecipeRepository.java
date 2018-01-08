package com.lmig.gfc.cookiejarbe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lmig.gfc.cookiejarbe.models.Recipe;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Integer> {
}