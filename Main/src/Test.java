import java.util.Arrays;

class Contact implements Comparable<Contact> {
    private String firstName;
    private String lastName;
    private String phone;

    public Contact(String firstName, String lastName, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return lastName + ", " + firstName + " " + phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public int compareTo(Contact other) {
        int lastNameComparison = lastName.compareTo(other.lastName);
        if (lastNameComparison != 0) {
            return lastNameComparison;
        }
        return firstName.compareTo(other.firstName);
    }

    public static <T extends Comparable<T>> void selectionSort(T[] contacts) {
        int n = contacts.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (contacts[j].compareTo(contacts[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            T temp = contacts[minIndex];
            contacts[minIndex] = contacts[i];
            contacts[i] = temp;
        }
    }

    public static void main(String[] args) {
        Contact[] friends = new Contact[7];
        friends[0] = new Contact("Sarah", "Baners", "123-785-4752");
        friends[1] = new Contact("Laura", "Getz", "675-343-2321");
        friends[2] = new Contact("", "Phelps", "675-343-2321");
        friends[3] = new Contact("", "Riley", "675-343-2321");
        friends[4] = new Contact("John", "Smith", "456-232-4567");
        friends[5] = new Contact("Larry", "Smith", "675-343-2321");
        friends[6] = new Contact("", "", "");

        selectionSort(friends);

        for (Contact friend : friends) {
            System.out.println(friend);
        }
    }
}
