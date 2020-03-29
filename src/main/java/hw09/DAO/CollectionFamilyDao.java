package hw09.DAO;


import java.util.List;

public interface CollectionFamilyDao<F> {
    List<F> getAll();
}
