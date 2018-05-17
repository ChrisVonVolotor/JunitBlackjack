public class Game {
    public int resolve(int player, int house){

        if (player > 21 && house > 21){
            return 0;
        }
        if (player <= 21 && (player >= house || house > 21)){
            return player;
        }else if(house <= 21 && (house > player || player > 21)){
            return house;
        }
        else{
            return 0;
        }
    }
}
