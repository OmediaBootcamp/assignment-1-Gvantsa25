package dev.omedia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        canPack(1,0,4);
    }
    //s1
    public static void checkNumber(int number) {
        String printableValue = number > 0 ? "positive" : number < 0 ? "negative" : "zero";
        System.out.println(printableValue);
    }

    //2
    public static long toMilesPerHour(double kilometersPerHour) {
        if(kilometersPerHour < 0) {
            return -1;
        };
        final double conversion = 0.621371;
        return Math.round(kilometersPerHour * conversion);
    }

    public static void printConversion(double kilometersPerHour) {
        if(kilometersPerHour < 0) {
            System.out.println("Invalid Value");
            return;
        };
        final double conversion = 0.621371;
        long milesPerHour = Math.round(kilometersPerHour * conversion);
        System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
    }

    //3
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if(kiloBytes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        int remainingKilobytes = kiloBytes / 1024;
        int megabytes = kiloBytes % 1024;
        System.out.println(kiloBytes + " KB = " + remainingKilobytes + " MB and " + megabytes + " KB");
    }

    //4
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if(hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }
        return barking && (hourOfDay < 8 || hourOfDay > 22);
    }

    //5
    public static boolean isLeapYear(int year) {
        if(year < 1 || year > 9999) {
            return false;
        }
        return (year % 4 == 0 && year % 100 == 0 && year % 400 == 0);
    }

    //6
    public static boolean areEqualByThreeDecimalPlaces(double param1 , double param2){
        long param1Round = (long) (param1 * 1000);
        long param2Round = (long) (param2 * 1000);
        return param1Round == param2Round;
    }

    //7
    public static boolean hasEqualSum(int one, int two, int three){
        return one + two == three;
    }

    //8
    public static boolean hasTeen(int one, int two, int three){
        if(isTeen(one) || isTeen(two) || isTeen(three)){
            return true;
        }
        return false;
    }

    public static boolean isTeen(int age){
        return age <= 19 && age >= 13;
    }

    //9
    public static double area(double radius){
        if(radius < 0){
            return -1.0;
        }
        return  radius * radius * Math.PI;

    }

    public static double area(double x, double y){
        if(x < 0 || y < 0){
            return -1.0;
        }
        return x * y;

    }

    //10
    public static void printYearsAndDays(long minutes) {
        if(minutes < 0){
            System.out.println("Invalid Value");
            return;
        }

        long hours = minutes / 60;
        long days = hours / 24;
        long years = days / 365;

        System.out.println(minutes + " min = " + years + " y " + "and " + days % 365 + " d");
    }

    //11
    public static void printEqual(int param1, int param2, int param3){
        if(param1 < 0 || param2 < 0 || param3 < 0){
            System.out.println("Invalid Value");
            return;
        }else if(param1 == param2 && param2 == param3){
            System.out.println("All numbers are equal");
            return;
        }else if((param1 == param2) || (param1 == param3) || (param2 == param3)){
            System.out.println("Neither all are equal or different");
            return;
        }
        System.out.println("All numbers are different");
    }

    //12
    public static boolean isCatPlaying(boolean summer, int temperature){
        int tempUpperLimit = summer ? 45 : 35;
        int tempLowerLimit = 25;
        if(temperature <= tempUpperLimit && temperature >= tempLowerLimit){
            return true;
        }

        return false;
    }

    //13







    // 19
    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
        if(firstNumber < 10 || firstNumber > 99 || secondNumber < 10 || secondNumber > 99) {
            return false;
        }
        int firstNumber1 = firstNumber / 10;
        int firstNumber2 = firstNumber % 10;

        int secondNumber1 = secondNumber / 10;
        int secondNumber2 = secondNumber % 10;

        boolean firstStatement = firstNumber1 == secondNumber1 || firstNumber1 == secondNumber2;
        boolean secondStatement = firstNumber2 == secondNumber1 || firstNumber2 == secondNumber2;

        return firstStatement || secondStatement;
    }

    //20
    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if(!isValid(num1) || !isValid(num2) || !isValid(num3)) {
            return false;
        }
        int rightmost1 = num1 % 10;
        int rightmost2 = num2 % 10;
        int rightmost3 = num3 % 10;

        return  rightmost1 == rightmost2 || rightmost2 == rightmost3 || rightmost1 == rightmost3;
    }

    public static boolean isValid(int number) {
        return (number >= 10) && (number <= 1000);
    }


    //21
    public static void printFactors(int number) {
        if(number < 1) {
            System.out.println("Invalid Value");
        }
        for(int i = 1; i <= number; i++) {
            if(number % i == 0) {
                System.out.println(i);
            }
        }
    }

    //22
    public static int getGreatestCommonDivisor(int first, int second) {
        if(first < 10 || second < 10) {
            return -1;
        }
        int minValue = first < second ? first : second;
        int greatestCommonDivisor = 1;
        for(int i=1; i<=minValue; i++) {
            if(first % i == 0 && second % i == 0) {
                greatestCommonDivisor = i;
            }
        }
        return greatestCommonDivisor;
    }

    //23
    public static boolean isPerfectNumber(int number) {
        if(number < 1) {
            return false;
        }
        int sumOfDivisors = 0;
        for(int i = 1; i < number; i++) {
            if(number % i == 0) {
                sumOfDivisors += i;
            }
        }
        return number == sumOfDivisors;
    }

    //24
    public static void numberToWords(int number) {
        if(number < 0) {
            System.out.println("Invalid Value");
            return;
        }
        int reverseNumber = reverse(number);
        int numberOfZeroes = getDigitCount(number) - getDigitCount(reverseNumber);
        if (number == 0) {
            System.out.println("Zero");
            return;
        }
        while (reverseNumber != 0) {
            int lastDigit = reverseNumber % 10;
            switch (lastDigit) {
                case 0 : System.out.println("Zero");
                case 1 : System.out.println("One");
                case 2 : System.out.println("Two");
                case 3 : System.out.println("Three");
                case 4 : System.out.println("Four");
                case 5 : System.out.println("Five");
                case 6 : System.out.println("Six");
                case 7 : System.out.println("Seven");
                case 8 : System.out.println("Eight");
                case 9 : System.out.println("Nine");
            }
            reverseNumber /= 10;
        }

        for (int i = 0; i < numberOfZeroes; i++) {
            System.out.println("Zero");
        }
    }

    public static int reverse(int number) {
        int reverseNumber = 0;
        while (number != 0) {
            reverseNumber = reverseNumber * 10 + number % 10;
            number /= 10;
        }
        return reverseNumber;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return 1;
        }
        int count = 0;
        for (int i = 1; i <= number; i *= 10) {
            count++;
        }
        return count;
    }

    //25
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        int bigFlourBag = 5;
        int sumOfBigBag = bigFlourBag * bigCount;
        if(sumOfBigBag >= goal) {
            int remaining = goal % bigFlourBag;
            System.out.println("jere" + (goal - sumOfBigBag));
            if(smallCount >= remaining) {
                System.out.println("jere");
                return true;
            }
        } else {
            return smallCount >= goal - sumOfBigBag;
        }
        return false;

    }

    //26
        public static int getLargestPrime(int number) {

            if (number < 2) {
                return -1;
            }

            int factor = -1;
            for (int i = 2; i * i <= number; i++) {
                if (number % i != 0) {
                    continue;
                }
                factor = i;
                while (number % i == 0) {
                    number /= i;
                }
            }
            return number == 1 ? factor : number;
        }

    //27
    public static void printSquareStar(int number) {
        String star = "*";
        String space = " ";
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        for (int row = 1; row <= number; row++) {
            for (int column = 1; column <= number; column++) {
                boolean edgeOfrectangle = row == 1 || column == 1 || row == number || column == number;
                boolean isDiagonal = (row == column) || (column == (number - row + 1));

                if (edgeOfrectangle || isDiagonal) {
                    System.out.print(star);
                } else {
                    System.out.print(space);
                }
            }
            System.out.println();
        }
    }

    //28
//    import java.util.Scanner;

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (true) {
            System.out.print("Enter an integer (or non-integer to end): ");

            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                sum += number;
                count++;
            } else {
                break;
            }
            scanner.nextLine();
        }
        long avg = (count > 0) ? Math.round((double) sum / count) : 0;
        System.out.println("SUM = " + sum + " AVG = " + avg);
        scanner.close();
    }

    //29
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) return -1;
        double areaToCover = (width * height) - (extraBuckets * areaPerBucket);
        return getBucketCount(areaToCover, areaPerBucket);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) return -1;
        return getBucketCount(width * height, areaPerBucket);
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) return -1;
        return (int) Math.ceil(area / areaPerBucket);
    }
}

