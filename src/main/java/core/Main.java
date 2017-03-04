package core;

import com.fullcontact.api.libs.fullcontact4j.FullContact;

/**
 * Created by Guy on 03/04/17.
 */
public class Main {

    public static void main(String[] args) {
        FullContact fullContact = FullContact.withApiKey("your-api-key").build();
    }
}
