public class Trans {
    int number;
    int maxPassenger;
    int gas;
    int speed;
    int fee;

    void run_start(){
        System.out.println("출발!!");
    }
    void changeSpeed(){

    }

    void changeState(){

    }

    Trans(int gas, int speed){
        this.gas = 100;
        this.speed = 0;
    }
}
