
import com.mongodb.*;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.BsonDocument;
import org.bson.Document;

import javax.swing.*;
import java.time.temporal.JulianFields;
import java.util.Arrays;
import java.util.Date;

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


        //*************************************************
        //permet de compter le nombre d'élément dans la base
        // **************************************************
//        System.out.print(collection.count());




        //************************************
        //permet d'afficher toutes les donnés
        //************************************
//        FindIterable<Document> iterable = collection.find();
//        iterable.forEach(new Block<Document>() {
//            @Override
//            public void apply(final Document document) {
//                System.out.println(document);
//            }
//        });



        //************************************************************************
        //permet d'afficher les données ou le borrower est la republique d'albanie
        //************************************************************************
//        FindIterable<Document> iterable = collection.find(
//                new Document("borrower", "REPUBLIC OF ALBANIA"));
//        iterable.forEach(new Block<Document>() {
//            @Override
//            public void apply(final Document document) {
//                System.out.println(document);
//            }
//        });

        //****************************************************************
        //permet de trouver les marjor secteur energy and mining > 40%
        //****************************************************************
//        FindIterable<Document> iterable = collection.find(
//                new Document("majorsector_percent.Name", "Energy and mining").append("majorsector_percent.Percent",new Document("$lt", 40)));
//        iterable.forEach(new Block<Document>() {
//            @Override
//            public void apply(final Document document) {
//                System.out.println(document);
//            }
//        });
        //*****************************************************
        //permet d'ouvrir l'interface
        //****************************************************/
        MainWindow page = new MainWindow();






    }
}
