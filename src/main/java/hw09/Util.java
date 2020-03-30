package hw09;

import java.util.List;

    public class Util {
        static final List<String> maleNames = List.of("Quagmire", "Cleveland", "Carter");
        static final List<String> femaleNames = List.of("Jane", "Maria", "Alice");

        public static String getChildName(Boolean isMale) {
            return isMale
                    ? maleNames.get((int) (Math.random() * maleNames.size()))
                    : femaleNames.get((int) (Math.random() * femaleNames.size()));
        }
    }

