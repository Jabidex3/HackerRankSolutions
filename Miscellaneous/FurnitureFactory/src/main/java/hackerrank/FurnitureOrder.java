package hackerrank;

import java.util.HashMap;
import java.util.Map;

public class FurnitureOrder implements FurnitureOrderInterface {
    /**
     * TODO: Create a map of Furniture items to order quantities
     */

	private HashMap<Enum<?>,Integer> hm;
    /**
     * Initialize a new mapping of Furniture types to order quantities.
     */
    FurnitureOrder() {
        // TODO: Complete the constructor
    	hm = new HashMap<Enum<?>, Integer>();
    }

    public void addToOrder(final Furniture type, final int furnitureCount) {
        // TODO: Complete the method
    	hm.put(type, furnitureCount);
    }

    public HashMap<Furniture, Integer> getOrderedFurniture() {
        // TODO: Complete the method
        return null;
    }

    public float getTotalOrderCost() {
        // TODO: Complete the method
        float cost = 0;
        for(Map.Entry<Enum<?>, Integer> entry:hm.entrySet()) {
        	Furniture.valueOf(entry.getKey().toString());
        	//System.out.println((Furniture.valueOf(entry.getKey().toString())).cost());
        	cost+=entry.getValue()*(Furniture.valueOf(entry.getKey().toString())).cost();
        }
        return cost;
    }

    public int getTypeCount(Furniture type) {
        // TODO: Complete the method
        return -1;
    }

    public float getTypeCost(Furniture type) {
        // TODO: Complete the method
        return -1.0f;
    }

    public int getTotalOrderQuantity() {
        // TODO: Complete the method
        return -1;
    }
}