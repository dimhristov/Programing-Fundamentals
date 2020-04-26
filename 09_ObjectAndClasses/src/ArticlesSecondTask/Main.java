package ArticlesSecondTask;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(", ");
        String title  = input[0];
        String content  = input[1];
        String author  = input[2];

        Article article = new Article(title, content, author);
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String[] enterCommand = scan.nextLine().split(": ");
            String command  = enterCommand[0];

            switch (command) {
                case "Edit":
                    article.edit(enterCommand[1]);
                    break;
                case "ChangeAuthor":
                    article.changeAuthor(enterCommand[1]);
                    break;
                case "Rename":
                    article.rename(enterCommand[1]);
                    break;
            }
        }
        System.out.println(article);
    }
}
