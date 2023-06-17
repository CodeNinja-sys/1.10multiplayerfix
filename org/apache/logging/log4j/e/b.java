/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.e;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.apache.logging.log4j.d;
import org.apache.logging.log4j.e.c;

public class b {
    private static final b a = new b("log4j2.component.properties");
    private static final d b = org.apache.logging.log4j.d.d.k();
    private final Properties c;

    public b(Properties properties) {
        this.c = properties;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    static Properties a(InputStream inputStream, Object object) {
        Properties properties = new Properties();
        if (null != inputStream) {
            try {
                properties.load(inputStream);
            }
            catch (IOException iOException) {
                b.b("Unable to read " + object, (Throwable)iOException);
            }
            finally {
                try {
                    inputStream.close();
                }
                catch (IOException iOException) {
                    b.b("Unable to close " + object, (Throwable)iOException);
                }
            }
        }
        return properties;
    }

    public b(String string) {
        ClassLoader classLoader = org.apache.logging.log4j.e.c.c();
        InputStream inputStream = classLoader.getResourceAsStream(string);
        this.c = org.apache.logging.log4j.e.b.a(inputStream, string);
    }

    public static b a() {
        return a;
    }

    public String a(String string) {
        String string2 = null;
        try {
            string2 = System.getProperty(string);
        }
        catch (SecurityException securityException) {
            // empty catch block
        }
        return string2 == null ? this.c.getProperty(string) : string2;
    }

    public int a(String string, int n2) {
        String string2 = null;
        try {
            string2 = System.getProperty(string);
        }
        catch (SecurityException securityException) {
            // empty catch block
        }
        if (string2 == null) {
            string2 = this.c.getProperty(string);
        }
        if (string2 != null) {
            try {
                return Integer.parseInt(string2);
            }
            catch (Exception exception) {
                return n2;
            }
        }
        return n2;
    }

    public long a(String string, long l2) {
        String string2 = null;
        try {
            string2 = System.getProperty(string);
        }
        catch (SecurityException securityException) {
            // empty catch block
        }
        if (string2 == null) {
            string2 = this.c.getProperty(string);
        }
        if (string2 != null) {
            try {
                return Long.parseLong(string2);
            }
            catch (Exception exception) {
                return l2;
            }
        }
        return l2;
    }

    public String a(String string, String string2) {
        String string3 = this.a(string);
        return string3 == null ? string2 : string3;
    }

    public boolean b(String string) {
        return this.a(string, false);
    }

    public boolean a(String string, boolean bl2) {
        String string2 = this.a(string);
        return string2 == null ? bl2 : "true".equalsIgnoreCase(string2);
    }

    public static Properties b() {
        try {
            return new Properties(System.getProperties());
        }
        catch (SecurityException securityException) {
            org.apache.logging.log4j.d.d.k().b("Unable to access system properties.");
            return new Properties();
        }
    }
}

