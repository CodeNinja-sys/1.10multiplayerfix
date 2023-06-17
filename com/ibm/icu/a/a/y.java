/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a.a;

import com.ibm.icu.a.am;
import com.ibm.icu.a.eb;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class y {
    private BufferedReader a;
    private String b;
    private String c;
    private Class d;
    private int e;

    public y(String string, String string2) {
        this(am.class, "data/" + string, string2);
    }

    public y(String string) {
        this(am.class, "data/" + string);
    }

    public y(Class class_, String string, String string2) {
        this.d = class_;
        this.b = string;
        this.c = string2;
        this.e = -1;
        this.f();
    }

    public y(InputStream inputStream, String string, String string2) {
        this.d = null;
        this.b = string;
        this.c = string2;
        this.e = -1;
        try {
            InputStreamReader inputStreamReader = string2 == null ? new InputStreamReader(inputStream) : new InputStreamReader(inputStream, string2);
            this.a = new BufferedReader(inputStreamReader);
            this.e = 0;
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            // empty catch block
        }
    }

    public y(InputStream inputStream, String string) {
        this(inputStream, string, null);
    }

    public y(Class class_, String string) {
        this.d = class_;
        this.b = string;
        this.c = null;
        this.e = -1;
        try {
            this.f();
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            // empty catch block
        }
    }

    public String a() {
        if (this.e == 0) {
            ++this.e;
            String string = this.a.readLine();
            if (string.charAt(0) == '\uffef' || string.charAt(0) == '\ufeff') {
                string = string.substring(1);
            }
            return string;
        }
        ++this.e;
        return this.a.readLine();
    }

    public String a(boolean bl2) {
        String string;
        int n2;
        do {
            if ((string = this.a()) != null) continue;
            return string;
        } while ((n2 = eb.a(string, 0)) == string.length() || string.charAt(n2) == '#');
        if (bl2) {
            string = string.substring(n2);
        }
        return string;
    }

    public String b() {
        return this.a(false);
    }

    public int c() {
        return this.e;
    }

    public String d() {
        return this.b + ':' + this.e;
    }

    public void e() {
        try {
            this.f();
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            // empty catch block
        }
    }

    private void f() {
        if (this.e == 0) {
            return;
        }
        InputStream inputStream = am.a(this.d, this.b);
        if (inputStream == null) {
            throw new IllegalArgumentException("Can't open " + this.b);
        }
        InputStreamReader inputStreamReader = this.c == null ? new InputStreamReader(inputStream) : new InputStreamReader(inputStream, this.c);
        this.a = new BufferedReader(inputStreamReader);
        this.e = 0;
    }
}

