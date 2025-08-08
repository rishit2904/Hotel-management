import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

public class HotelManagementSystem {
    static ArrayList<String> name = new ArrayList<>();
    static ArrayList<String> phno = new ArrayList<>();
    static ArrayList<String> add = new ArrayList<>();
    static ArrayList<String> checkin = new ArrayList<>();
    static ArrayList<String> checkout = new ArrayList<>();
    static ArrayList<String> room = new ArrayList<>();
    static ArrayList<Integer> price = new ArrayList<>();
    static ArrayList<Integer> rc = new ArrayList<>();
    static ArrayList<Integer> p = new ArrayList<>();
    static ArrayList<Integer> roomno = new ArrayList<>();
    static ArrayList<Integer> custid = new ArrayList<>();
    static ArrayList<Integer> day = new ArrayList<>();
    static int i = 0;

    public static void main(String[] args) {
        Home();
    }

    static void Home() {
        System.out.println("\t\t\t\t WELCOME TO HOTEL HARI PATTI\n");
        System.out.println("\t\t\t 1 Booking\n");
        System.out.println("\t\t\t 2 Room Service(Menu Card)\n");
        System.out.println("\t\t\t 3 Payment\n");
        System.out.println("\t\t\t 4 Record\n");
        System.out.println("\t\t\t 0 Exit\n");

        Scanner scanner = new Scanner(System.in);
        int ch = scanner.nextInt();

        if (ch == 1) {
            System.out.println(" ");
            Booking();
        } else if (ch == 2) {
            System.out.println(" ");
            restaurant();
        } else if (ch == 3) {
            System.out.println(" ");
            Payment();
        } else if (ch == 4) {
            System.out.println(" ");
            Record();
        } else {
            System.exit(0);
        }
        scanner.close();
    }

    static void date(String c) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);
        try {
            Date date = sdf.parse(c);
            int year = Integer.parseInt(new SimpleDateFormat("yyyy").format(date));
            int month = Integer.parseInt(new SimpleDateFormat("MM").format(date));
            int day = Integer.parseInt(new SimpleDateFormat("dd").format(date));

            if (year >= 2000 && year <= 2023) {
                if (month != 0 && month <= 12) {
                    if (month == 2 && day != 0 && day <= 31) {
                        if (year % 4 == 0 && day <= 29) {
                            // valid date
                        } else if (day < 29) {
                            // valid date
                        } else {
                            System.out.println("Invalid date");
                            name.remove(i);
                            phno.remove(i);
                            add.remove(i);
                            checkin.remove(i);
                            checkout.remove(i);
                            Booking();
                        }
                    } else if (month <= 7 && month % 2 != 0 && day <= 31) {
                        // valid date
                    } else if (month <= 7 && month % 2 == 0 && day <= 30 && month != 2) {
                        // valid date
                    } else if (month >= 8 && month % 2 == 0 && day <= 31) {
                        // valid date
                    } else if (month >= 8 && month % 2 != 0 && day <= 30) {
                        // valid date
                    } else {
                        System.out.println("Invalid date");
                        name.remove(i);
                        phno.remove(i);
                        add.remove(i);
                        checkin.remove(i);
                        checkout.remove(i);
                        Booking();
                    }
                } else {
                    System.out.println("Invalid date");
                    name.remove(i);
                    phno.remove(i);
                    add.remove(i);
                    checkin.remove(i);
                    checkout.remove(i);
                    Booking();
                }
            } else {
                System.out.println("Invalid date");
                name.remove(i);
                phno.remove(i);
                add.remove(i);
                checkin.remove(i);
                checkout.remove(i);
                Booking();
            }
        } catch (ParseException e) {
            System.out.println("Invalid date");
            name.remove(i);
            phno.remove(i);
            add.remove(i);
            checkin.remove(i);
            checkout.remove(i);
            Booking();
        }
    }

    static void Booking() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" BOOKING ROOMS");
        System.out.println(" ");

        while (true) {
            System.out.print("Name: ");
            String n = scanner.next();
            System.out.print("Phone No.: ");
            String p1 = scanner.next();
            System.out.print("Address: ");
            String a = scanner.next();

            if (!n.isEmpty() && !p1.isEmpty() && !a.isEmpty()) {
                name.add(n);
                add.add(a);
                break;
            } else {
                System.out.println("\tName, Phone no. & Address cannot be empty..!!");
            }
        }

        System.out.print("Check-In: ");
        String cii = scanner.next();
        checkin.add(cii);
        date(cii);

        System.out.print("Check-Out: ");
        String coo = scanner.next();
        checkout.add(coo);
        date(coo);

        int[] ci = new int[3];
        int[] co = new int[3];

        String[] ciiParts = cii.split("/");
        String[] cooParts = coo.split("/");

        ci[0] = Integer.parseInt(ciiParts[0]);
        ci[1] = Integer.parseInt(ciiParts[1]);
        ci[2] = Integer.parseInt(ciiParts[2]);
        co[0] = Integer.parseInt(cooParts[0]);
        co[1] = Integer.parseInt(cooParts[1]);
        co[2] = Integer.parseInt(cooParts[2]);

        if (co[1] < ci[1] && co[2] < ci[2]) {
            System.out.println("\n\tErr..!!\n\tCheck-Out date must fall after Check-In\n");
            name.remove(i);
            add.remove(i);
            checkin.remove(i);
            checkout.remove(i);
            Booking();
        } else if (co[1] == ci[1] && co[2] >= ci[2] && co[0] <= ci[0]) {
            System.out.println("\n\tErr..!!\n\tCheck-Out date must fall after Check-In\n");
            name.remove(i);
            add.remove(i);
            checkin.remove(i);
            checkout.remove(i);
            Booking();
        }

        System.out.println("----SELECT ROOM TYPE----");
        System.out.println(" 1. Standard Non-AC");
        System.out.println(" 2. Standard AC");
        System.out.println("\t\tPress 0 for Room Prices");
        int ch = scanner.nextInt();

        if (ch == 0) {
            System.out.println(" 1. Standard Non-AC - Rs. 3500");
            System.out.println(" 2. Standard AC - Rs. 8000");
            ch = scanner.nextInt();
        }

        if (ch == 1) {
            room.add("Standard Non-AC");
            System.out.println("Room Type- Standard Non-AC");
            price.add(3500);
            System.out.println("Price- 3500");
        } else if (ch == 2) {
            room.add("Standard AC");
            System.out.println("Room Type- Standard AC");
            price.add(8000);
            System.out.println("Price- 8000");
        } else {
            System.out.println("Wrong choice..!!");
        }

        Random rand = new Random();
        int rn = rand.nextInt(60) + 300;
        int cid = rand.nextInt(60) + 10;

        while (roomno.contains(rn) || custid.contains(cid)) {
            rn = rand.nextInt(60) + 300;
            cid = rand.nextInt(60) + 10;
        }

        rc.add(0);
        p.add(0);
        String p1=scanner.nextLine();
        if (!phno.contains(p1)) {
            phno.add(p1);
        } else {
            for (int n = 0; n < i; n++) {
                if (p1.equals(phno.get(n))) {
                    if (p.get(n) == 1) {
                        phno.add(p1);
                    }
                }
            }
        }

        System.out.println("");
        System.out.println("\t\t\t***ROOM BOOKED SUCCESSFULLY***");
        System.out.println("Room No. - " + rn);
        System.out.println("Customer Id - " + cid);

        roomno.add(rn);
        custid.add(cid);
        i++;
        System.out.print("0-BACK\n -> ");
        int n = scanner.nextInt();
        if (n == 0) {
            Home();
        } else {
            System.exit(0);
        }
         scanner.close();
    }

    static void restaurant() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Customer Id: ");
        int ph = scanner.nextInt();
        int f = 0;
        int r = 0;

        for (int n = 0; n < i; n++) {
            if (custid.get(n) == ph && p.get(n) == 0) {
                f = 1;
                System.out.println("-------------------------------*******-----------------------------------");
                System.out.println("                             Hotel HARI PATTI");
                System.out.println("-------------------------------*******-----------------------------------");
                System.out.println("                               Menu Card");
                System.out.println("-------------------------------*******-----------------------------------");
                System.out.println("\n BEVERAGES                              21 Dal Fry................ 140.00");
                System.out.println("----------------------------------        22 Dal Makhani............ 150.00");
                System.out.println(" 1 Regular Tea............. 20.00         23 Dal Tadka.............. 150.00");
                System.out.println(" 2 Masala Tea.............. 25.00         ROTI");
                System.out.println(" 3 Coffee.................. 25.00         ---------------------------------");
                System.out.println(" 4 Bread Butter............ 30.00         24 Plain Roti.............. 15.00");
                System.out.println(" 5 Bread Jam............... 30.00         25 Butter Roti............. 15.00");
                System.out.println(" 6 Veg. Sandwich........... 50.00         26 Tandoori Roti........... 20.00");
                System.out.println(" 7 Veg. Toast Sandwich..... 50.00         27 Butter Naan............. 20.00");
                System.out.println(" 8 Cheese Toast Sandwich... 50.00");
                System.out.println(" 9 Grilled Sandwich........ 50.00         RICE");
                System.out.println("                                                                  ----------------------------------");
                System.out.println(" SOUPS                                    28 Plain Rice.............. 90.00");
                System.out.println("----------------------------------        29 Jeera Rice.............. 90.00");
                System.out.println(" 10 Tomato Soup............ 110.00        30 Veg Pulao.............. 110.00");
                System.out.println(" 11 Hot & Sour............. 110.00        31 Peas Pulao............. 110.00");
                System.out.println(" 12 Sweet Corn............. 110.00        SOUTH INDIAN");
                System.out.println(" 13 Veg. Munchow........... 110.00        ----------------------------------");
                System.out.println("                                          32 Plain Dosa............. 100.00");
                System.out.println(" MAIN COURSE                              33 Onion Dosa............. 110.00");
                System.out.println("----------------------------------        34 Masala Dosa............ 130.00");
                System.out.println(" 14 Shahi Paneer........... 110.00        35 Paneer Dosa............ 130.00");
                System.out.println(" 15 Kadai Paneer........... 110.00        36 Rice Idli.............. 130.00");
                System.out.println(" 16 Chilli Paneer.......... 140.00        ICE CREAM");
                System.out.println(" 17 Matar Mushroom......... 140.00        ----------------------------------");
                System.out.println(" 18 Mix Veg................ 140.00        37 Vanilla................. 60.00");
                System.out.println(" 19 Jeera Aloo............. 140.00        38 Strawberry.............. 60.00");
                System.out.println(" 20 Aloo Matar............. 140.00        39 Butter Scotch........... 60.00");
                System.out.println(" 40 Buggy ki Mummy.......... 01.00        41 Prakhar MOM ............ 2.00");
                System.out.println("Press 0 -to end ");

                int ch = 1;
                while (ch != 0) {
                    ch = scanner.nextInt();

                    if (ch == 1 || ch == 26 || ch == 27) {
                        int rs = 20;
                        r += rs;
                    } else if (ch >= 2 && ch <= 3) {
                        int rs = 25;
                        r += rs;
                    } else if (ch >= 4 && ch <= 5) {
                        int rs = 30;
                        r += rs;
                    } else if ((ch >= 10 && ch <= 13) || ch == 30 || ch == 31 || ch == 33) {
                        int rs = 110;
                        r += rs;
                    } else if (ch >= 16 && ch <= 20) {
                        int rs = 140;
                        r += rs;
                    } else if (ch >= 22 && ch <= 23) {
                        int rs = 150;
                        r += rs;
                    } else if (ch >= 24 && ch <= 25) {
                        int rs = 15;
                        r += rs;
                    } else if (ch == 29 || ch == 28) {
                        int rs = 90;
                        r += rs;
                    } else if (ch == 32) {
                        int rs = 100;
                        r += rs;
                    } else if (ch == 40) {
                        int rs = 1;
                        r += rs;
                    } else if (ch == 41) {
                        int rs = 2;
                        r += rs;
                    } else if (ch >= 34 && ch <= 36) {
                        int rs = 130;
                        r += rs;
                    } else if (ch >= 37 && ch <= 39) {
                        int rs = 60;
                        r += rs;
                    } else if (ch == 0) {
                        // do nothing
                    } else {
                        System.out.println("Wrong Choice..!!");
                    }
                }

                System.out.println("Total Bill: " + r);
                r = rc.get(n) + r;
                rc.set(n, r);
            } else {
                // do nothing
            }
        }

        if (f == 0) {
            System.out.println("Invalid Customer Id");
        }

        System.out.print("0-BACK\n -> ");
        int n = scanner.nextInt();
        if (n == 0) {
            Home();
        } else {
            System.exit(0);
        }
         scanner.close();
    }

    static void Payment() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Phone Number: ");
        String ph = scanner.next();
        int f = 0;

        for (int n = 0; n < i; n++) {
            if (ph.equals(phno.get(n))) {
                if (p.get(n) == 0) {
                    f = 1;
                    System.out.println(" Payment");
                    System.out.println(" --------------------------------");
                    System.out.println(" MODE OF PAYMENT");
                    System.out.println(" 1- Credit/Debit Card");
                    System.out.println(" 2- Paytm/PhonePe");
                    System.out.println(" 3- Cash");

                    int x = scanner.nextInt();
                    System.out.println("\n Amount: " + ((price.get(n) * day.get(n)) + rc.get(n)));
                    System.out.println("\n                Pay For ANKESH");
                    System.out.print(" (y/n) ");
                    String ch = scanner.next();

                    if ("y".equalsIgnoreCase(ch)) {
                        System.out.println("\n\n --------------------------------");
                        System.out.println("          Hotel HARI PATTI");
                        System.out.println(" --------------------------------");
                        System.out.println("             Bill");
                        System.out.println(" --------------------------------");
                        System.out.println(" Name: " + name.get(n) + "\t\n Phone No.: " + phno.get(n) + "\t\n Address: " + add.get(n) + "\t");
                        System.out.println("\n Check-In: " + checkin.get(n) + "\t\n Check-Out: " + checkout.get(n) + "\t");
                        System.out.println("\n Room Type: " + room.get(n) + "\t\n Room Charges: " + (price.get(n) * day.get(n)) + "\t");
                        System.out.println(" Restaurant Charges: \t" + rc.get(n));
                        System.out.println(" --------------------------------");
                        System.out.println("\n Total Amount: " + ((price.get(n) * day.get(n)) + rc.get(n)) + "\t");
                        System.out.println(" --------------------------------");
                        System.out.println("          Thank You");
                        System.out.println("          Visit Again :)");
                        System.out.println(" --------------------------------\n");

                        p.set(n, 1);

                        roomno.set(n, 0);
                        custid.set(n, 0);
                    }
                } else {
                    for (int j = n + 1; j < i; j++) {
                        if (ph.equals(phno.get(j))) {
                            if (p.get(j) == 0) {
                                // do nothing
                            } else {
                                f = 1;
                                System.out.println("\n\tPayment has been Made :)\n\n");
                            }
                        }
                    }
                }
            }
        }

        if (f == 0) {
            System.out.println("Invalid Customer Id");
        }

        System.out.print("0-BACK\n -> ");
        int n = scanner.nextInt();
        if (n == 0) {
            Home();
        } else {
            System.exit(0);
        }
         scanner.close();
    }

    static void Record() {
        if (!phno.isEmpty()) {
            System.out.println("  *** HOTEL RECORD ***\n");
            System.out.println("| Name    | Phone No. | Address   | Check-In | Check-Out  | Room Type     | Price         |");
            System.out.println("----------------------------------------------------------------------------------------------------------------------");

            for (int n = 0; n < i; n++) {
                System.out.println("| " + name.get(n) + "\t | " + phno.get(n) + "\t| " + add.get(n) + "\t| " + checkin.get(n) + "\t| " + checkout.get(n) + "\t| " + room.get(n) + "\t| " + price.get(n));
            }

            System.out.println("----------------------------------------------------------------------------------------------------------------------");
        } else {
            System.out.println("No Records Found");
        }

        System.out.print("0-BACK\n -> ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 0) {
            Home();
        } else {
            System.exit(0);
        }
         scanner.close();
    }
}
