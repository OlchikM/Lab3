package enums;

public enum TimeOfDay {
    MORNING {
        @Override
        public String toString() {
            return "Утро";
        }
    },
    AFTERNOON{
        @Override
        public String toString() {
            return "День";
        }
    },
    EVENING{
        @Override
        public String toString() {
            return "Вечер";
        }
    };


    public static void beGreate(TimeOfDay e ){
        System.out.println(e.toString() + " выдалось просто чудесным");
    }

}
