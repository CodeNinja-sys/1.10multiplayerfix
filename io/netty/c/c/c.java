/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.c;

import io.netty.b.g;
import io.netty.b.j;
import io.netty.c.c.b;
import io.netty.c.c.d;
import io.netty.c.c.n;
import java.io.File;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.Security;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.EncryptedPrivateKeyInfo;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSessionContext;

public final class c
extends b {
    private final SSLContext d;
    private final List e;

    public c(File file, File file2) {
        this(file, file2, null);
    }

    public c(File file, File file2, String string) {
        this(file, file2, string, null, null, 0L, 0L);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public c(File file, File file2, String string, Iterable iterable, Iterable iterable2, long l2, long l3) {
        super(iterable);
        Object object;
        Object object2;
        Object object3;
        if (file == null) {
            throw new NullPointerException("certChainFile");
        }
        if (file2 == null) {
            throw new NullPointerException("keyFile");
        }
        if (string == null) {
            string = "";
        }
        if (iterable2 != null && iterable2.iterator().hasNext()) {
            if (!io.netty.c.c.d.a()) {
                throw new SSLException("NPN/ALPN unsupported: " + iterable2);
            }
            object3 = new ArrayList();
            object2 = iterable2.iterator();
            while (object2.hasNext() && (object = (String)object2.next()) != null) {
                object3.add(object);
            }
            this.e = Collections.unmodifiableList(object3);
        } else {
            this.e = Collections.emptyList();
        }
        object3 = Security.getProperty("ssl.KeyManagerFactory.algorithm");
        if (object3 == null) {
            object3 = "SunX509";
        }
        try {
            PrivateKey privateKey;
            object2 = KeyStore.getInstance("JKS");
            ((KeyStore)object2).load(null, null);
            object = CertificateFactory.getInstance("X.509");
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            KeyFactory keyFactory2 = KeyFactory.getInstance("DSA");
            g g2 = n.b(file2);
            byte[] arrby = new byte[g2.r()];
            g2.b(arrby).ad();
            char[] arrc = string.toCharArray();
            PKCS8EncodedKeySpec pKCS8EncodedKeySpec = io.netty.c.c.c.a(arrc, arrby);
            try {
                privateKey = keyFactory.generatePrivate(pKCS8EncodedKeySpec);
            }
            catch (InvalidKeySpecException invalidKeySpecException) {
                privateKey = keyFactory2.generatePrivate(pKCS8EncodedKeySpec);
            }
            ArrayList<Certificate> arrayList = new ArrayList<Certificate>();
            g[] arrg = n.a(file);
            try {
                for (g g3 : arrg) {
                    arrayList.add(((CertificateFactory)object).generateCertificate(new j(g3)));
                }
            }
            finally {
                for (g g3 : arrg) {
                    g3.ad();
                }
            }
            ((KeyStore)object2).setKeyEntry("key", privateKey, arrc, arrayList.toArray(new Certificate[arrayList.size()]));
            KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance((String)object3);
            keyManagerFactory.init((KeyStore)object2, arrc);
            this.d = SSLContext.getInstance("TLS");
            this.d.init(keyManagerFactory.getKeyManagers(), null, null);
            SSLSessionContext sSLSessionContext = this.d.getServerSessionContext();
            if (l2 > 0L) {
                sSLSessionContext.setSessionCacheSize((int)Math.min(l2, Integer.MAX_VALUE));
            }
            if (l3 > 0L) {
                sSLSessionContext.setSessionTimeout((int)Math.min(l3, Integer.MAX_VALUE));
            }
        }
        catch (Exception exception) {
            throw new SSLException("failed to initialize the server-side SSL context", exception);
        }
    }

    @Override
    public boolean a() {
        return false;
    }

    @Override
    public List b() {
        return this.e;
    }

    @Override
    public SSLContext c() {
        return this.d;
    }

    private static PKCS8EncodedKeySpec a(char[] arrc, byte[] arrby) {
        if (arrc == null || arrc.length == 0) {
            return new PKCS8EncodedKeySpec(arrby);
        }
        EncryptedPrivateKeyInfo encryptedPrivateKeyInfo = new EncryptedPrivateKeyInfo(arrby);
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(encryptedPrivateKeyInfo.getAlgName());
        PBEKeySpec pBEKeySpec = new PBEKeySpec(arrc);
        SecretKey secretKey = secretKeyFactory.generateSecret(pBEKeySpec);
        Cipher cipher = Cipher.getInstance(encryptedPrivateKeyInfo.getAlgName());
        cipher.init(2, (Key)secretKey, encryptedPrivateKeyInfo.getAlgParameters());
        return encryptedPrivateKeyInfo.getKeySpec(cipher);
    }
}

