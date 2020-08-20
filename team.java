public class team {
    private String playerName;
    private int playerNumber;
    private String playerPosition;

    public String getName(){
        return playerName;
    }
    public int getNumber(){
        return playerNumber;
    }
    public String getPostion(){
        return playerPosition;
    }

    public void setName(String newName) {
        playerName = newName;
    }
    public void setNumber(int newNumber) {
        playerNumber = newNumber;
    }
    public void setPostion(String newPostion) {
        playerPosition = newPostion;
    }
}

class simba{
    public static void main(String[] args){
        team bless=new team();

        bless.setName("BOCCO JOHN ");
        bless.setNumber(10);
        bless.setPostion("striker");

        System.out.println("player name: "+ bless.getName());
        System.out.println("player number: "+ bless.getNumber());
        System.out.println("player position: "+ bless.getPostion());

    }
}
