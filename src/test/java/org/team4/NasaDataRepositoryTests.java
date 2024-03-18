package org.team4;

import org.junit.Before;
import org.junit.Test;
import org.team4.repositories.NasaDataRepository;


public class NasaDataRepositoryTests {
    @Before
    public void setUp() {
    }

    @Test
    public void DoesNotThrowOnConnect() {
        NasaDataRepository nasaDataRepository = new NasaDataRepository("DEMO_KEY");
        nasaDataRepository.getAPIResponse();
    }
}
