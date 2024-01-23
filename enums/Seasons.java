package enums;
public enum Seasons {
    SUMMER {
        @Override
        public String toString() {
            return "Лето";
        }
    },
    AUTUMN{
        @Override
        public String toString() {
            return "Осень";
        }
    },
    WINTER{
        @Override
        public String toString() {
            return "Зима";
        }
    },
    SPRING{
        @Override
        public String toString() {
            return "Весна";
        }
    };
    public  static  void tryhard(Seasons e) {
        System.out.println(e.toString() + " расстаралось вовсю.");
    }
    }
