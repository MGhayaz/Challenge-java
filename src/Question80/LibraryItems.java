package Question80;

public class LibraryItems {
    private String itemId;
    private String title;
    private String author;
    private boolean IsCheckedOut = false;
    public void checkOut(){
        if(!IsCheckedOut){
            IsCheckedOut = true;
            System.out.println("Please return on time");
        }
        else{
            System.out.println("Item Already Exist");
        }
    }
    public void returnItem(){
        if(IsCheckedOut){
            IsCheckedOut = false;
            System.out.println("visit again");
        }
        else{
            System.out.println("This doesn't belongs to this place");
        }
    }

}
