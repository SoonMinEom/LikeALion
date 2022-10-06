package OnClass.c221006.collection;

public class RandomNumberGenerator implements NumberGenerator{
    @Override
    public int generator(int num) {
        return (int)(Math.random() * num);
    }
}
