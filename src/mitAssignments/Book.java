package mitAssignments;

public class Book {
         String title;
         boolean borrowed;
         boolean rented=false;;
         public Book(String bookTitle){
        	 this.title = bookTitle;
         }
        // public void borrowed(){	 
        // }
         public void returned(){
        	 this.rented=false;
         }
         public boolean isBorrowed(){
        	 return false;
         }
         public String getTitle(){
        	 return this.title;
         }
         public void rented(){
        	 this.rented=true;
         }
         public boolean isRented(){
        	 return rented;
         }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Book example = new Book("The Da Vinci Code");
System.out.println("Title(should be The Da Vinci Code):)"+example.getTitle());
System.out.println("Rented?(should be false):"+example.isRented());
example.rented();
System.out.println("Rented?(should be true):"+example.isRented());
example.returned();
System.out.println("Rented?(should be false):"+example.isRented());
	}

}
/*Output:-
Title (should be The Da Vinci Code): The Da Vinci Code
Rented? (should be false): false
Rented? (should be true): true
Rented? (should be false): false */