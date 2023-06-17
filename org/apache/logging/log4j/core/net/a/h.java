/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.net.a;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import org.apache.logging.log4j.core.net.a.f;
import org.apache.logging.log4j.core.net.a.g;

public class h
extends f {
    private KeyStore b = null;
    private String c = "JKS";

    public h(String string, String string2) {
        super(string, string2);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    protected void a() {
        KeyStore keyStore;
        block14: {
            keyStore = null;
            InputStream inputStream = null;
            a.a("Loading truststore from file with params(location={})", new Object[]{this.c()});
            if (this.c() == null) {
                throw new IOException("The location is null");
            }
            keyStore = KeyStore.getInstance(this.c);
            inputStream = new FileInputStream(this.c());
            keyStore.load(inputStream, this.e());
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
                break block14;
            }
            catch (Exception exception) {
                a.f("Error closing {}", this.c(), exception);
            }
            break block14;
            catch (CertificateException certificateException) {
                try {
                    a.b("No Provider supports a KeyStoreSpi implementation for the specified type {}", this.c);
                    throw new g(certificateException);
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
                        a.b("Something is wrong with the format of the truststore or the given password: {}", iOException.getMessage());
                        throw new g(iOException);
                    }
                }
                catch (Throwable throwable) {
                    try {
                        if (inputStream == null) throw throwable;
                        inputStream.close();
                        throw throwable;
                    }
                    catch (Exception exception) {
                        a.f("Error closing {}", this.c(), exception);
                    }
                    throw throwable;
                }
            }
        }
        this.b = keyStore;
        a.a("Truststore successfully loaded with params(location={})", new Object[]{this.c()});
    }

    public KeyStore b() {
        if (this.b == null) {
            this.a();
        }
        return this.b;
    }

    public static h a(String string, String string2) {
        return new h(string, string2);
    }
}

