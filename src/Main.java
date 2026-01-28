import model.Patient;
import service.HospitalService;

void main() {

    HospitalService service = new HospitalService();
    Scanner sc = new Scanner(System.in);

    while (true) {
        IO.println("\n🏥 HOSPITAL MANAGEMENT");
        IO.println("1. Add Patient");
        IO.println("2. Show Patients");
        IO.println("0. Exit");

        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {
            IO.print("Name: ");
            String name = sc.nextLine();

            IO.print("Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            IO.print("Disease: ");
            String disease = sc.nextLine();

            Patient p = new Patient(
                    (int) (Math.random() * 1000),
                    name,
                    age,
                    disease
            );
            service.addPatient(p);
        } else if (choice == 2) {
            service.showPatients();
        } else if (choice == 0) {
            IO.println("👋 Bye!");
            break;
        }
    }
}
