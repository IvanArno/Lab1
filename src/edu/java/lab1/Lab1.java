package edu.java.lab1;
import java.util.Arrays;

/**
 * First program
 * 
 * @author ivan_Arno
 * @version 1.0
 * @since 2024
 */
public class Lab1 {
	/**
	 * 
	 * @param args - вводимая строка
	 */
	public static void main(String[]args) {
	    //Иницилизируем массив
	    int [] nums = {-112, 100, 125, 50, 60, 61, 78, -10, 98, -1};
	    //Выводим массив
	    System.out.println(Arrays.toString(nums));
	    //Сортировка массива
	    Arrays.sort(nums);
	    //Выводим сортированный массив
	    System.out.println(Arrays.toString(nums));
	  }
}
