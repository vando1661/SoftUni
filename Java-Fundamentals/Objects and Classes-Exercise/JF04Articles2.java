package objectsAndClassesExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JF04Articles2 {
    static class Article {
        private String title;
        private String content;
        private String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        @Override
        public String toString(){
            return String.format("%s - %s: %s",this.title,this.content,this.author);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Article> articlesList = new ArrayList<>();
        for (int i = 1; i <=n; i++) {
            String text = scanner.nextLine();
            String title = text.split(", ")[0];
            String content = text.split(", ")[1];
            String author = text.split(", ")[2];

            Article article = new Article(title,content,author);
            articlesList.add(article);
        }
        String command = scanner.nextLine();
        if(command.equals("title") || command.equals("content") || command.equals("author")){
            for (Article article: articlesList) {
                System.out.println(article.toString());

            }
        }
    }
}
