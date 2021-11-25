public class Homework{
    public static void main(String[] args) {
        System.out.println("Нужен массив размера 4 на 4.");
        String [][] arrays = {
                {"иванов", "иван", "москва", "менеджер"},
                {"петров", "петр", "воронеж", "эксперт"},
                {"сдоров", "сидр", "омск", "специалист"},
                {"махмудов", "махмуд", "орел", "завхоз"},
        };
        try {
            int rows = arrays.length;
            int columns = arrays[0].length;
            if(rows==4&&columns==4)
            array(arrays);
            throw new MyArraySizeException(arrays);
        } catch (MyArraySizeException e) {
            e.MyArraySizeException();
            e.printStackTrace();
        }
        try {
            int i = Integer.parseInt(s.trim());
            i++;
            throw new MyArrayDataException(arrays);
        }catch (MyArrayDataException ex){
            ex.MyArrayDataException();
            ex.printStackTrace();
        }
        System.out.println("Завершение программы.");
    }
    static void array(String [][] arrays) {
        for (int i = 0; i < arrays.length; i++) {
                System.out.println();
                for (int j = 0; j < arrays[i].length; j++) {
                    System.out.print(arrays[i][j] + " ");
                }
        }
        System.out.println();
    }
    static void sumArray(String [][] arrays) {
        int sum=0;
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                //sum += arrays[i][j];
            }
        }
        System.out.println();
    }
}




