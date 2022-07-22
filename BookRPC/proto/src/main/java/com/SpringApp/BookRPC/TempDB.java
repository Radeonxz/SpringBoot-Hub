package com.SpringApp.BookRPC;

import java.util.ArrayList;
import java.util.List;

public class TempDB {
    public static List<Author> getAuthorFromTempDB() {
        return new ArrayList<Author>() {
            {
                add(Author.newBuilder().setAuthorId(1).setBookId(1).setFirstName("FirstName1").setLastName("LastName1").setGender("male").build());
            }
        };
    }
}
