/**
 * OOSE Lab 17.10 (6A)
 * @author vongola12324 (D0240235 侯均靜)
 * @version v2
 */
public class Main {
    public static void main(String[] args){
        Exam Paper = new TestPaper();
        if(Paper instanceof TestPaper){
            Paper.addQuestion(new Question("1 + 1 = ?"));
            Paper.addQuestion(new Question("2 + 2 = ?"));
            Paper.addQuestion(new Question("3 + 3 = ?"));
            Paper.addQuestion(new Question("10 + 10 = ?"));
            Paper.addQuestion(new Question("14023984028 + 17749273498720482 = ?"));
        }
        Paper.doQuestion();
    }
}
