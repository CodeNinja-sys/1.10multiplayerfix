/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.a;

import com.c.c.a.a;
import com.c.c.a.c;
import com.c.c.a.d;
import com.c.c.a.e;
import com.c.c.b.ab;
import com.c.c.d.a.z;
import java.awt.event.ActionListener;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.a.c.c.j;
import org.apache.a.i.b.ai;
import org.apache.a.i.b.m;
import org.apache.commons.b.t;

class b
extends Thread {
    final /* synthetic */ ab a;
    final /* synthetic */ z b;
    final /* synthetic */ String c;
    final /* synthetic */ net.minecraft.s.c d;
    final /* synthetic */ a e;

    b(a a2, ab ab2, z z2, String string, net.minecraft.s.c c2) {
        this.e = a2;
        this.a = ab2;
        this.b = z2;
        this.c = string;
        this.d = c2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void run() {
        Closeable closeable = null;
        try {
            com.c.c.a.a.a(this.e, File.createTempFile("backup", ".tar.gz"));
            com.c.c.a.a.a(this.e, new j(this.a.a));
            closeable = ai.a().a(com.c.c.a.a.a(this.e)).i();
            org.apache.a.c.c.e e2 = ((m)closeable).b(com.c.c.a.a.b(this.e));
            this.b.b = Long.parseLong(e2.c("Content-Length").d());
            if (e2.a().b() != 200) {
                com.c.c.a.a.a(this.e, true);
                com.c.c.a.a.b(this.e).cK_();
                return;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(com.c.c.a.a.c(this.e));
            ActionListener actionListener = new d(this.e, this.c.trim(), com.c.c.a.a.c(this.e), this.d, this.b, this.a, null);
            c c2 = new c(this.e, fileOutputStream);
            c2.a(actionListener);
            t.a(e2.b().f(), (OutputStream)c2);
            return;
        }
        catch (Exception exception) {
            com.c.c.a.a.e().b("Caught exception while downloading: " + exception.getMessage());
            com.c.c.a.a.a(this.e, true);
            return;
        }
        finally {
            block40: {
                block41: {
                    org.apache.a.c.c.e e3;
                    com.c.c.a.a.b(this.e).m();
                    if (com.c.c.a.a.c(this.e) != null) {
                        com.c.c.a.a.c(this.e).delete();
                    }
                    if (com.c.c.a.a.d(this.e)) break block40;
                    if (this.a.b.isEmpty() || this.a.c.isEmpty()) break block41;
                    try {
                        com.c.c.a.a.a(this.e, File.createTempFile("resources", ".tar.gz"));
                        com.c.c.a.a.a(this.e, new j(this.a.b));
                        e3 = ((m)closeable).b(com.c.c.a.a.b(this.e));
                        this.b.b = Long.parseLong(e3.c("Content-Length").d());
                        if (e3.a().b() != 200) {
                            com.c.c.a.a.a(this.e, true);
                            com.c.c.a.a.b(this.e).cK_();
                            return;
                        }
                    }
                    catch (Exception exception) {
                        com.c.c.a.a.e().b("Caught exception while downloading: " + exception.getMessage());
                        com.c.c.a.a.a(this.e, true);
                    }
                    FileOutputStream fileOutputStream = new FileOutputStream(com.c.c.a.a.c(this.e));
                    e e4 = new e(this.e, com.c.c.a.a.c(this.e), this.b, this.a, null);
                    c c3 = new c(this.e, fileOutputStream);
                    c3.a(e4);
                    t.a(e3.b().f(), (OutputStream)c3);
                    break block40;
                    finally {
                        com.c.c.a.a.b(this.e).m();
                        if (com.c.c.a.a.c(this.e) != null) {
                            com.c.c.a.a.c(this.e).delete();
                        }
                    }
                }
                com.c.c.a.a.b(this.e, true);
            }
            if (closeable != null) {
                try {
                    closeable.close();
                }
                catch (IOException iOException) {
                    com.c.c.a.a.e().b("Failed to close Realms download client");
                }
            }
        }
    }
}

