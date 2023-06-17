/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.net.a;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import org.apache.logging.log4j.core.net.a.f;
import org.apache.logging.log4j.core.net.a.g;

public class a
extends f {
    private KeyStore b = null;
    private String c = "JKS";

    public a(String string, String string2) {
        super(string, string2);
    }

    @Override
    protected void a() {
        FileInputStream fileInputStream = null;
        a.a("Loading keystore from file with params(location={})", new Object[]{this.c()});
        try {
            if (this.c() == null) {
                throw new IOException("The location is null");
            }
            fileInputStream = new FileInputStream(this.c());
            KeyStore keyStore = KeyStore.getInstance(this.c);
            keyStore.load(fileInputStream, this.e());
            this.b = keyStore;
        }
        catch (CertificateException certificateException) {
            a.b("No Provider supports a KeyStoreSpi implementation for the specified type {}", this.c);
            throw new g(certificateException);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            a.b("The algorithm used to check the integrity of the keystore cannot be found");
            throw new g(noSuchAlgorithmException);
        }
        catch (KeyStoreException keyStoreException) {
            a.b((Object)keyStoreException);
            throw new g(keyStoreException);
        }
        catch (FileNotFoundException fileNotFoundException) {
            a.b("The keystore file({}) is not found", this.c());
            throw new g(fileNotFoundException);
        }
        catch (IOException iOException) {
            a.b("Something is wrong with the format of the keystore or the given password");
            throw new g(iOException);
        }
        finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            }
            catch (IOException iOException) {}
        }
        a.a("Keystore successfully loaded with params(location={})", new Object[]{this.c()});
    }

    public KeyStore b() {
        if (this.b == null) {
            this.a();
        }
        return this.b;
    }

    public static a a(String string, String string2) {
        return new a(string, string2);
    }
}

