package org.team4;


import org.team4.repositories.NasaDataRepository;

import java.io.IOException;
import java.net.URISyntaxException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {

         NasaDataRepository nasaDataRepository = new NasaDataRepository("DEMO_KEY");

        nasaDataRepository.getAPIResponse();
    }
}