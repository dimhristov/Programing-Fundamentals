package ArticlesForthTask;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String title = "";
        String content = "";
        String author ="";
        ArrayList<Article> listOfArticles = new ArrayList<>();

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split(", ");
            title  = input[0];
            content  = input[1];
            author  = input[2];
            Article article = new Article(title, content, author);

            listOfArticles.add(article);


        }
        String command = scan.nextLine();
        switch (command) {
            case "title":
                listOfArticles
                        .stream()
                        .sorted((a1,a2) ->a1.getTitle().compareTo(a2.getTitle()))
                        .forEach(a1 -> System.out.println(a1.toString()));

                break;
            case "content":
                listOfArticles
                        .stream()
                        .sorted((c1,c2) ->c1.getContent().compareTo(c2.getContent()))
                        .forEach(c1 -> System.out.println(c1.toString()));

                break;
            case "author":
                listOfArticles
                        .stream()
                        .sorted((t1,t2) ->t1.getAuthor().compareTo(t2.getAuthor()))
                        .forEach(t1 -> System.out.println(t1.toString()));

                break;
        }

    }
}
