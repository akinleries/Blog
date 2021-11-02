package africa.semicolon.yarn.dat.ropsitories;

import java.util.*;

public class Database<T, ID> implements Repository<T, ID>{

    Map<Integer, T> storage = new HashMap<>();


    @Override
    public T save(T t) {
        Integer id = (storage.size()+1);
        storage.put(id, t);
        return storage.get(id);
    }

    @Override
    public Optional<T> findById(ID id) {
        if(storage.containsKey(id)) return Optional.of(storage.get(id));
        else return Optional.empty();

    }

    @Override
    public void delete(ID id) {
        storage.remove(id);

    }

    @Override
    public List<T> findAll() {
        List<T> all = new ArrayList<>();
        Set<Integer> keys = storage.keySet();
        keys.forEach(key ->all.add(storage.get(key)));
        return all;
    }
}
