package OnClass.c221005.statement;

public class Main {
    public static void main(String[] args) {

        Judge judge = new Judge(new EvenOrOddK());
        judge.result(5,6);

        judge = new Judge(new EvenOrOddE());
        judge.result(5,6);


    }
}
