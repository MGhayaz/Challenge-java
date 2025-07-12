public class Question76 {
    final int noOfSeats;
    final int noOfWheels;
    final String color;


    public Question76(int noOfSeats,int noOfWheels,String color) {
        this.noOfSeats = noOfSeats;
        this.color = color;
        this.noOfWheels = noOfWheels;
    }

    @Override
    public String toString() {
        final StringBuilder sBuilder = new StringBuilder("Question76{");
        sBuilder.append("noOfSeats=").append(noOfSeats);
        sBuilder.append(", noOfWheels=").append(noOfWheels);
        sBuilder.append(", color='").append(color).append('\'');
        sBuilder.append('}');
        return sBuilder.toString();
    }

    public static void main(String[] args) {
        Question76 car = new Question76(7,4,"pearl descendence");
        System.out.println(car);

    }
}
