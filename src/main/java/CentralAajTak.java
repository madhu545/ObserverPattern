import java.util.ArrayList;
import java.util.List;

public class CentralAajTak {

    List<IObserver> observersList = new ArrayList<>();

    public void register(IObserver instance) {
        observersList.add(instance);
    }

    public void update(News news) {
        observersList.stream()
                .filter(object ->object.getNewsType().equals(news.getNewsType()))
                .forEach(object -> object.onUpdate(news));

    }
}
