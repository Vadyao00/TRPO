class Dish {
    private String name;
    private double price;
    private int calories;
    private boolean veganFriendly;

    public Dish(String name, double price, int calories, boolean veganFriendly)
    {
        this.name = name;
        this.price = price;
        this.calories = calories;
        this.veganFriendly = veganFriendly;
    }

    public String getName()
    {
        return name;
    }

    public double getPrice()
    {
        return price;
    }

    public int getCalories()
    {
        return calories;
    }

    public boolean isVeganFriendly()
    {
        return veganFriendly;
    }
}