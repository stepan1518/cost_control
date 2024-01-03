package steppp1518.service;

import steppp1518.database.Waste;

import java.util.Collection;
import java.util.Date;

public interface WastesService {
    void addWaste(final Waste waste);
    void removeWasteForId(final Date id);
    void removeWastesForEmail(final String email);
    Collection<Waste> getWastes(final String email);
}
