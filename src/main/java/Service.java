import io.reactivex.Observable;

/**
 * Created by vapa1115 on 11/27/2018.
 */
public class Service {

    Observable < Quote > getAllDocs() {
        return Observable.fromArray(getAllQuote());
    }

    private Quote [] getAllQuote() {
        Quote[] array = {
                Quote.create("Java Microservice", "Refcardz"),
                Quote.create("RX Java", "Article"),
                Quote.create("IOT in Action", "Refcardz"),
                Quote.create("Java8 in Action", "Refcardz"),
        };
        return array;
    }
}
