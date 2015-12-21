import java.util.ArrayList;
import java.util.ListIterator;

public abstract class Exam{
    abstract void doQuestion();
}


class Question extends Exam{
    String description;
    public Question(String desc) {
        this.description = desc;
    }
    public void print() {
        System.out.println(description);
    }

    @Override
    void doQuestion() {
        print();
    }
}

class TestPaper extends Exam{
    ArrayList<Exam> list;

    public TestPaper(){
        list = new ArrayList<Exam>();
    }

    public void addQuestion(Question q){
        list.add(q);
    }

    @Override
    void doQuestion() {
        ListIterator<Exam> iterator = list.listIterator();
        while(iterator.hasNext()){
            Exam x = iterator.next();
            x.doQuestion();
        }
        //list.forEach(Exam::doQuestion);
    }
}
