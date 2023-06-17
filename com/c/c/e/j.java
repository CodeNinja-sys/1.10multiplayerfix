/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.e;

import com.a.a.n.a.ci;
import com.c.c.a.m;
import com.c.c.b.n;
import com.c.c.c.b;
import com.c.c.c.c;
import com.c.c.d.a.ae;
import com.c.c.d.a.bg;
import com.c.c.d.d;
import com.c.c.e.f;
import com.c.c.e.i;
import com.c.c.e.k;
import java.io.IOException;

public class j
extends d {
    private final com.c.c.b.i b;
    private final net.minecraft.s.n c;

    public j(net.minecraft.s.n n2, com.c.c.b.i i2) {
        this.c = n2;
        this.b = i2;
    }

    @Override
    public void run() {
        this.b(net.minecraft.s.n.f("mco.connect.connecting"));
        m m2 = m.a();
        boolean bl2 = false;
        boolean bl3 = false;
        int n2 = 5;
        n n3 = null;
        boolean bl4 = false;
        for (int i2 = 0; i2 < 40 && !this.b(); ++i2) {
            try {
                n3 = m2.c(this.b.a);
                bl2 = true;
            }
            catch (c c2) {
                n2 = c2.f;
            }
            catch (b b2) {
                if (b2.c == 6002) {
                    bl4 = true;
                    break;
                }
                bl3 = true;
                this.a(b2.toString());
                f.a().b("Couldn't connect to world", (Throwable)b2);
                break;
            }
            catch (IOException iOException) {
                f.a().b("Couldn't parse response connecting to world", (Throwable)iOException);
            }
            catch (Exception exception) {
                bl3 = true;
                f.a().b("Couldn't connect to world", (Throwable)exception);
                this.a(exception.getLocalizedMessage());
                break;
            }
            if (bl2) break;
            this.a(n2);
        }
        if (bl4) {
            net.minecraft.s.b.a(new bg(this.c, this.b));
        } else if (!this.b() && !bl3) {
            if (bl2) {
                if (this.b.s != null && this.b.t != null) {
                    try {
                        n n4 = n3;
                        ci.a(net.minecraft.s.b.a(this.b.s, this.b.t), new k(this, n4));
                    }
                    catch (Exception exception) {
                        net.minecraft.s.b.n();
                        f.a().b((Object)exception);
                        this.a("Failed to download resource pack!");
                    }
                } else {
                    ae ae2 = new ae(this.c, new i(this.c, n3));
                    ae2.b();
                    net.minecraft.s.b.a(ae2);
                }
            } else {
                this.a(net.minecraft.s.n.f("mco.errorMessage.connectionFailure"));
            }
        }
    }

    private void a(int n2) {
        try {
            Thread.sleep(n2 * 1000);
        }
        catch (InterruptedException interruptedException) {
            f.a().f(interruptedException.getLocalizedMessage());
        }
    }

    static /* synthetic */ net.minecraft.s.n a(j j2) {
        return j2.c;
    }
}

