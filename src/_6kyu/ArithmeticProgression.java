package _6kyu;
//An Arithmetic Progression is defined as one in which there is a
//constant difference between the consecutive terms of a given series of numbers.
//You are provided with consecutive elements of an Arithmetic Progression.
//There is however one hitch: exactly one term from the original series is missing
//from the set of numbers which have been given to you. The rest of the given series
//is the same as the original AP. Find the missing term.
//
//You have to write a function that receives a list, list size will always be at
//least 3 numbers. The missing term will never be the first or last one.
//
//Example
//findMissing([1, 3, 5, 9, 11]) == 7
//PS: This is a sample question of the facebook engineer challenge on interviewstreet.
//I found it quite fun to solve on paper using math, derive the algo that way. Have fun!

public class ArithmeticProgression {
    public static void main(String[] args) {
        int[] numbers = new int[] {34, 222, 410, 598, 786, 974, 1162, 1350, 1538, 1726,
                1914, 2290, 2478, 2666, 2854, 3042, 3230, 3418}; //expect: <2102>
        int[] numbers2 = new int[] {-86, -154, -222, -290, -358, -426, -494, -562, -698,
                -766, -834, -902, -970, -1038, -1106, -1174}; //expect: <-630>
        System.out.println(findMissing(numbers));
        System.out.println(findMissing(numbers2));
    }
    public static int findMissing(int[] numbers) {
        int progression = 0;
        for(int i = 0 ; i < numbers.length ; i++) {
            int currNum = numbers[i];
            if (i + 1 < numbers.length) {
                int nextNum = numbers[i + 1];
                int diff = currNum - nextNum;
                if (progression == 0) progression = diff;
                if(progression != diff) return nextNum + progression;
            }
        }
        return numbers[0];
    }

}