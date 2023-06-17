/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.ad;
import com.ibm.icu.d.bx;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class ae
implements Comparable {
    private int a;
    private byte[] b = null;
    private int c;
    private InputStream d = null;
    private String e;
    private String f;

    public Reader a() {
        InputStream inputStream = this.d;
        if (inputStream == null) {
            inputStream = new ByteArrayInputStream(this.b, 0, this.c);
        }
        try {
            inputStream.reset();
            return new InputStreamReader(inputStream, this.d());
        }
        catch (IOException iOException) {
            return null;
        }
    }

    public String b() {
        return this.a(-1);
    }

    public String a(int n2) {
        int n3;
        String string = null;
        if (this.d != null) {
            StringBuilder stringBuilder = new StringBuilder();
            char[] arrc = new char[1024];
            Reader reader = this.a();
            int n4 = n2 < 0 ? Integer.MAX_VALUE : n2;
            int n5 = 0;
            while ((n5 = reader.read(arrc, 0, Math.min(n4, 1024))) >= 0) {
                stringBuilder.append(arrc, 0, n5);
                n4 -= n5;
            }
            reader.close();
            return stringBuilder.toString();
        }
        String string2 = this.d();
        int n6 = n3 = string2.indexOf("_rtl") < 0 ? string2.indexOf("_ltr") : string2.indexOf("_rtl");
        if (n3 > 0) {
            string2 = string2.substring(0, n3);
        }
        string = new String(this.b, string2);
        return string;
    }

    public int c() {
        return this.a;
    }

    public String d() {
        return this.e;
    }

    public String e() {
        return this.f;
    }

    public int a(ae ae2) {
        int n2 = 0;
        if (this.a > ae2.a) {
            n2 = 1;
        } else if (this.a < ae2.a) {
            n2 = -1;
        }
        return n2;
    }

    ae(ad ad2, bx bx2, int n2) {
        this.a = n2;
        if (ad2.h == null) {
            this.b = ad2.f;
            this.c = ad2.g;
        }
        this.d = ad2.h;
        this.e = bx2.a();
        this.f = bx2.b();
    }

    ae(ad ad2, bx bx2, int n2, String string, String string2) {
        this.a = n2;
        if (ad2.h == null) {
            this.b = ad2.f;
            this.c = ad2.g;
        }
        this.d = ad2.h;
        this.e = string;
        this.f = string2;
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.a((ae)object);
    }
}

