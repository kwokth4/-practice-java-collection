package com.thoughtworks.collection;

import java.util.List;

public class StreamReduce {

    public int getLastOdd(List<Integer> numbers) {
        return numbers
                .stream()
                .reduce((number1,number2) -> number2%2!=0?number2:number1)
                .get();
    }

    public String getLongest(List<String> words) {
        return words
                .stream()
                .reduce((word1,word2) -> word1.length()<word2.length()?word2:word1)
                .get();
    }

    public int getTotalLength(List<String> words) {
        return words
                .stream()
                .mapToInt(word -> word.length())
                .reduce(0, (word1, word2) -> word1 + word2);
    }
}
