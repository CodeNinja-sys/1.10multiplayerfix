/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.f.e;

import java.net.Socket;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import javax.net.ssl.X509KeyManager;
import org.apache.a.f.e.d;
import org.apache.a.f.e.e;

class h
implements X509KeyManager {
    private final X509KeyManager a;
    private final e b;

    h(X509KeyManager x509KeyManager, e e2) {
        this.a = x509KeyManager;
        this.b = e2;
    }

    public String[] getClientAliases(String string, Principal[] arrprincipal) {
        return this.a.getClientAliases(string, arrprincipal);
    }

    public String chooseClientAlias(String[] arrstring, Principal[] arrprincipal, Socket socket) {
        HashMap<String, d> hashMap = new HashMap<String, d>();
        for (String string : arrstring) {
            String[] arrstring2 = this.a.getClientAliases(string, arrprincipal);
            if (arrstring2 == null) continue;
            for (String string2 : arrstring2) {
                hashMap.put(string2, new d(string, this.a.getCertificateChain(string2)));
            }
        }
        return this.b.a(hashMap, socket);
    }

    public String[] getServerAliases(String string, Principal[] arrprincipal) {
        return this.a.getServerAliases(string, arrprincipal);
    }

    public String chooseServerAlias(String string, Principal[] arrprincipal, Socket socket) {
        HashMap<String, d> hashMap = new HashMap<String, d>();
        String[] arrstring = this.a.getServerAliases(string, arrprincipal);
        if (arrstring != null) {
            for (String string2 : arrstring) {
                hashMap.put(string2, new d(string, this.a.getCertificateChain(string2)));
            }
        }
        return this.b.a(hashMap, socket);
    }

    public X509Certificate[] getCertificateChain(String string) {
        return this.a.getCertificateChain(string);
    }

    public PrivateKey getPrivateKey(String string) {
        return this.a.getPrivateKey(string);
    }
}

