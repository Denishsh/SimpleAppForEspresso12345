package ru.kkuzmichev.simpleappforespresso.ui;

import androidx.test.espresso.idling.CountingIdlingResource;

public class EspressoIdlingResources {
    private static final String TAG = "Espresso_app";
    public static final CountingIdlingResource idling_resource = new CountingIdlingResource(TAG);

    public static void increment() {
        idling_resource.increment();
    }

    public static void decrement() {
        if (!idling_resource.isIdleNow()) {
            idling_resource.decrement();
        }
    }
}
