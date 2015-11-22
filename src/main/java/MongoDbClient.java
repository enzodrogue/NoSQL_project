
import com.mongodb.*;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.time.temporal.JulianFields;
import java.util.Arrays;

public class MongoDbClient {

    public MongoDbClient()
    {
        ;
    }

    public static void main( String args[] ) {


        //MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
        MongoClientURI connectionString = new MongoClientURI("mongodb://localhost:27017");
        MongoClient mongoClient = new MongoClient(connectionString);
        MongoDatabase database = mongoClient.getDatabase("PROJ");

        MongoCollection<Document> collection = database.getCollection("proj");
        System.out.print(collection.count());


    }
}
