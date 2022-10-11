public class Main {
    public static void main(String[] args) {
//        String str1 = "Hello";
//        String str2 = new String(" World!");
//        String str3 = new String(str2);
//
//        System.out.print(str1);
//        System.out.print(str2);
//        System.out.print(str3);
//
//        String str1 = "A" + 1 + "B" + 2;
//        String str2 = 1 + "A" + 2 + "B";
//        String str3 = "A" + "B" + 1 + 2;
//        String str4 = "A" + 1 + 2 + "B";
//        String str5 = 1 + 2 + "A" + "B";
//        String str6 = "A" + 1 + 2 + 3;
//        String str7 = 1 + 2 + 3 + "A";
//        String str8 = "1" + 2 + 3 + 4;
//        String str9 = 1 + 2 + 3 + "4";
//        String str10 = 3.5 + 2 + 3 + "4";
//        System.out.println("str1 = " + str1);
//        System.out.println("str2 = " + str2);
//        System.out.println("str3 = " + str3);
//        System.out.println("str4 = " + str4);
//        System.out.println("str5 = " + str5);
//        System.out.println("str6 = " + str6);
//        System.out.println("str7 = " + str7);
//        System.out.println("str8 = " + str8);
//        System.out.println("str9 = " + str9);
//        System.out.println("str10 = " + str10);

//        String str11 = 1 + 2 + 3 + 4;
//        System.out.println(str11);
//
//        String str12 = 45;
//        System.out.println(str12);

//        String str1 = "A";
//        str1 += 1;
//        str1 += 2;
//        str1 += 3;
//        str1 += "B";
//        System.out.println("str1 = " + str1);
//
//        String str2 = "0";
//        str2 += 1;
//        str2 += 2;
//        str2 += 3;
//        System.out.println("str2 = " + str2);
//
//        String str3 = "0" + 1;
//        str3 += 2 + 3;
//        System.out.println("str3 = " + str3);
//
//        String str4 = 1 + 2 + "3";
//        str4 += 4 + 5;
//        str4 += 6;
//        System.out.println("str4 = " + str4);
//
//
//        String str5 = "1" + 2 + 3;
//        str5 += "4" + 5 + 6;
//        System.out.println("str5 = " + str5);
//
//        String str6 = "";
//        str6 += 1;
//        str6 += 2;
//        str6 += 3 + 4 + 5;
//        System.out.println("str6 = " + str6);
//
//        int five = 5;
//        int six = 6;
//        String s = "7";
//        s += 8;
//        System.out.println(five + six + s);
//
//        String t = "2";
//        int f = 4;
//        int x = 7;
//        x += 5;
//        System.out.println(t + f + x);
//
//        System.out.println("I say:\n\"\\/\\/ E E\"");
//        System.out.println("  /\\\n /\"\"\\\n/\"  \"\\\n\\\"  \"/\n \\\"\"/\n  \\/");
//
//        String name = "Angie";
//        int age = 17;
//        String word = "Bam";
//        String info = "Name:\n" + name + "\n" + "\nAge:\n" + age;
//        info += "\n\nFavorite Word:\n" +"\"" + word + "!\"";
//        System.out.println(info);
//
//        String greeting = "Hello, friend!\n";
//        System.out.print(greeting);
//        System.out.print("Nice to see you!\n");
//        System.out.println("Goodbye!");

        BabyParrot baby = new BabyParrot("Toucan", 3, 4.25);
        baby.setName("Lil' Beans");
        String info = baby.parrotInfo(); // store returned string in variable
        System.out.println(info);        // print the returned string

        System.out.println("¯\\_(\"/)_/¯");


    }
}