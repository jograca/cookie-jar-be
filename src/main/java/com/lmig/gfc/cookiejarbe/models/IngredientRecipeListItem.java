package com.lmig.gfc.cookiejarbe.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class IngredientRecipeListItem {

	@Id
	@GeneratedValue(generator = "ingredient_recipe_id_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "ingredient_recipe_id_seq", sequenceName = "ingredient_recipe_id_seq")
	private int id;

	private int quantity;

	private String unitOfMeasurement;

	@ManyToOne()
	@JsonIgnore
	private Recipe recipe;

	@ManyToOne
	// @JsonIgnore
	private Ingredient ingredient;

	public int getId() {
		return id;
	}

	public int getQuantity() {
		return quantity;
	}

	public String getUnitOfMeasurement() {
		return unitOfMeasurement;
	}

	public Recipe getRecipe() {
		return recipe;
	}

	public Ingredient getIngredient() {
		return ingredient;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setUnitOfMeasurement(String unitOfMeasurement) {
		this.unitOfMeasurement = unitOfMeasurement;
	}

	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}

	public void setIngredient(Ingredient ingredient) {
		this.ingredient = ingredient;
	}

}
