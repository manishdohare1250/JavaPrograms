// linear search for given array---------------------------------------------------------------------------  
public class _110_linear_search {
    // function 1 ---when elements of array are integers
    public static int linear_search(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    // function 2----- when elements of array are string
    public static int linear_search_for_string(String fruits[], String key2) {
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i] == key2) {
                return i;
            }
        }
        return -1;
    }
        // function 3 ---when elements of array are characters
        public static int linear_search_for_characters(char characters[],char key3) {
            for (int i = 0; i <characters.length; i++) {
                if (characters[i] == key3) {
                    return i;
                }
            }
            return -1;
        }

    // main function
    public static void main(String[] args) {
        // input for function 1
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        int key = 10;
        // input for function 2
        String fruits[] = { "mango", "orange", "apple", "Banana", "guvava" };
        String key2 = "apple";
        // input for function 3
        char characters[] = { 'm','a','n','i','s','h', };
        char key3 ='i' ;

        // calling function 1----------------------------------------------
        int result = linear_search(numbers, key);
        if (result == -1) {
            System.out.println("not found");
        } else {
            System.out.println("Your key = " + 10 + " is at index: " + result);
        }
        // calling function 2-------------------------------------------------
        int result2 = linear_search_for_string(fruits, key2);/// calling function 2
        if (result2 == -1) {
            System.out.println("not found");
        } else {
            System.out.println("Your key = " + 10 + " is at index: " + result2);
        }
        // calling function 3----------------------------------------------
        int result3 = linear_search_for_characters(characters,key3);
        if (result3 == -1) {
            System.out.println("not found");
        } else {
            System.out.println("Your key = " + 10 + " is at index: " + result3);
        }
    }
}