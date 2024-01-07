package steppp1518.service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import steppp1518.database.Waste;
import steppp1518.database.WastesRepository;

import java.util.Collection;
import java.util.Date;

@Component
public class WastesDBService implements WastesService {
    @Autowired
    WastesRepository wastesRepository;
    @Transactional
    @Override
    public void addWaste(final Waste waste) {
        wastesRepository.save(waste);
    }

    @Override
    public void removeWasteForId(final Date id) {

    }

    @Transactional
    @Override
    public void removeWastesForEmail(final String email) {
    }

    @Transactional
    @Override
    public Collection<Waste> getWastes(final String email) {
        return wastesRepository.findByEmail(email);
    }
}
