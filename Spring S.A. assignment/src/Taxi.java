

class Taxi extends Trans{
    int taxi_number;
    String destination;
    int distanceToDestination;
    int base_distance;
    int rate_per_Distance;
    String taxi_state;           //운행중, 일반, 운행불가
    int rate_total;
    int nowPassenger;
    int money_total;


    void start_driving(){

    }
    void change_taxi_state(){
        if(gas>=10){
            taxi_state = "운행";
        }else{
            taxi_state= "운행불가";
            System.out.println("주유 필요");
        }
    }
    void add_taxi_passenger(int passenger, String destination, int distanceToDestination){
        if ( taxi_state == "일반") {
            if (nowPassenger <= maxPassenger) {
                taxi_state = "운행중";
                nowPassenger += passenger;
                System.out.println("탑승 승객 수 = " + nowPassenger);
                System.out.println("잔여 승객 수 = " + (maxPassenger - nowPassenger));
                System.out.println("기본 요금 확인 = " + fee);
                System.out.println("목적지 = " + destination);
                System.out.println("목적지까지 거리 = " + distanceToDestination + "km");
                add_rate(distanceToDestination);
                System.out.println("상태 = " + taxi_state);
            }else{
                System.out.println("최대 승객 수 초과");
            }
        }
    }
    void change_taxi_speed(int changespeed){
        speed += changespeed;
    }

    void add_rate(int distanceToDestination){
        if(distanceToDestination>base_distance){
            rate_total = fee + rate_per_Distance*(distanceToDestination-base_distance);
            System.out.println("지불할 요금 = "+rate_total);
        }else{
            rate_total = fee;
            System.out.println("지불할 요금 = "+rate_total);
        }
    }
    void payment(){
        System.out.println("누적 요금 = "+rate_total );
        nowPassenger = 0;
        taxi_state = "일반";
        money_total +=rate_total;
    }
    Taxi(int taxi_number){
        super(100, 0);
        this.nowPassenger = 0;
        this.maxPassenger = 4;
        this.fee = 3000;
        this.rate_per_Distance = 1000;
        this.base_distance = 1;
        this.gas = 100;
        this.taxi_state = "일반";
        this.speed = 0;
        this.money_total = 0;
        System.out.println(taxi_number+"번 택시 생성");

    }
}