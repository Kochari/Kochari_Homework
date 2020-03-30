package hw09.DAO;

import hw09.Family;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;


    public class FamilyDao implements CollectionFamilyDao<Family> {

        List<Family> families = new LinkedList<>();

        @Override
        public List<Family> getAllFamilies() {
            return families;
        }

        @Override
        public Optional<Family> getFamilyByIndex(int index) {
            return Optional.ofNullable(families.get(index));
        }

        @Override
        public boolean deleteFamily(Family family) {
            return families.remove(family);
        }

        @Override
        public boolean deleteFamily(int index) {
            return families.remove(families.get(index));
        }

        @Override
        public Family saveFamily(Family family) {
            families.add(family);
            return family;
        }
    }


