package com.beaas;
//
//import com.google.auth.oauth2.GoogleCredentials;
//import com.google.firebase.FirebaseApp;
//import com.google.firebase.FirebaseOptions;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.FileInputStream;

@Service
public class FBInitialize {
//    @Value("firebase:serviceaccount.json")
//    private Resource myResource;

//    @PostConstruct
//    public void initialize() {
//        try {
//            FileInputStream serviceAccount =
//                    new FileInputStream("resources/firebase/serviceaccount.json");
//
//            FirebaseOptions options = new FirebaseOptions.Builder()
//                    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
//                    .setDatabaseUrl("https://fir-playground-99897-default-rtdb.firebaseio.com")
//                    .build();
//
//            FirebaseApp.initializeApp(options);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }
}