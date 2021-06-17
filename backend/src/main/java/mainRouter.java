

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import spark.Spark;
import utils.GPT3.REST.RestCallerProfanity;
import utils.Ranker.SCRanker.GPT3Ranker.GPT3RankerModel;
import utils.Ranker.SCRanker.GPT3Ranker.RankText;

import java.util.HashMap;
import java.util.List;

import static spark.Spark.*;

import com.google.gson.Gson;
import spark.Filter;
import spark.Request;
import spark.Response;

public class mainRouter {
        public static void main(String[] args) {



            options("/*",
                    (request, response) -> {

                        String accessControlRequestHeaders = request
                                .headers("Access-Control-Request-Headers");
                        if (accessControlRequestHeaders != null) {
                            response.header("Access-Control-Allow-Headers",
                                    accessControlRequestHeaders);
                        }

                        String accessControlRequestMethod = request
                                .headers("Access-Control-Request-Method");
                        if (accessControlRequestMethod != null) {
                            response.header("Access-Control-Allow-Methods",
                                    accessControlRequestMethod);
                        }

                        return "OK";
                    });



            port(8080);
            get("/hello", (req, res) -> "Hello World");
        }
}
