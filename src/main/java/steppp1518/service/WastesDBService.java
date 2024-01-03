package steppp1518.service;

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
    @Override
    public synchronized void addWaste(final Waste waste) {
        waste.setDate(new Date());
        wastesRepository.save(waste);
    }

    @Override
    public void removeWasteForId(final Date id) {

    }

    @Override
    public void removeWastesForEmail(final String email) {

    }

    @Override
    public synchronized Collection<Waste> getWastes(final String email) {
        return wastesRepository.findByEmail(email);
    }
}
