public class BookTest {
    public static void main(String[] args) {
        Book b1 = new BookBuilder().setId(1).setname("JUnit").build();
        System.out.println(b1);
    }
}
