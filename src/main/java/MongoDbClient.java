
import com.mongodb.*;
import com.mongodb.client.MongoDatabase;

import java.util.Arrays;

public class MongoDbClient {

    public static void main( String args[] ) {


        //MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
        MongoClientURI connectionString = new MongoClientURI("mongodb://localhost:27017");
        MongoClient mongoClient = new MongoClient(connectionString);
        MongoDatabase database = mongoClient.getDatabase("DBLP");
    }
}
