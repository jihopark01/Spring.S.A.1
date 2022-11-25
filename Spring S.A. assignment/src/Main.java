public class Main {
    public static void main(String[] args) {
        //버스
        Bus bus1 = new Bus(1);
        Bus bus2= new Bus(2);

        bus1.add_bus_passenger(2);

        bus1.gas -= 50;
        System.out.println("주유량: "+ bus1.gas);

        bus1.state = "차고지행";
        bus1.gas += 10;

        System.out.println("상태: " + bus1.state);
        System.out.println("주유량: "+bus1.gas);

        bus1.state = "운행";
        bus1.add_bus_passenger(45);

        bus1.add_bus_passenger(5);

        bus1.gas -= 55;
        System.out.println("주유량: "+bus1.gas);
        bus1.change_bus_state();
        System.out.println("상태: " + bus1.state);
      // 택시
        Taxi taxi1 = new Taxi(1);
        Taxi taxi2 = new Taxi(2);
        System.out.println("주유량: "+ taxi1.gas);
        System.out.println("상태: " + taxi1.taxi_state);

        taxi1.add_taxi_passenger(2,"서울역", 2);

        taxi1.gas -= 80;
        System.out.println("주유량: "+ taxi1.gas);
        taxi1.payment();

        taxi1.add_taxi_passenger(5,"구로디지털단지역", 12);
        taxi1.add_taxi_passenger(3,"구로디지털단지역", 12);

        taxi1.gas -= 20;
        taxi1.payment();
        System.out.println("주유량: "+ taxi1.gas);
        System.out.println("상태: " + taxi1.taxi_state);
        System.out.println("누적 요금: "+ taxi1.money_total);
        taxi1.change_taxi_state();
        System.out.println("상태: " + taxi1.taxi_state);

    }


}