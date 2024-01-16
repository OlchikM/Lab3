package enums;

public enum Time {
    YESTERDAY {
        @Override
        public String toString(){
            return("вчера");
        }
    },
    TODAY {
        @Override
        public String toString() {
            return ("сегодня");
        }


    },
    TOMORROW {
        @Override
        public String toString() {
            return ("завтра");
        }
    };
}
