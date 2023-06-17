/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c;

import io.netty.util.c.ae;
import io.netty.util.c.b.g;
import io.netty.util.c.b.h;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.Locale;

public final class p {
    private static final g a = h.a(p.class);
    private static final String b = "META-INF/native/";
    private static final String c = ae.a("os.name", "").toLowerCase(Locale.US).replaceAll("[^a-z0-9]+", "");
    private static final File d;

    private static File a() {
        File file;
        try {
            file = p.a(ae.b("io.netty.tmpdir"));
            if (file != null) {
                a.b("-Dio.netty.tmpdir: " + file);
                return file;
            }
            file = p.a(ae.b("java.io.tmpdir"));
            if (file != null) {
                a.b("-Dio.netty.tmpdir: " + file + " (java.io.tmpdir)");
                return file;
            }
            if (p.b()) {
                file = p.a(System.getenv("TEMP"));
                if (file != null) {
                    a.b("-Dio.netty.tmpdir: " + file + " (%TEMP%)");
                    return file;
                }
                String string = System.getenv("USERPROFILE");
                if (string != null) {
                    file = p.a(string + "\\AppData\\Local\\Temp");
                    if (file != null) {
                        a.b("-Dio.netty.tmpdir: " + file + " (%USERPROFILE%\\AppData\\Local\\Temp)");
                        return file;
                    }
                    file = p.a(string + "\\Local Settings\\Temp");
                    if (file != null) {
                        a.b("-Dio.netty.tmpdir: " + file + " (%USERPROFILE%\\Local Settings\\Temp)");
                        return file;
                    }
                }
            } else {
                file = p.a(System.getenv("TMPDIR"));
                if (file != null) {
                    a.b("-Dio.netty.tmpdir: " + file + " ($TMPDIR)");
                    return file;
                }
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        file = p.b() ? new File("C:\\Windows\\Temp") : new File("/tmp");
        a.d("Failed to get the temporary directory; falling back to: " + file);
        return file;
    }

    private static File a(String string) {
        if (string == null) {
            return null;
        }
        File file = new File(string);
        file.mkdirs();
        if (!file.isDirectory()) {
            return null;
        }
        try {
            return file.getAbsoluteFile();
        }
        catch (Exception exception) {
            return file;
        }
    }

    private static boolean b() {
        return c.startsWith("windows");
    }

    private static boolean c() {
        return c.startsWith("macosx") || c.startsWith("osx");
    }

    public static void a(String string, ClassLoader classLoader) {
        String string2 = System.mapLibraryName(string);
        String string3 = b + string2;
        URL uRL = classLoader.getResource(string3);
        if (uRL == null && p.c()) {
            uRL = string3.endsWith(".jnilib") ? classLoader.getResource("META-INF/native/lib" + string + ".dynlib") : classLoader.getResource("META-INF/native/lib" + string + ".jnilib");
        }
        if (uRL == null) {
            System.loadLibrary(string);
            return;
        }
        int n2 = string2.lastIndexOf(46);
        String string4 = string2.substring(0, n2);
        String string5 = string2.substring(n2, string2.length());
        InputStream inputStream = null;
        OutputStream outputStream = null;
        File file = null;
        boolean bl2 = false;
        try {
            int n3;
            file = File.createTempFile(string4, string5, d);
            inputStream = uRL.openStream();
            outputStream = new FileOutputStream(file);
            byte[] arrby = new byte[8192];
            while ((n3 = inputStream.read(arrby)) > 0) {
                outputStream.write(arrby, 0, n3);
            }
            outputStream.flush();
            outputStream.close();
            outputStream = null;
            System.load(file.getPath());
            bl2 = true;
        }
        catch (Exception exception) {
            throw (UnsatisfiedLinkError)new UnsatisfiedLinkError("could not load a native library: " + string).initCause(exception);
        }
        finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                }
                catch (IOException iOException) {}
            }
            if (outputStream != null) {
                try {
                    outputStream.close();
                }
                catch (IOException iOException) {}
            }
            if (file != null) {
                if (bl2) {
                    file.deleteOnExit();
                } else if (!file.delete()) {
                    file.deleteOnExit();
                }
            }
        }
    }

    private p() {
    }

    static {
        String string = ae.b("io.netty.native.workdir");
        if (string != null) {
            File file = new File(string);
            file.mkdirs();
            try {
                file = file.getAbsoluteFile();
            }
            catch (Exception exception) {
                // empty catch block
            }
            d = file;
            a.b("-Dio.netty.netty.workdir: " + d);
        } else {
            d = p.a();
            a.b("-Dio.netty.netty.workdir: " + d + " (io.netty.tmpdir)");
        }
    }
}

