import java.util.*;
public class Main
{
    private static void printUI()
    {
        System.out.println("\t\t\tГлавное окно");
        System.out.println("\t1. Вывести меню");
        System.out.println("\t2. Вывести все vegan friendly блюда");
        System.out.println("\t3. Средняя стоимость блюд с калорийностью более 300");
        System.out.println("\t4. Добавить блюдо");
        System.out.println("\t5. Выход из программы");
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        //Создание объекта класса репозитория меню
        Repository<Menu> repository = new Repository<Menu>(sneakers);
        //Создаем нескольок объектов меню
        Menu menu1 = new Dish("Cola",120.5,100,false);
        Menu menu2 = new Toast("Broad",120.5,100,false);
        //Добавляем объекту класса репозитория блюда
        repository.addItem(menu1);
        repository.addItem(menu2);
        //Изменения блюд объекта класса репозитория
        repository.updateItem(menu1,menu2);
        //Удаление блюда объекта класса репозитория
        repository.removeItem(menu2);
        int choice;
        while (true)
        {
            printUI();
            System.out.print("Ваш выбор: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice)
            {
                case 1:
                    menu.printMenu();
                    break;
                case 2:
                    menu.printVeganFriendlyDishes();
                    break;
                case 3:
                    System.out.println(menu.calculateAveragePriceOfHighCalorieDishes());
                    break;
                case 4:
                    String input;
                    String name;
                    double price;
                    int calories;
                    boolean veganFriendly;
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("\t1. Добавить напиток");
                    System.out.print("\t2. Добавить тост");
                    System.out.print("\n\tВаш выбор: ");
                    choice = Integer.parseInt(scanner.nextLine());
                    System.out.print("\tЯвляется ли блюдо vegan friendly(Yes/No):");
                    input = scanner.nextLine();
                    System.out.print("\tВведите название: ");
                    name = scanner.nextLine();
                    System.out.print("\tВведите цену: ");
                    price = Double.parseDouble(scanner.nextLine());
                    System.out.print("\tВведите калорийность: ");
                    calories = Integer.parseInt(scanner.nextLine());
                    if(input.equalsIgnoreCase("Yes"))
                    {
                        veganFriendly = true;
                    }
                    else
                    {
                        veganFriendly = false;
                    }
                    switch (choice)
                    {
                        case 1:
                            menu.addDish(new Drink(name, price, calories, veganFriendly));
                            break;
                        case 2:
                            menu.addDish(new Toast(name, price, calories, veganFriendly));
                            break;
                        default:
                            System.out.print("\tНеверный ввод");
                            break;
                        
                    }
                    break;
                case 5:
                    scanner.close();
                    return;
                default:
                    System.out.print("\tНеверный ввод");
                    break;
            }
        }
    }
}
