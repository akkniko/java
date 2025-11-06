package InheritancePolymorphism;

import java.util.Objects;

public class obj {

    public static class Book {
        private String title;
        private String author;
        private int year;

        public Book(String title, String author, int year) {
            this.title = title;
            this.author = author;
            this.year = year;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null || getClass() != obj.getClass())
                return false;
            Book other = (Book) obj;
            return year == other.year &&
                    Objects.equals(title, other.title) &&
                    Objects.equals(author, other.author);
        }

        @Override
        public int hashCode() {
            return Objects.hash(title, author, year);
        }

        @Override
        public String toString() {
            return title + " (" + author + ", " + year + ")";
        }
    }
}
