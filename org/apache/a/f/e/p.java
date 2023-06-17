/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.f.e;

import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocket;

public interface p
extends HostnameVerifier {
    public void a(String var1, SSLSocket var2);

    public void a(String var1, X509Certificate var2);

    public void a(String var1, String[] var2, String[] var3);
}

