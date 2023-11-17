package repo;

import model.Student;

import java.util.List;

    public interface CrudOperation<T> {
        void create(T object);
        T read(int id);
        void update(T object);
        void delete(T object);
        List<T> getAll();
        Student search(int id);
}
