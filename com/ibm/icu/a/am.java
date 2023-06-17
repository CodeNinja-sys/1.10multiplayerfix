/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.an;
import com.ibm.icu.a.ao;
import com.ibm.icu.a.ap;
import java.io.InputStream;
import java.net.URL;
import java.security.AccessController;
import java.util.MissingResourceException;

public final class am {
    public static boolean a(String string) {
        URL uRL = null;
        uRL = System.getSecurityManager() != null ? (URL)AccessController.doPrivileged(new an(string)) : am.class.getResource(string);
        return uRL != null;
    }

    private static InputStream a(Class class_, String string, boolean bl2) {
        InputStream inputStream = null;
        inputStream = System.getSecurityManager() != null ? (InputStream)AccessController.doPrivileged(new ao(class_, string)) : class_.getResourceAsStream(string);
        if (inputStream == null && bl2) {
            throw new MissingResourceException("could not locate data " + string, class_.getPackage().getName(), string);
        }
        return inputStream;
    }

    private static InputStream a(ClassLoader classLoader, String string, boolean bl2) {
        InputStream inputStream = null;
        inputStream = System.getSecurityManager() != null ? (InputStream)AccessController.doPrivileged(new ap(classLoader, string)) : classLoader.getResourceAsStream(string);
        if (inputStream == null && bl2) {
            throw new MissingResourceException("could not locate data", classLoader.toString(), string);
        }
        return inputStream;
    }

    public static InputStream a(ClassLoader classLoader, String string) {
        return am.a(classLoader, string, false);
    }

    public static InputStream b(ClassLoader classLoader, String string) {
        return am.a(classLoader, string, true);
    }

    public static InputStream b(String string) {
        return am.a(am.class, string, false);
    }

    public static InputStream c(String string) {
        return am.a(am.class, string, true);
    }

    public static InputStream a(Class class_, String string) {
        return am.a(class_, string, false);
    }

    public static InputStream b(Class class_, String string) {
        return am.a(class_, string, true);
    }
}

