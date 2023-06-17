/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.al;
import com.ibm.icu.a.am;
import java.io.IOException;
import java.io.InputStream;
import java.security.AccessControlException;
import java.security.AccessController;
import java.util.MissingResourceException;
import java.util.Properties;

public class ak {
    public static final String a = "/com/ibm/icu/ICUConfig.properties";
    private static final Properties b = new Properties();

    public static String a(String string) {
        return ak.a(string, null);
    }

    public static String a(String string, String string2) {
        String string3 = null;
        String string4 = string;
        if (System.getSecurityManager() != null) {
            try {
                string3 = (String)AccessController.doPrivileged(new al(string4));
            }
            catch (AccessControlException accessControlException) {}
        } else {
            string3 = System.getProperty(string);
        }
        if (string3 == null) {
            string3 = b.getProperty(string, string2);
        }
        return string3;
    }

    static {
        try {
            InputStream inputStream = am.b(a);
            if (inputStream != null) {
                b.load(inputStream);
            }
        }
        catch (MissingResourceException missingResourceException) {
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }
}

