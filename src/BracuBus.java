public class BracuBus {
    public String busRoute;
    public int maxPas = 2;
    public int pasCount;
    public String [] arr;
    public BracuBus(String s){
        busRoute = s;
        arr = new String[2];

    }
    public BracuBus(String s, int n){
        busRoute = s;
        maxPas = n;
        arr = new String[n];
    }

    public void board(){
        System.out.println("No passengers");
    }
    public void board(BracuStudent obj){
        if(obj.passCheck == true){
            if(obj.location == busRoute){
                if(pasCount<maxPas){
                    arr[pasCount] = obj.studentName;
                    pasCount++;
                    System.out.println(obj.studentName + " boarded the bus.");
                }
                else{
                    System.out.println("Bus is full!");
                }
            }
            else {
                System.out.println("You got on the wrong bus!");
            }
        }
        else{
            System.out.println("You don't have a bus pass!");
        }
    }

    public void board(BracuStudent obj1, BracuStudent obj2){
        board(obj1);
        board(obj2);
    }

    public void showDetails(){
        System.out.println("Bus Route: " + busRoute);
        System.out.println("Passenger Count: " + pasCount + " (Max: " + maxPas + ")");
        System.out.println("Passengers on Board: ");
        for(int i =0; i<pasCount; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
