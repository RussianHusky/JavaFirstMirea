package ru.mirea.task13;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> lyrics = new LinkedList<>();
        lyrics.add("Oh let me tell you 'bout the sad man");
        lyrics.add("Shut up and let me see your jazz hands");
        lyrics.add("Thought you was Batman");
        System.out.println(lyrics);
        lyrics.remove(2);
        lyrics.add("Remember when you were a mad man");
        lyrics.add("Remember when you were a mad man");
        System.out.println(lyrics);
        lyrics.add(3, "Thought you was Batman");
        lyrics.remove(4);
        System.out.println(lyrics);
    }
}
