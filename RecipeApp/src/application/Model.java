package application;

import java.util.ArrayList;

/**
 * Used to store recipe data for the application.
 */
public class Model {

	// Stores the recipes
	private ArrayList<Recipe> recipes = new ArrayList<Recipe>();

	/**
	 * Return a list of all recipes.
	 * 
	 * @return recipes
	 */
	public ArrayList<Recipe> getRecipes() {
		return recipes;
	}

	/**
	 * Add a recipe
	 * 
	 * @param recipe The Recipe object to add.
	 */
	public void addRecipe(Recipe recipe) {
		this.recipes.add(recipe);
	}

	/**
	 * Remove a recipe at index
	 * 
	 * @param index The index of the Recipe in the recipes ArrayList.
	 */
	public void removeRecipe(int index) {
		this.recipes.remove(index);
	}

}
