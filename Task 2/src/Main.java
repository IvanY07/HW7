public class Main {
    public static void main(String[] args) {
        //todo Тут увольняем айтишников
        int itIdCount = 100;
        int Id = 2;
//        for (int i = 2; i <= itIdCount; i+=2) {
//            System.out.println("Уволен айтишник с id " + i);
//        }
        while (Id <= itIdCount) {
            System.out.println("Уволен айтишник с id " + Id);
            Id += 2;
        }
    }
}
