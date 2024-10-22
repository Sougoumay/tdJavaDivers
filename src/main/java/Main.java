import exercice10.Box;
import exercice10.BoxUtil;
import exercice3.BirdWatcher;
import exercice4.Fighter;
import exercice4.Warrior;
import exercice4.Wizard;
import exercice5.Book;
import exercice5.Library;
import exercice5.User;
import exercice6.Customer;
import exercice6.Flight;
import exercice6.FlightManager;
import exercice6.exceptions.FlightNotFoundException;
import exercice6.exceptions.InsufficientSeatsException;

public class Main {
    public static void main(String[] args) {
//        System.out.println("hello");
//
//        Lasagna lasagna = new Lasagna(40);
//
//        System.out.println("les lasagnes doit être au four pendant " + lasagna.expectedMinutesInOven());
//
//        System.out.println("Le temsp de four restant en minutes est " + lasagna.remainingMinutesInOven(25));
//
//        System.out.println("Le temps de preparation en minutes est : " + lasagna.preparationTimeInMinutes(6));
//
//        System.out.println("Le temps de travail total en minutes est : " + lasagna.totalTimeInMinutes(6, 25));
//
//        System.out.println("\n");
//
//        /**
//         * Exercice 2
//         */
//
//        ElonsToyCar car = ElonsToyCar.buy();
//
//        System.out.println(car.batteryDisplay());
//        car.drive();
//        car.drive();
//        System.out.println(car.distanceDisplay());
//        System.out.println(car.batteryDisplay());
//
//        System.out.println("\n");


        /**
         * Exercice 3
         */

//        System.out.println("************* Exercice3 ***********");
//        int[] birdsPerDay = {2,5,0,7,4,1};
//        BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
//        System.out.println(birdCount.getLastWeek());
//        System.out.println(birdCount.getToday());
//        System.out.println(birdCount.hasDayWithoutBirds());
//        System.out.println(birdCount.getCountForFirstDays(4));
//        birdCount.incrementTodaysCount();
//        System.out.println(birdCount.getToday());
//
//        System.out.println(birdCount.getBusyDays());

        /**
         * Exercice 4
         */

//        System.out.println("Exercice 4");
//        Fighter warrior = new Warrior();
//        System.out.println(warrior.toString());
//
//        System.out.println(warrior.isVulnerable());
//
//        Wizard wizard = new Wizard();
//        System.out.println(wizard.isVulnerable());
//        wizard.prepareSpell();
//        System.out.println(wizard.isVulnerable());
//        System.out.println(wizard.damagePoints(warrior));
//        System.out.println(warrior.damagePoints(wizard));

        /**
         * Exercice 5
         */
//        Library library = new Library();
//
//        Book book1 = new Book("Java", "Boichut");
//        Book book2 = new Book("Php", "Khalil");
//        Book book3 = new Book("Java", "Boichut");
//        library.addBook(book1);
//        library.addBook(book2);
//        library.addBook(book3);
//
//        User alice = new User("Alice");
//        User bob = new User("Bob");
//        User charlie = new User("Charlie");
//        library.addUser(alice);
//        library.addUser(bob);
//        library.addUser(charlie);
//
//        library.loanBook(alice, book2); // OK
//        library.loanBook(bob, book2); // Ajout à la file d'attente
//        library.loanBook(charlie, book1); // OK
//        library.loanBook(alice, book3); // OK
//
//        // Afficher les emprunts actuels
//        library.showLoans();
//
//        // Retourner un livre
//        library.returnBook(alice,book2); // Alice retourne, Bob l'emprunte
//        // Afficher les emprunts mis à jour
//        library.showLoans();

        /**
         * Exercice 6
         */

//        FlightManager flightManager = new FlightManager();
//
//        Flight flight = new Flight("AZERTY", 5);
//        Flight flight1 = new Flight("QWERTY", 3);
//
//        flightManager.addFlight(flight);
//        flightManager.addFlight(flight1);
//
//        Customer customer = new Customer("Jack", "Bauer");
//        Customer customer1 = new Customer("Isabella", "James");
//        Customer customer2 = new Customer("Issa", "Tahir");
//        Customer customer3 = new Customer("Marcel", "Gerard");
//        Customer customer4 = new Customer("Nathalie", "Yamb");
//        Customer customer5 = new Customer("Kemi", "Seba");
//
//        flightManager.addCustomer(customer);
//        flightManager.addCustomer(customer1);
//        flightManager.addCustomer(customer2);
//        flightManager.addCustomer(customer3);
//        flightManager.addCustomer(customer4);
//        flightManager.addCustomer(customer5);
//
//        try {
//            flightManager.bookFlight(flight1, customer);
//            flightManager.bookFlight(flight1, customer1);
//            flightManager.bookFlight(flight1, customer2);
//            flightManager.bookFlight(flight1, customer4);
//        } catch (FlightNotFoundException e) {
//            System.out.println("Ce vol n'existe pas");
//        } catch (InsufficientSeatsException e) {
//            System.out.println("Ce vol est saturé");
//        } finally {
//            System.out.println(flight1.toString());
//        }
//
//        Flight flight2 = new Flight("Inconnu", 15);
//        try {
//            flightManager.bookFlight(flight2, customer5);
//        } catch (FlightNotFoundException e) {
//            System.out.println("Ce vol n'existe pas");
//        } catch (InsufficientSeatsException e) {
//            System.out.println("Ce vol est saturé");
//        }

        /**
         * Exercice 10
         */

        Box<String> t1 = new Box<>("Je suis generique");
        BoxUtil<String> boxUtil = new BoxUtil<>();
        boxUtil.getValueOfT(t1);

        Box<Integer> t2 = new Box<>(18);
        BoxUtil<Integer> boxUtil1 = new BoxUtil<>();
        boxUtil1.getValueOfT(t2);

        Box<Double> t3 = new Box<>(154d);
        BoxUtil<Double> boxUtil3 = new BoxUtil<>();
        boxUtil3.getValueOfT(t3);


    }
}
