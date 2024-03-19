//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        //Создаем массив чисел
        int[] array = {19, 0, 8, -4, 13, 1, 6};
        //Сортируем этот массив
        LibrLab3.Merge(array, 0, array.length - 1);
        //Выводим отсортированный массив
        for (int num : array)
        {
            System.out.print(num + " ");
        }
    }
}