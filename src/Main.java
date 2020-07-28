import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("([А-Я][а-я]+-)?[А-Я][а-я]+\\s[А-Я][а-я]+\\s[А-Я][а-я]+");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Matcher matcher = pattern.matcher(name);
        if (matcher.matches()) {
            System.out.println("Имя корректно!");
        } else System.out.println("Имя некорректно!");
    }
}



/*

        String[] arr = {"34", "434", "35", "323", "24"};
        StringBuilder stringBuilder = new StringBuilder();
        for (String ar: arr) {
            stringBuilder.append(ar).append(", ");
        }
        stringBuilder.setLength(stringBuilder.length()-2);
        String ss = stringBuilder.toString();
        System.out.println(stringBuilder);
    }
}

*/

/*
        String a = new String("Hello");
        String b = new String(a);
        String c = a;
        String d = "Hello";
        String e = "Hello";
        StringBuilder sb = new StringBuilder("text");

        System.out.println("\n 1 - "+ (a == b)
                + "\n 2 - " + (a == c)
                + "\n 3 - " + (a.equals(b))
                + "\n 4 - " + (a == d)
                + "\n 5 - " + (b == c)
                + "\n 6 - " + (d == b)
                + "\n 7 - " + (d == e)
        );
    }
}*/
