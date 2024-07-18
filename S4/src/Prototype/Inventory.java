package Prototype;

import java.util.HashMap;

public class Inventory {
    private HashMap<Block, Integer> inventory=new HashMap<>();

    public Inventory()
    {
        inventory.put(new DirtBlock(),7);
        inventory.put(new StoneBlock(),10);
    }

    public int getNumberOfBlock(Block block)
    {
        try{
            return inventory.get(block);
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return 0;
    }
}
