/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Shelf;

import Business.Shelf.ShelfItem;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Bengre
 */
public class Shelf {
    
   private List<ShelfItem> shelfList;
   
   public Shelf()
   {
       shelfList = new ArrayList<ShelfItem>();
   }

    public List<ShelfItem> getShelfList() {
        return shelfList;
    }
   
   public ShelfItem addBook()
   {
       ShelfItem shelfItem = new ShelfItem();
       shelfList.add(shelfItem);
       return shelfItem;
   }
   
   public void delete(ShelfItem shelfItem)
   {
       shelfList.remove(shelfItem);
   }
   
   public void moveBookToRead(ShelfItem shelfItem){
       shelfItem.setStatus(ShelfItem.Status.Read);
   }
   
   public void moveBookToReading(ShelfItem shelfItem){
       shelfItem.setStatus(ShelfItem.Status.Reading);
   }
   
   public void moveBookToToRead(ShelfItem shelfItem){
       shelfItem.setStatus(ShelfItem.Status.ToRead);
   }
    
}
