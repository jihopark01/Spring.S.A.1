public class Bus extends Trans{
    //버스 필드
    int nowPassenger;
    int busNum;
    String state;


    //버스 생성자
    Bus(int busNum) {
        super(100, 0);
        this.maxPassenger = 30;
        this.state = "운행";
        this.fee = 1500;
        System.out.println(busNum+"번 버스객체 만들어짐!");
    }

    //기능 메소드
    void run(){

    }

    void change_bus_state(){
        if(gas == 0){
            state = "차고지행";
        }else if(gas < 10){
            System.out.println("주유가 필요합니다");
        }
    }

    void add_bus_passenger(int passenger){
        if(state == "운행"){
            if((nowPassenger + passenger) <= maxPassenger){
                nowPassenger += passenger;
                System.out.println("탑승 승객 수 = " + passenger);
                System.out.println("잔여 승객 수 = " + (maxPassenger - nowPassenger));
                System.out.println("요금 확인 = " + fee);
            }else{
                System.out.println("최대 승객 수를 초과했습니다.");
            }
        }
    }

    void change_bus_speed(int speedchange){
        if(gas >=10 ){
            speed += speedchange;
        }else{
            System.out.println("주유량을 확인해주세요 ");
        }
    }
}
