import java.util.ArrayList;
import java.util.List;

public abstract class abstObservable {
    protected List<IObserver> observers = new ArrayList<>();

    public void adicionarObserver(IObserver observer) {
        observers.add(observer);
    }

    public void removerObserver(IObserver observer) {
        observers.remove(observer);
    }

    protected void notificarObservers(String nomeProduto, int novaQuantidade) {
        for (IObserver observer : observers) {
            observer.atualizar(nomeProduto, novaQuantidade);
        }
    }
}
