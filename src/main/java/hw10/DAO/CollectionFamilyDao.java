package hw10.DAO;


import java.util.List;
import java.util.Optional;

public interface CollectionFamilyDao<F> {
    List<F> getAllFamilies();
    Optional<F> getFamilyByIndex(int index);
    boolean deleteFamily(F family);
    boolean deleteFamily(int index);
    F saveFamily(F family);
}
