package lab8_9.Q1;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class CopyOfDemoBookCaseStudyProblem {

	public static void main(String[] args) {

		List<Book> allBooks = loadAllBooks();

//		  1. Find books with more than 400 pages
		Predicate<Book> isMoreThan400Pages = book -> book.getPages() > 400;
		List<Book>booksMoreThan400Pages =
										allBooks.stream()
												.filter(isMoreThan400Pages)
												.toList();

//		 2. Find all books that are java books and more than 400 pages
		Predicate<Book> isJavaBook = book -> book.getSubject().equals(Subject.JAVA);
		List<Book> javaBookAndMoreThan400pages =
												allBooks.stream()
													 	.filter(isMoreThan400Pages.and(isJavaBook))
													 	.toList();

//		 3. We need the top three longest books
		List<Book> topThreeLongestBooks =
										allBooks.stream()
												.sorted(Comparator.comparing(Book::getPages).reversed())
												.limit(3).toList();

//		 4. We need from the fourth to the last longest books
		List<Book>fourthLongestBook =
									allBooks.stream()
											.sorted(Comparator.comparing(Book::getPages))
											.skip(3)
											.limit(1)
											.toList();

//		 5. We need to get all the publishing years
		List<Integer> publishingYears =
										allBooks.stream()
												.map(Book::getYear)
												.distinct()
												.toList();

//		 6. We need all the authors names who have written a book
		List<String> listOfAllAuthors =
										allBooks.stream()
										.flatMap(book -> book.getAuthors().stream())
										.map(Author::getName)
										.distinct()
										.toList();

//		 7. We need all the origin countries of the authors
		List<String> listOfAuthorCountries =
											allBooks.stream()
										 			.flatMap(book-> book.getAuthors().stream())
													.map(Author::getCountry)
													.distinct()
													.toList();

//		 8. We want the most recent published book.
		Optional<Book> mostRecentPublished =
											allBooks.stream()
													.max(Comparator.comparing(Book::getYear));

//		 9. We want to know if all the books are written by more than one author
		boolean writtenByMultiple =
									allBooks.stream()
											.allMatch(book -> book.getAuthors().size() > 1);
	
//		 10. We want one of the books written by more than one author. (findAny)
		Optional<Book> anyBookWrittenByMany =
									allBooks.stream()
											.filter(book -> book.getAuthors().size() > 1)
											.findAny();

//		 11. We want the total number of pages published.
		int totalPages =
						allBooks.stream()
								.mapToInt(Book::getPages)
								.sum();

//		 12. We want to know how many pages the longest book has.
		OptionalInt maxPages =
						allBooks.stream()
								.mapToInt(Book::getPages)
								.max();

//		13. We want the average number of pages of the books
		OptionalDouble averageNumberOfPages =
									allBooks.stream()
											.mapToInt(Book::getPages)
											.average();

//		14. We want all the titles of the books
		List<String> bookTitles =
								allBooks.stream()
										.map(Book::getTitle)
										.toList();
	
//		15. We want the book with the higher number of authors?
		Optional<Book> bookWithMostAuthors =
								allBooks.stream()
										.max(Comparator.comparingInt(o -> o.getAuthors().size()));

//		16. We want a Map of book per year.
		Map<Integer, List<Book>> mapOfBooksPerYear =
													allBooks.stream()
															.collect(Collectors.groupingBy(Book::getYear));

		mapOfBooksPerYear.forEach((key, value) -> System.out.println(key + " " + value));

//		17. We want to count how many books are published per year.
		Map<Integer,Long> countOfBooks =
										allBooks.stream()
												.collect(Collectors.groupingBy(Book::getYear, Collectors.counting()));

		countOfBooks.forEach((key, value) -> System.out.println(key + " " + value));

	}

	private static List<Book> loadAllBooks() {
		List<Book> books = new ArrayList<Book>();
		List<Author> authors1 = Arrays.asList(new Author("raj", "gupta", "in"),
				new Author("ekta", "gupta", "in"), new Author("rahul", "kumar", "in"));

		List<Author> authors2 = List.of(new Author("raj", "gupta", "in"));

		List<Author> authors3 = Arrays.asList(new Author("gunika", "gupta", "us"),
				new Author("keshav", "gupta", "us"));

		books.add(new Book("java", authors1, 400, Subject.JAVA, 2000, "1213"));
		books.add(new Book("python", authors2, 479, Subject.JAVA, 2007, "1218"));
		books.add(new Book("Mgt", authors3, 600, Subject.DOT_NET, 2000, "1293"));

		return books;
	}

}
