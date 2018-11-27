import io.reactivex.Observable;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;

/**
 * Created by vapa1115 on 11/27/2018.
 */

public class Client {
    public static void main(String as[]) {

        fromArrayRx("1","2");
        fromSingleObject();
        Service service=new Service();
        service.getAllDocs().subscribe(new Consumer<Quote>() {
            public void accept(@NonNull Quote quote) throws Exception {
                System.out.println("accept quote"+quote.getType());
            }


        });
    }

    private static void fromSingleObject() {
        Observable.just("Hello", "World")
                .subscribe(new Consumer<String>() {
                    public void accept(@NonNull String s) throws Exception {
                        System.out.println("accept "+s);
                    }
                });
    }

    public static void fromArrayRx(String... names) {
        Observable.fromArray(names).subscribe(new Consumer<String>() {
            public void accept(@NonNull String s) throws Exception {
            System.out.println("accept "+s);
            }
        }, new Consumer<Throwable>() {
            public void accept(@NonNull Throwable throwable) throws Exception {
                System.out.println("throwable "+throwable);
            }
        }, new Action() {
            public void run() throws Exception {
                System.out.println("Action Run");
            }
        });
    }
}
