public class ex002 {
    public static void main(String[] args) {
        int grade = 55;
        char type = 'm';
        
        // 判斷成績是否大於 60 且 課程類型是否為 'm'
        if (grade > 60 && type == 'm') {
            System.out.println("Course:" + type + "\nYou can pass:" + grade);
        } else {
            // 如果其中一個條件不成立，就執行這裡
            System.out.println("課程不正確或成績不及格");
        }
    }
}