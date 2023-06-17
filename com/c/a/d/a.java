/*
 * Decompiled with CFR 0.150.
 */
package com.c.a.d;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import org.apache.commons.a.a.d;

public class a {
    private final String a;
    private final String b;
    private final String c;

    public a(String string, String string2) {
        this(string, string2, null);
    }

    public a(String string, String string2, String string3) {
        this.a = string;
        this.b = string2;
        this.c = string3;
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.c;
    }

    public boolean d() {
        return this.c != null;
    }

    public boolean a(PublicKey publicKey) {
        try {
            Signature signature = Signature.getInstance("SHA1withRSA");
            signature.initVerify(publicKey);
            signature.update(this.b.getBytes());
            return signature.verify(d.b(this.c));
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            noSuchAlgorithmException.printStackTrace();
        }
        catch (InvalidKeyException invalidKeyException) {
            invalidKeyException.printStackTrace();
        }
        catch (SignatureException signatureException) {
            signatureException.printStackTrace();
        }
        return false;
    }
}

