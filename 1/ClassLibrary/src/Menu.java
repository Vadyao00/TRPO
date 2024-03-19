import java.util.ArrayList;
import java.util.List;

class Menu
{
    private List<Dish> dishes;

    public Menu()
    {
        this.dishes = new ArrayList<>();
    }

    public void addDish(Dish dish)
    {
        dishes.add(dish);
    }

    public void printMenu()
    {
        if(dishes.isEmpty())
            return;
        for(Dish dish : dishes)
        {
            System.out.println(dish.getName() + " - $: " + dish.getPrice());
        }
    }

    public void printVeganFriendlyDishes()
    {
        if(dishes.isEmpty())
            return;
        for(Dish dish : dishes)
        {
            if(dish.isVeganFriendly())
            {
                System.out.println(dish.getName() + " - $: " + dish.getPrice());
            }
        } 
    }

    public double calculateAveragePriceOfHighCalorieDishes()
    {
        if(dishes.isEmpty())
            return 0;
        int count = 0;
        double totalPrice = 0;
        for(Dish dish : dishes)
        {
            if(dish.getCalories() > 300)
            {
                totalPrice += dish.getPrice();
                count++;
            }
        }
        if(count == 0)
        {
            return 0;
        }
        return totalPrice / count;
    }
}