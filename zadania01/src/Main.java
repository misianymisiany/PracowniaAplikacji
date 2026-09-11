//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("Ania"));
    IO.println(String.format("Bartek"));
    IO.println(String.format("Kasia"));

    String imie = "Kacper";
    int rok_urodzenia =2007;
    double liczba =0.66;
    int wiek = 2026-rok_urodzenia;

    System.out.println("Mam na imię "+imie+"  "+"mam "+wiek+" lat  i będę pisać maturę za"+liczba+" roku");

Scanner sc= new Scanner(System.in);


    System.out.print("Podaj temperaturę w stopniach Celsjusza: ");
    double temperatura = sc.nextDouble();
    System.out.println(temperatura);
    double fahrenheity = 1.8 * temperatura + 32.0;
    System.out.println(temperatura + " stopni Celsjusza to " + fahrenheity + " stopni Fahrenheita.");
    System.out.println("podaj bok 1");
    double bok1 =sc.nextDouble();
    System.out.println("podaj bok 2");
    double bok2 =sc.nextDouble();
    System.out.println("podaj bok 3");
    double bok3 =sc.nextDouble();
    double obw = bok1+bok2+bok3;
    System.out.println("obwód trójkąta to: "+obw);


    System.out.println("Podaj trzy słowa (oddzielone spacjami lub enterem):");
    String slowo1 = sc.next();
    String slowo2 = sc.next();
    String slowo3 = sc.next();
    System.out.println(slowo3 + ", " + slowo2 + ", " + slowo1);

    System.out.print("Podaj jeden wyraz: ");
    String wyraz = sc.next();
    int liczbaZnakow = wyraz.length();
    System.out.println(liczbaZnakow);



    int x = 5;
    int y = 2;
    double wynik = (double)x / y;
    System.out.println(wynik);


    System.out.print("Podaj słowo: ");
    String slowo = sc.next();
    String wielkieLitery = slowo.toUpperCase();
    System.out.println(wielkieLitery);
}





///Napisz program, który pobierze od użytkownika słowo i wypisze je z małymi literami zamienionymi na wielkie. Skorzystaj z metody toUpperCase typu String.