/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.c.a;

import io.netty.b.bi;
import io.netty.c.c.a.a;
import io.netty.c.c.a.g;
import io.netty.c.c.a.m;
import io.netty.util.e;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Date;

public final class h {
    private static final io.netty.util.c.b.g c = io.netty.util.c.b.h.a(h.class);
    static final Date a = new Date(System.currentTimeMillis() - 31536000000L);
    static final Date b = new Date(253402300799000L);
    private final File d;
    private final File e;

    public h() {
        this("example.com");
    }

    public h(String string) {
        this(string, m.a(), 1024);
    }

    public h(String string, SecureRandom secureRandom, int n2) {
        KeyPair keyPair;
        String[] arrstring;
        try {
            arrstring = KeyPairGenerator.getInstance("RSA");
            arrstring.initialize(n2, secureRandom);
            keyPair = arrstring.generateKeyPair();
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new Error(noSuchAlgorithmException);
        }
        try {
            arrstring = g.a(string, keyPair, secureRandom);
        }
        catch (Throwable throwable) {
            c.b("Failed to generate a self-signed X.509 certificate using sun.security.x509:", throwable);
            try {
                arrstring = io.netty.c.c.a.a.a(string, keyPair, secureRandom);
            }
            catch (Throwable throwable2) {
                c.b("Failed to generate a self-signed X.509 certificate using Bouncy Castle:", throwable2);
                throw new CertificateException("No provider succeeded to generate a self-signed certificate. See debug log for the root cause.");
            }
        }
        this.d = new File(arrstring[0]);
        this.e = new File(arrstring[1]);
    }

    public File a() {
        return this.d;
    }

    public File b() {
        return this.e;
    }

    public void c() {
        h.a(this.d);
        h.a(this.e);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    static String[] a(String string, PrivateKey privateKey, X509Certificate x509Certificate) {
        String string2 = "-----BEGIN PRIVATE KEY-----\n" + io.netty.c.a.a.a.a(bi.a(privateKey.getEncoded()), true).a(io.netty.util.e.f) + "\n-----END PRIVATE KEY-----\n";
        File file = File.createTempFile("keyutil_" + string + '_', ".key");
        file.deleteOnExit();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            ((OutputStream)fileOutputStream).write(string2.getBytes(io.netty.util.e.f));
            ((OutputStream)fileOutputStream).close();
            fileOutputStream = null;
        }
        finally {
            if (fileOutputStream != null) {
                h.a(file, fileOutputStream);
                h.a(file);
            }
        }
        String string3 = "-----BEGIN CERTIFICATE-----\n" + io.netty.c.a.a.a.a(bi.a(x509Certificate.getEncoded()), true).a(io.netty.util.e.f) + "\n-----END CERTIFICATE-----\n";
        File file2 = File.createTempFile("keyutil_" + string + '_', ".crt");
        file2.deleteOnExit();
        FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
        try {
            ((OutputStream)fileOutputStream2).write(string3.getBytes(io.netty.util.e.f));
            ((OutputStream)fileOutputStream2).close();
            fileOutputStream2 = null;
        }
        finally {
            if (fileOutputStream2 != null) {
                h.a(file2, fileOutputStream2);
                h.a(file2);
                h.a(file);
            }
        }
        return new String[]{file2.getPath(), file.getPath()};
    }

    private static void a(File file) {
        if (!file.delete()) {
            c.d("Failed to delete a file: " + file);
        }
    }

    private static void a(File file, OutputStream outputStream) {
        try {
            outputStream.close();
        }
        catch (IOException iOException) {
            c.d("Failed to close a file: " + file, iOException);
        }
    }
}

