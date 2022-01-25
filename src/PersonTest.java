import static org.junit.jupiter.api.Assertions.*;


class PersonTest {

    Person p1, p2, p3;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        p1 = new Person("000001", "Nathan", "Burns", "Mr.", 2002);
        p2 = new Person("000002", "Bob", "Jones", "Mr.", 1975);
        p3 = new Person("000003", "June", "Anderson", "Mrs.", 1987);
    }

    @org.junit.jupiter.api.Test
    void setID() {
        assertEquals("000001", p1.getID());
        assertEquals("000002", p2.getID());
        assertEquals("000003", p3.getID());
    }

    @org.junit.jupiter.api.Test
    void setFirstName() {
        assertEquals("Nathan", p1.getFirstName());
        assertEquals("Bob", p2.getFirstName());
        assertEquals("June", p3.getFirstName());
    }

    @org.junit.jupiter.api.Test
    void setLastName() {
        assertEquals("Burns", p1.getLastName());
        assertEquals("Jones", p2.getLastName());
        assertEquals("Anderson", p3.getLastName());
    }

    @org.junit.jupiter.api.Test
    void setTitle() {
        assertEquals("Mr.", p1.getTitle());
        assertEquals("Mr.", p2.getTitle());
        assertEquals("Mrs.", p3.getTitle());
    }

    @org.junit.jupiter.api.Test
    void setYOB() {
        assertEquals(2002, p1.getYOB());
        assertEquals(1975, p2.getYOB());
        assertEquals(1987, p3.getYOB());
    }

    @org.junit.jupiter.api.Test
    void toCSV() {
        assertEquals("000001, Nathan, Burns, Mr., 2002", p1.toCSV());
        assertEquals("000002, Bob, Jones, Mr., 1975", p2.toCSV());
        assertEquals("000003, June, Anderson, Mrs., 1987", p3.toCSV());
    }

    @org.junit.jupiter.api.Test
    void fullName() {
        assertEquals("Nathan Burns", p1.fullName());
        assertEquals("Bob Jones", p2.fullName());
        assertEquals("June Anderson", p3.fullName());
    }

    @org.junit.jupiter.api.Test
    void formalName() {
        assertEquals("Mr. Burns", p1.formalName());
        assertEquals("Mr. Jones", p2.formalName());
        assertEquals("Mrs. Anderson", p3.formalName());
    }

    @org.junit.jupiter.api.Test
    void getAge() {
        assertEquals("20", p1.getAge());
        assertEquals("47", p2.getAge());
        assertEquals("35", p3.getAge());
    }

    @org.junit.jupiter.api.Test
    void testGetAge() {
        assertEquals("20", p1.getAge(2002));
        assertEquals("47", p2.getAge(1975));
        assertEquals("35", p3.getAge(1987));
    }
}