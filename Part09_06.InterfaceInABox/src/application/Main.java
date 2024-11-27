package application;

import entities.Book;
import entities.Box;
import entities.CD;

public class Main {

    public static void main(String[] args) {
        Book book1 = new Book("Fyodor Dostoevsky", "Crime and Punishment", 2);
        Book book2 = new Book("Robert Martin", "Clean Code", 1);
        Book book3 = new Book("Kent Beck", "Test Driven Development", 0.5);

        CD cd1 = new CD("Pink Floyd", "Dark Side of the Moon", 1973);
        CD cd2 = new CD("Wigwam", "Nuclear Nightclub", 1975);
        CD cd3 = new CD("Rendezvous Park", "Closer to Being Here", 2012);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(cd1);
        System.out.println(cd2);
        System.out.println(cd3);

        Box box = new Box(10);

        box.add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 2));
        box.add(new Book("Robert Martin", "Clean Code", 1));
        box.add(new Book("Kent Beck", "Test Driven Development", 0.7));

        box.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
        box.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
        box.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));

        System.out.println(box);

        /*Neste exemplo, criamos uma caixa grande (bigBox) com uma capacidade de 20 kg. 
        Em seguida, criamos duas caixas médias (mediumBox1 e mediumBox2) 
        com capacidade de 10 kg cada, e duas caixas pequenas (smallBox1 e smallBox2) 
        com capacidade de 5 kg cada. Adicionamos itens Packable (livros e CDs) 
        às caixas pequenas e, em seguida, adicionamos as caixas pequenas às caixas médias. 
        Por fim, adicionamos as caixas médias e outro item Packable à caixa grande.

        Quando você executar o código, verá a representação em string da caixa grande, 
        que mostra o número de itens e opeso total de todos os itens, 
        incluindo os itens nas caixas aninhadas.
         */
        
        Box bigBox = new Box(20);
        Box mediumBox1 = new Box(10);
        Box mediumBox2 = new Box(10);
        Box smallBox1 = new Box(5);
        Box smallBox2 = new Box(5);

        smallBox1.add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 2));
        smallBox2.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));

        mediumBox1.add(smallBox1);
        mediumBox1.add(new Book("Robert Martin", "Clean Code", 1));
        mediumBox2.add(smallBox2);
        mediumBox2.add(new CD("Wigwam", "Nuclear Nightclub", 1975));

        bigBox.add(mediumBox1);
        bigBox.add(mediumBox2);
        bigBox.add(new Book("Kent Beck", "Test Driven Development", 0.5));

        System.out.println(bigBox);        
    }

}
