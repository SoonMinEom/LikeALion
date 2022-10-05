package OnClass.c221005;

// dao = date access object
public class UserDao {

    // static 써야하는 이유
    // Main 메소드 역시 스태틱 메소드
    // -> 그 안에는 인스턴스 멤버가 그냥 들어갈 수 없음.
    // 객체 생성을 해주거나, 메소드 static을 붙이거나 해야함.

    public void plus(int first, int second) {
        System.out.println(first + second);
    }

    public static void main(String[] args) {
        UserDao dao = new UserDao();
        dao.plus(1, 2);
    }
}