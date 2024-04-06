public class EnumExample {
    enum Week{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
    }

    public static void main(String[] args) {
        Week week;
        for(Week day : Week.values()){
            System.out.println(day);
            System.out.println(day.ordinal());
        }
    }
}
