package eu.lestard.sonstiges;

import java.util.ArrayList;
import java.util.List;

public class Trigger {

    private List<Runnable> actions = new ArrayList<>();

    public void subscribe(Runnable action) {
        actions.add(action);
    }

    public void unsubscribe(Runnable action) {
        actions.remove(action);
    }

    public void trigger() {
        actions.stream()
                .forEach(Runnable::run);
    }

    public void triggerAsync() {
        actions.parallelStream()
                .forEach(Runnable::run);
    }

}
