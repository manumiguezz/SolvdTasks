package org.manumiguezz.taskeight;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;


public class Main {

    String text;
    String cleanedText;

    {
        try {
            text = FileUtils.readFileToString(new File("input.txt"), StandardCharsets.UTF_8);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



}
