public class BookBuilder {


    public Book book = new Book();

     public BookBuilder setId(int id) {
         book.setId(id);
          return this;
         }

    public BookBuilder setname(String name) {
        book.setName(name);
         return this;
    }
     public Book build(){
         return book;
        }
}
