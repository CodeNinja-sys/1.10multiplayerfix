/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.f.e;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import org.apache.a.f.e.g;
import org.apache.a.f.e.k;

public class j {
    public static SSLContext a() {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, null, null);
            return sSLContext;
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new k(noSuchAlgorithmException.getMessage(), noSuchAlgorithmException);
        }
        catch (KeyManagementException keyManagementException) {
            throw new k(keyManagementException.getMessage(), keyManagementException);
        }
    }

    public static SSLContext b() {
        try {
            return SSLContext.getInstance("Default");
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            return j.a();
        }
    }

    public static g c() {
        return new g();
    }
}

