package hackerrank;

import java.util.HashMap;
import java.util.Map;

public class FurnitureOrder implements FurnitureOrderInterface {
    /**
     * TODO: Create a map of Furniture items to order quantities
     */

	private HashMap<Furniture, Integer> hm;
    /**
     * Initialize a new mapping of Furniture types to order quantities.
     */
    FurnitureOrder() {
        // TODO: Complete the constructor
    	hm = new HashMap<Furniture, Integer>();
    }

    public void addToOrder(final Furniture type, final int furnitureCount) {
        // TODO: Complete the method
    	hm.put(type, furnitureCount);
    }

    public HashMap<Furniture, Integer> getOrderedFurniture() {
        // TODO: Complete the method
        return hm;
    }

    public float getTotalOrderCost() {
        // TODO: Complete the method
        float cost = 0;
        for(Map.Entry<Furniture, Integer> entry:hm.entrySet()) {
        	Furniture.valueOf(entry.getKey().toString());
        	//System.out.println((Furniture.valueOf(entry.getKey().toString())).cost());
        	cost+=entry.getValue()*(Furniture.valueOf(entry.getKey().toString())).cost();
        }
        return cost;
    }

    public int getTypeCount(Furniture type) {
        // TODO: Complete the method
    	if(hm.get(type) != null) {
    		return hm.get(type);
    	}
        return 0;
    }

    public float getTypeCost(Furniture type) {
        // TODO: Complete the method
    	int amt =0;
    	if(hm.get(type) != null) {
    		amt =hm.get(type);
    	}
    	//System.out.println(amt +" " + type.cost()+ " "+ amt*type.cost());
        return amt*type.cost();
    }

    public int getTotalOrderQuantity() {
        // TODO: Complete the method
    	int qty = 0;
        for(Map.Entry<Furniture, Integer> entry:hm.entrySet()) {
        	Furniture.valueOf(entry.getKey().toString());
        	//System.out.println((Furniture.valueOf(entry.getKey().toString())));
        	
        	qty+=hm.get(Furniture.valueOf(entry.getKey().toString()));
        }
       // System.out.println();
        return qty;
        
    }
}