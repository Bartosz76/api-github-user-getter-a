package theapp.service;

import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import theapp.model.User;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

@org.springframework.stereotype.Service
public class Service {

    public static final Logger logger = LoggerFactory.getLogger(Service.class);

    public User getUser() throws IOException {

        URL url = new URL("https://api.github.com/users/octocat");
        InputStreamReader reader = new InputStreamReader(url.openStream());

        User user = new Gson().fromJson(reader, User.class);
        return user;

    }

}
