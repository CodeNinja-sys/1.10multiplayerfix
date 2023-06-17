/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.a;

import com.a.b.ab;
import com.c.c.a.f;
import com.c.c.a.h;
import com.c.c.a.w;
import com.c.c.b.z;
import com.c.c.i;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.a.c.c.e;
import org.apache.a.c.c.n;
import org.apache.a.i.b.ai;
import org.apache.a.i.b.m;

class g
extends Thread {
    final /* synthetic */ z a;
    final /* synthetic */ long b;
    final /* synthetic */ int c;
    final /* synthetic */ String d;
    final /* synthetic */ String e;
    final /* synthetic */ String f;
    final /* synthetic */ w g;
    final /* synthetic */ File h;
    final /* synthetic */ f i;

    g(f f2, z z2, long l2, int n2, String string, String string2, String string3, w w2, File file) {
        this.i = f2;
        this.a = z2;
        this.b = l2;
        this.c = n2;
        this.d = string;
        this.e = string2;
        this.f = string3;
        this.g = w2;
        this.h = file;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        block18: {
            com.c.c.a.f.a(this.i, new n("http://" + this.a.b() + ":" + String.valueOf(this.a.d()) + "/upload" + "/" + String.valueOf(this.b) + "/" + String.valueOf(this.c)));
            m m2 = null;
            try {
                String string;
                m2 = ai.a().a(com.c.c.a.f.a(this.i)).i();
                String string2 = com.c.c.i.a();
                if (string2 != null) {
                    com.c.c.a.f.b(this.i).b("Cookie", "sid=" + this.d + ";token=" + this.a.a() + ";user=" + this.e + ";version=" + this.f + ";realms_version=" + string2);
                } else {
                    com.c.c.a.f.b(this.i).b("Cookie", "sid=" + this.d + ";token=" + this.a.a() + ";user=" + this.e + ";version=" + this.f);
                }
                this.g.b = this.h.length();
                h h2 = new h((InputStream)new FileInputStream(this.h), this.h.length(), this.g);
                h2.a("application/octet-stream");
                com.c.c.a.f.b(this.i).a(h2);
                e e2 = m2.b(com.c.c.a.f.b(this.i));
                int n2 = e2.a().b();
                if (n2 == 401) {
                    com.c.c.a.f.e().a("Realms server returned 401: " + e2.c("WWW-Authenticate"));
                }
                com.c.c.a.f.a(this.i, n2);
                if (e2.b() == null || (string = org.apache.a.o.g.a(e2.b(), "UTF-8")) == null) break block18;
                try {
                    ab ab2 = new ab();
                    com.c.c.a.f.a(this.i, ab2.a(string).t().c("errorMsg").d());
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
            catch (Exception exception) {
                if (!com.c.c.a.f.c(this.i)) {
                    com.c.c.a.f.e().b("Caught exception while uploading: ", (Throwable)exception);
                }
            }
            finally {
                com.c.c.a.f.b(this.i).m();
                com.c.c.a.f.a(this.i, true);
                if (m2 != null) {
                    try {
                        m2.close();
                    }
                    catch (IOException iOException) {
                        com.c.c.a.f.e().b("Failed to close Realms upload client");
                    }
                }
            }
        }
    }
}

