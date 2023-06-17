/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bouncycastle.asn1.x500.X500Name
 *  org.bouncycastle.cert.X509CertificateHolder
 *  org.bouncycastle.cert.jcajce.JcaX509CertificateConverter
 *  org.bouncycastle.cert.jcajce.JcaX509v3CertificateBuilder
 *  org.bouncycastle.jce.provider.BouncyCastleProvider
 *  org.bouncycastle.operator.ContentSigner
 *  org.bouncycastle.operator.jcajce.JcaContentSignerBuilder
 */
package io.netty.c.c.a;

import io.netty.c.c.a.h;
import java.math.BigInteger;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cert.jcajce.JcaX509CertificateConverter;
import org.bouncycastle.cert.jcajce.JcaX509v3CertificateBuilder;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.operator.ContentSigner;
import org.bouncycastle.operator.jcajce.JcaContentSignerBuilder;

final class a {
    private static final Provider a = new BouncyCastleProvider();

    static String[] a(String string, KeyPair keyPair, SecureRandom secureRandom) {
        PrivateKey privateKey = keyPair.getPrivate();
        X500Name x500Name = new X500Name("CN=" + string);
        JcaX509v3CertificateBuilder jcaX509v3CertificateBuilder = new JcaX509v3CertificateBuilder(x500Name, new BigInteger(64, secureRandom), h.a, h.b, x500Name, keyPair.getPublic());
        ContentSigner contentSigner = new JcaContentSignerBuilder("SHA256WithRSAEncryption").build(privateKey);
        X509CertificateHolder x509CertificateHolder = jcaX509v3CertificateBuilder.build(contentSigner);
        X509Certificate x509Certificate = new JcaX509CertificateConverter().setProvider(a).getCertificate(x509CertificateHolder);
        x509Certificate.verify(keyPair.getPublic());
        return h.a(string, privateKey, x509Certificate);
    }

    private a() {
    }
}

