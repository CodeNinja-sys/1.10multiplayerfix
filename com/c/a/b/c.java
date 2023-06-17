/*
 * Decompiled with CFR 0.150.
 */
package com.c.a.b;

import com.c.a.b;
import com.c.a.b.a;
import com.c.a.e;
import com.c.a.g;
import com.c.a.h;
import com.c.a.k;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import org.apache.commons.c.am;

public class c
extends h {
    private static final URL g = com.c.a.g.a("https://login.minecraft.net");
    private static final int h = 14;
    private static final int i = 2;
    private static final int j = 3;
    private static final int k = 4;
    private String l;

    protected c(a a2) {
        super(a2);
    }

    @Override
    public void n() {
        String string;
        String string2;
        String string3;
        String string4;
        if (am.c((CharSequence)this.d())) {
            throw new com.c.a.a.c("Invalid username");
        }
        if (am.c((CharSequence)this.e())) {
            throw new com.c.a.a.c("Invalid password");
        }
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        hashMap.put("user", this.d());
        hashMap.put("password", this.e());
        hashMap.put("version", 14);
        try {
            string4 = this.r().a(g, com.c.a.g.a(hashMap), "application/x-www-form-urlencoded").trim();
        }
        catch (IOException iOException) {
            throw new com.c.a.a.a("Authentication server is not responding", iOException);
        }
        String[] arrstring = string4.split(":");
        if (arrstring.length == 5) {
            string3 = arrstring[4];
            string2 = arrstring[2];
            string = arrstring[3];
            if (am.c((CharSequence)string3) || am.c((CharSequence)string2) || am.c((CharSequence)string)) {
                throw new com.c.a.a.a("Unknown response from authentication server: " + string4);
            }
        } else {
            throw new com.c.a.a.c(string4);
        }
        this.a(new e(com.c.d.b.b(string3), string2));
        this.l = string;
        this.a(com.c.a.k.a);
    }

    @Override
    public void b() {
        super.b();
        this.l = null;
    }

    @Override
    public boolean o() {
        return this.c() && this.g() != null && this.q() != null;
    }

    @Override
    public e[] p() {
        if (this.g() != null) {
            return new e[]{this.g()};
        }
        return new e[0];
    }

    @Override
    public void b(e e2) {
        throw new UnsupportedOperationException("Game profiles cannot be changed in the legacy authentication service");
    }

    @Override
    public String q() {
        return this.l;
    }

    @Override
    public String i() {
        return this.d();
    }

    public a r() {
        return (a)super.m();
    }

    @Override
    public /* synthetic */ g m() {
        return this.r();
    }

    @Override
    public /* synthetic */ b h() {
        return this.r();
    }
}

