package observerpattern;

public class WeatherData implements Subject {
    private List<Observer> observerList;

    WeatherData() {
        observerList = new ArrayList();
    }

    @override
    public void registerObserver(Observer o) {
        observerList.add(o);
    }

    @override
    public void removeObserver(Observer o) {
        int i = observerList.indexOf(o);
        observerList.remove(i);
    }

    @override
    public void notifyObservers() {
        for (Observer o : observerList) {
            o.update();
        }
    }

    public void dataChanged() {
        notifyObservers();
    }
}
