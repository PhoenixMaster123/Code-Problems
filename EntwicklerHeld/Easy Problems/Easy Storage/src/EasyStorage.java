import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EasyStorage {

    private HashMap<String, String> storage;

    public EasyStorage() {
        this.storage = new HashMap<>();
    }

    public void store(String item, String repository) {
        if (item == null || repository == null)
        {
           throw new NullPointerException();
        }
        else if(item.isEmpty() || repository.isEmpty())
        {
            throw new IllegalArgumentException();
        }
        storage.put(item, repository);
    }

    public Map<String, String> getAllData() {
        return storage;
    }

    public String getRepository(String item) {
        return storage.get(item);
    }

    public Set<String> getItems(String repository) {
        Set<String> items = new HashSet<>();
        for (Map.Entry<String, String> entry : storage.entrySet()) {
            if (entry.getValue().equals(repository)) {
                items.add(entry.getKey());
            }
        }
        return items;
    }
    ////////////////////////////////// Variant 2 ////////////////////////////
    /*
     public Set<String> getItems(String repository){
        return this.storageMap.entrySet().stream()
            .filter(entry -> entry.getValue().equals(repository))
            .map(entry -> entry.getKey())
            .collect(Collectors.toSet());
    }
     */
}
