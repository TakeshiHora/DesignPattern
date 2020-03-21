package Iterator;

public class Main {
    public static void main(String [] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("ONE PIECE"));
        bookShelf.appendBook(new Book("珍遊記"));
        bookShelf.appendBook(new Book("ドラゴンボール"));
        bookShelf.appendBook(new Book("ジョジョの奇妙な冒険"));
        Iterator it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = (Book)it.next();
            System.out.println(book.getName());
        }
    }
}
