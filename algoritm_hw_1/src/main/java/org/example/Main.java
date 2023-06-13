package org.example;



// Дано целое число N из отрезка [1; 1000]. Также даны N целых чисел Ai из отрезка [1; 1000000].
// Требуется для каждого числа Ai вывести количество различных делителей этого числа.
// В этой задаче несколько верных решений, попробуйте найти наиболее оптимальное.
// Для полученного решения укажите сложность в О-нотации.

public class Main {

    public static void VariosDividers() {
        int[] list1 = new int[1];
        int[] list2 = new int[5];
        for (int i = 0; i < list1.length; i++) {
            list1[i] = (int) (Math.random() * 1000000);
            System.out.print("Nums: " + list1[i] + ", ");
        }

        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                list2[j] = (int) (Math.random() * 1000);
                System.out.println("Nums 2: " + list2[j]);
                if (list1[i] % list2[j] == 0) {
                    System.out.printf("Число %d делится на %d без остатка%n" ,list1[i],list2[j]);
                }
            }
        }
    }

    public static void main(String[] args) {
            VariosDividers();  // O(N^2)
        }
    }
