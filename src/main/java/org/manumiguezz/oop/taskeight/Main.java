package org.manumiguezz.oop.taskeight;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class Main {

    String text;
    String cleanedText;
    String [] words;
    Set<String> uniqueWords;
    int uniqueCount;


    {
        try {
            text = FileUtils.readFileToString(new File("input.txt"), StandardCharsets.UTF_8);
            cleanedText = text.replaceAll("[^A-Za-z ]", "");
            words = StringUtils.split(cleanedText);
            uniqueWords = new HashSet<>(Arrays.asList(words));
            uniqueCount = uniqueWords.size();

            FileUtils.writeStringToFile(new File("output.txt"), "number of unique words: "
                    + uniqueCount, StandardCharsets.UTF_8);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



}
