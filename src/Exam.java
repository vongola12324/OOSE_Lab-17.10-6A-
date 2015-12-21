import java.util.ArrayList;

public abstract class Exam{
    abstract void doQuestion();
    abstract void addQuestion(Question question);
}


class Question extends Exam{
    String description;
    public Question(String desc) {
        this.description = desc;
    }
    public void print() {
        System.out.println(this.description);
    }

    @Override
    void doQuestion() {
        print();
    }

    @Override
    void addQuestion(Question question) {
        // do nothing
    }
}

class TestPaper extends Exam{
    ArrayList<Exam> list;

    public TestPaper(){
        list = new ArrayList<>();
    }

    public void addQuestion(Question q){
        list.add(q);
    }

    @Override
    void doQuestion() {
        //ListIterator<Exam> iterator = list.listIterator();
        //while(iterator.hasNext()){
        //    Exam x = iterator.next();
        //    x.doQuestion();
        //}
        list.forEach(Exam::doQuestion);
    }
}
