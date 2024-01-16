package enums;

public enum Seasons {
    SUMMER {
        @Override
        public String toString() {
            return "Лето";
        }
    },
    AUTUMN,
    WINTER,
    SPRING;

    public  static  void tryhard(Seasons e) {
        System.out.println(e.toString() + " расстаралось вовсю.");
    }
    }
