package de.fhro.inf.prg3.a08.services;

import de.fhro.inf.prg3.a08.api.OpenMensaAPI;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by dan on 11/29/17.
 */

public class OpenMensaAPIService {
    private static final OpenMensaAPIService instance = new OpenMensaAPIService();
    Retrofit retrofit = new Retrofit.Builder()
                /* no type adapters are required so the default GSON converter is fine */
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("http://openmensa.org/api/v2/")
                .build();
    private OpenMensaAPI mensaApiInstance = retrofit.create(OpenMensaAPI.class);

    public static OpenMensaAPIService getInstance() {
        return instance;
    }

    private OpenMensaAPIService() {
    }

    public OpenMensaAPI getApi() {
        return mensaApiInstance;
    }
}
