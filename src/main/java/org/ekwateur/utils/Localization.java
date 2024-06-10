package org.ekwateur.utils;

import org.ekwateur.logging.LoggerService;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class Localization {

    private ResourceBundle resourceBundle;

    public Localization(Locale locale) {
        try {
        resourceBundle = ResourceBundle.getBundle("messages", locale);
        } catch (MissingResourceException e) {
            LoggerService.logError("EK-002 : Can't find bundle for base name messages," + locale.getCountry() , e);
        }
        finally {
            resourceBundle= ResourceBundle.getBundle("messages", new Locale("fr","FR"));
        }
    }

    public String getMessage(String key) {
        return resourceBundle.getString(key);
    }

    public String getCurrencySymbol() {
        return resourceBundle.getString("currencySymbol");
    }

}
