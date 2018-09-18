/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Peter Basily
 * @version 2018.9.17
 */
class Book
{
    // The fields.
   private String author;
   private String title;
   private String refNumber;
   private int pages;
   private int borrowed;
   private boolean courseText;


    /**
     * Set the author and title fields when this object
     * is constructed.
     */
   public Book(String bookAuthor, String bookTitle, int bookPages, boolean textForCourse)
   {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        courseText = textForCourse;
   }

   public String getAuthor()
   {
      return author;
   }

   public String getTitle()
   {
      return title;
   }

   public void printAuthor()
   {
      System.out.print(author);

   }

   public void printTitle()
   {
      System.out.print(title);

   }

   public void printDetails()
   {

      if(refNumber.length() > 0 && refNumber != null)
      {
          System.out.print("Title: " + title + "\n");
          System.out.println("Author: " + author);
          System.out.println("Pages: " + pages);
          System.out.println("borrowed: " + borrowed);
         System.out.println("Reference Number: " + refNumber);
      }
      else
         System.out.print("Title: " + title + "\n");
         System.out.println("Author: " + author);
         System.out.println("Pages: " + pages);
         System.out.println("borrowed: " + borrowed);
         System.out.println("Reference Number: ZZZ");
   }

   public void borrow()
   {
      borrowed++;
   }

   public int getBorrowed()
   {
      return borrowed;
   }

   public int getPages()
   {
      return pages;
   }

   public String getRefNumber()
   {
      return refNumber;
   }

   public boolean isCourseText()
   {
      return courseText;
   }

   public void setRefNumber(String ref)
   {

      if(ref.length() > 3)

      {
         refNumber = ref;
      }

      else
      {
         refNumber = null;
      }

   }




    // Add the methods here ...
}
