public class house {
    String mcolor;
    float mheight;
    private int mRoomNumber;
    public house (String color, float height, int roomNumber){
        this.mcolor = color;
        this.mheight = height;
        this.mRoomNumber = roomNumber;
        if (color == "red"){
            System.out.println("I love the color you enteres");
        }
        System.out.println("The color of your house is" + " " + this.mcolor + " "+ "and its height is" + " " + this.mheight);
        System.out.println("You have" + " " + this.mRoomNumber + " " + "rooms in this house");
    }
    public int getmRoomNumber(){
        return  this.mRoomNumber;
    }
    public void setmRoomNumber(int roomNumber){
        return;
    }
}