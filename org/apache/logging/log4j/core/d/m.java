/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.d;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLDecoder;
import org.apache.logging.log4j.d;

public final class m {
    private static final String a = "file";
    private static final String b = "vfsfile";
    private static final d c = org.apache.logging.log4j.d.d.k();

    private m() {
    }

    public static File a(URI uRI) {
        if (uRI == null || uRI.getScheme() != null && !a.equals(uRI.getScheme()) && !b.equals(uRI.getScheme())) {
            return null;
        }
        if (uRI.getScheme() == null) {
            try {
                uRI = new File(uRI.getPath()).toURI();
            }
            catch (Exception exception) {
                c.f("Invalid URI " + uRI);
                return null;
            }
        }
        try {
            return new File(URLDecoder.decode(uRI.toURL().getFile(), "UTF8"));
        }
        catch (MalformedURLException malformedURLException) {
            c.f("Invalid URL " + uRI, (Throwable)malformedURLException);
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            c.f("Invalid encoding: UTF8", (Throwable)unsupportedEncodingException);
        }
        return null;
    }

    public static boolean a(URL uRL) {
        return uRL != null && (uRL.getProtocol().equals(a) || uRL.getProtocol().equals(b));
    }

    public static void a(File file, boolean bl2) {
        if (!file.exists()) {
            if (!bl2) {
                throw new IOException("The directory " + file.getAbsolutePath() + " does not exist.");
            }
            if (!file.mkdirs()) {
                throw new IOException("Could not create directory " + file.getAbsolutePath());
            }
        }
        if (!file.isDirectory()) {
            throw new IOException("File " + file + " exists and is not a directory. Unable to create directory.");
        }
    }
}

