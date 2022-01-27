@SuppressWarnings("deprecation")
public class Main extends Author {
    public Main(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public static void main(String[] args) {
        Author author = new Author("Sandi", "Metz");

        author.addBook("Practical Object-Oriented Design in Ruby");
        author.addBook("99 Bottles of OOP");

        for (String book: author.getBooks()) {
            System.out.println(book);
        }
    }
}
